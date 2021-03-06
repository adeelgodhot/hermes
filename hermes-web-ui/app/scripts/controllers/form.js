(function(module) {
    'use strict';

    try {
        module = angular.module('hermes.ui.controller');
    } catch (e) {
        module = angular.module('hermes.ui.controller', []);
    }

    module.controller('FormCtrl', function ($rootScope, $scope, $stateParams, $alert, $timeout, FormSvc) {
        $scope.forms = [];
        $scope.field = {};
        $scope.lookup = '';
        $scope.width = null;
        $scope.loading = true;
        $scope.mode = 'text/x-mysql';

        $scope.databases = [
            {'name': 'auswertung'},
            {'name': 'lcarb'}
        ];

        $scope.types = [
            {'name': 'Date', 'code': 'DATE'},
            {'name': 'Datetime', 'code': 'DATETIME'},
            {'name': 'Text', 'code': 'TEXT'},
            {'name': 'Text', 'code': 'NUMBER'},
            {'name': 'Boolean', 'code': 'BOOLEAN'}
        ];

        $scope.cmOptions = {
            lineNumbers: true,
            indentWithTabs: false,
            theme: 'twilight',
            mode: 'sql'
        };

        $scope.refresh = function() {
            // NOTE: trick, more details here http://stackoverflow.com/questions/22333953/how-to-refresh-codemirror-with-ui-codemirror-and-angularjs
            $scope.refreshCodemirror = true;
            $timeout(function () {
                $scope.refreshCodemirror = false;
            }, 100);
        };

        $scope.list = function() {
            $scope.loading = true;
            return FormSvc.list().success(function(data) {
                $scope.forms = data;
                $scope.loading = false;
            });
        };

        $scope.addLookup = function() {
            if(!$scope.field.lookup) {
                $scope.field.lookup = [];
            }

            $scope.field.lookup.push(angular.copy($scope.lookup));
            $scope.lookup = '';
        };

        $scope.removeLookup = function(index) {
            if($scope.field.lookup) {
                $scope.field.lookup.splice(index, 1);
            }
        };

        $scope.addWidth = function() {
            if(!$scope.form.widths) {
                $scope.form.widths = [];
            }

            $scope.form.widths.push(angular.copy($scope.width));
            $scope.width = null;
        };

        $scope.removeWidth = function(index) {
            if($scope.form.widths) {
                $scope.form.widths.splice(index, 1);
            }
        };

        $scope.add = function() {
            if(!$scope.form.fields) {
                $scope.form.fields = [];
            }

            $scope.field.formId = $scope.form.id;

            $scope.form.fields.push(angular.copy($scope.field));
            $scope.field = {};
        };

        $scope.reset = function() {
            $scope.form = {};
            $scope.field = {};
        };

        $scope.resetField = function() {
            $scope.field = {};
        };

        $scope.save = function() {
            $scope.loading = true;
            FormSvc.save($scope.form).success(function(data) {
                $scope.form = data;
                $scope.list().then(function() {
                    $alert({content: 'Form saved: ' + $scope.form.name, placement: 'top', type: 'success', show: true, duration: 3});
                    $rootScope.$broadcast('form.reload');
                });
            });
        };

        $scope.removeForm = function(id) {
            FormSvc.remove({id: (id ? id : $scope.form.id)}).success(function(data) {
                $scope.list().then(function() {
                    $alert({content: 'Form deleted: ' + $scope.form.name, placement: 'top', type: 'success', show: true, duration: 3});
                });
            });
        };

        $scope.removeField = function(index) {
            var id = angular.copy($scope.form.fields[index].id);
            if(id) {
                FormSvc.removeField({id: id}).success(function(data) {
                    $alert({content: 'Field deleted: ' + index, placement: 'top', type: 'success', show: true, duration: 3});
                    $scope.list();
                }).error(function(data) {
                    $alert({content: 'Error while deleting file: ' + index, placement: 'top', type: 'danger', show: true, duration: 3});
                });
            }
            // else?!?
            $scope.form.fields.splice(index, 1);
        };

        $scope.select = function(field) {
            $scope.field = field;
        };

        $scope.list().then(function() {
            angular.forEach($scope.forms, function(form) {
                if(form.id===$stateParams.id) {
                    $scope.form = form;
                    $scope.refresh();
                }
            });
        });
    }).controller('FormListCtrl', function ($scope, $alert, FormSvc) {
        $scope.loading = true;

        $scope.list = function() {
            return FormSvc.list().success(function(data) {
                $scope.forms = data;
                $scope.loading = false;
            });
        };

        $scope.removeForm = function(id) {
            $scope.loading = true;
            FormSvc.remove({id: id}).success(function(data) {
                $scope.list().then(function() {
                    $alert({content: 'Form deleted: ' + $scope.form.name, placement: 'top', type: 'success', show: true, duration: 3});
                });
            });
        };

        $scope.list();
    }).controller('FormExecuteCtrl', function ($scope, $log, $stateParams, $alert, FormSvc, ReportSvc) {
        $scope.executing = false;
        $scope.loading = true;

        $scope.execute = function() {
            $scope.params['_form'] = $scope.form.name;
            $scope.executing = true;
            FormSvc.query($scope.params).success(function(data) {
                $scope.executing = false;
                $scope.result = data;
            }).error(function(data) {
                $scope.executing = false;
                $alert({content: 'Execution failed! Check input parameters.', placement: 'top', type: 'danger', show: true, duration: 5});
            });
        };

        $scope.report = function() {
            $scope.params['_form'] = $scope.form.name;
            $scope.executing = true;
            // NOTE: see details here http://blog-it.hypoport.de/2014/08/19/how-to-open-async-calls-in-a-new-tab-instead-of-new-window-within-an-angularjs-app/
            //var tabWindowId = window.open('about:blank', '_blank');
            ReportSvc.report($scope.params).success(function(data) {
                $scope.executing = false;
                //$log.info('Read  with ' + data.byteLength + ' bytes in a variable of type ' + typeof(data));
                //var file = new Blob([data], { type: 'application/pdf' });
                //var fileURL = URL.createObjectURL(file);
                $log.info('PDF: ' + data.id);
                window.open('api/reports/pdf/' + data.id, '_blank');
            }).error(function(data) {
                $scope.executing = false;
                $alert({content: 'Execution failed! Check input parameters.', placement: 'top', type: 'danger', show: true, duration: 5});
                tabWindowId.close();
            });
        };

        $scope.list = function() {
            $scope.loading = true;
            return FormSvc.list().success(function(data) {
                $scope.forms = data;
                $scope.loading = false;
            });
        };

        $scope.list().then(function() {
            angular.forEach($scope.forms, function(form) {
                if(form.id===$stateParams.id) {
                    $scope.form = form;
                    $scope.params = {};
                    angular.forEach(form.fields, function(field) {
                        if(field && field.parameter) {
                            var val = field.fieldType==='BOOLEAN' ? (field.defValue==='true') : field.defValue;
                            $scope.params[field.name] = val;
                        }
                    });
                }
            });
        });

        //FormSvc.synchronize($scope);
    });
})();
