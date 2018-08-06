(function () {
    angular
        .module("PlagiarismChecker")
        .config(configuration);

    function configuration($routeProvider) {
        $routeProvider
            .when("/", {
                templateUrl: 'views/user/template/login.client.html',
                controller: 'LoginController',
                controllerAs: 'model'
            })
            .when("/login", {
                templateUrl: 'views/user/template/login.client.html',
                controller: 'LoginController',
                controllerAs: 'model'
            })
            .when("/profile/admin/:aid",{
                templateUrl: 'views/user/template/admin.client.html',
                controller: 'AdminController',
                controllerAs: 'model',
            })
            .when("/profile/:uid/course/:cid/homework/:hid/fileupload",{
                templateUrl: 'views/user/template/fileUpload.client.html',
                controller: 'FileUploadController',
                controllerAs: 'model',
                resolve: {
                    loggedIn: checkLoggedIn
                }
            })
            .when("/profile/:uid/course/:cid/homework/:hid/submission", {
                templateUrl: 'views/user/template/submission.client.html',
                controller: 'SubmissionController',
                controllerAs: 'model',
                resolve: {
                    loggedIn: checkLoggedIn
                }
            })
            .when("/profile/:uid/course/:cid/homework/:hid/submission/:userid/type/:sid/summary", {
                templateUrl: 'views/user/template/report-summary.client.html',
                controller: 'ReportSummaryController',
                controllerAs: 'model',
                resolve: {
                    loggedIn: checkLoggedIn
                }
            })
            .when("/profile/:uid/course/:cid/homework/:hid/submission/:userid/type/:sid/summary/file1/:fid1/file2/" +
                ":fid2", {
                templateUrl: 'views/user/template/snippet.client.html',
                controller: 'SnippetController',
                controllerAs: 'model',
                resolve: {
                    loggedIn: checkLoggedIn
                }
            })
            .when("/register", {
                templateUrl: 'views/user/template/register.client.html',
                controller: 'RegisterController',
                controllerAs: 'model'
            })
            .when("/profile/:uid", {
                templateUrl: 'views/user/template/profile.client.html',
                controller: 'ProfileController',
                controllerAs: 'model',
                resolve: {
                    loggedIn: checkLoggedIn
                }
            })
            .when("/profile/:uid/course/", {
                templateUrl: 'views/user/template/course.client.html',
                controller: 'CourseController',
                controllerAs: 'model',
                resolve: {
                    loggedIn: checkLoggedIn
                }
            })
            .when("/profile/:uid/course/new", {
                templateUrl: 'views/user/template/course-new.client.html',
                controller: 'CourseController',
                controllerAs: 'model',
                resolve: {
                    loggedIn: checkLoggedIn
                }
            })
            .when("/profile/:uid/course/registerCourse", {
                templateUrl: 'views/user/template/enroll-course.client.html',
                controller: 'EnrollController',
                controllerAs: 'model',
                resolve: {
                    loggedIn: checkLoggedIn
                }
            })
            .when("/profile/:uid/course/:cid/homework/", {
                templateUrl: 'views/user/template/homework.client.html',
                controller: 'HomeWorkController',
                controllerAs: 'model',
                resolve: {
                    loggedIn: checkLoggedIn
                }
            })
            .when("/profile/:uid/course/:cid/homework/new", {
                templateUrl: 'views/user/template/homework-new.client.html',
                controller: 'HomeWorkController',
                controllerAs: 'model',
                resolve: {
                    loggedIn: checkLoggedIn
                }
            })
            .when("/profile/:uid/statistics", {
                templateUrl: 'views/user/template/usage-statistics.client.html',
                controller: 'UsageStatisticsController',
                controllerAs: 'model',
                resolve: {
                    loggedIn: checkLoggedIn
                }
            });

        function checkLoggedIn(UserService, $location, $q) {
            var deferred = $q.defer();
            UserService
                .loggedIn()
                .then(function (res) {
                    var user = res;
                    if (user === "") {
                        deferred.reject();
                        $location.url("/login");
                    } else {
                        deferred.resolve(user);
                    }
                }, function (err) {
                    deferred.reject();
                    $location.url("/login");
                });
            return deferred.promise;
        }
    }
})();