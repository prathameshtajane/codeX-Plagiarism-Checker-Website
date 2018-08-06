(function(){
    angular
        .module("PlagiarismChecker")
        .controller("UsageStatisticsController", UsageStatisticsController);

    function UsageStatisticsController ($location, $routeParams, UserService, UsageStatisicsService) {
        var vm = this;
        vm.userId = $routeParams['uid'];
        vm.openNav = openNav;
        vm.closeNav = closeNav;
        vm.logout = logout;
        vm.reports = []

        /**
         * open the naviation panel,
         * Set the width of the side navigation to 250 and the left margin of the page content to 250
         * @param type: type of the user
         */
        function openNav(type) {
            if(type === "Professor"){
                document.getElementById("mySidenav").style.width = "250px";
                document.getElementById("main").style.marginLeft = "250px";
            } else if (type === "Admin") {
                document.getElementById("mySidenav").style.width = "250px";
                document.getElementById("main").style.marginLeft = "250px";
            }
        }

        /**
         * open the naviation panel,
         * Set the width of the side navigation to 0 and the left margin of the page content to 0
         * @param type: type of user
         */
        function closeNav(type) {
            if(type === "Professor"){
                document.getElementById("mySidenav").style.width = "0";
                document.getElementById("main").style.marginLeft = "0";
            }
        }

        /**
         * Navigate back to login page
         */
        function logout() {
            UserService
                .logout()
                .then(function (res) {
                    $location.url("/login");
                },function (err) {
                    $location.url("/login");
                });
        }

        /**
         * fetch the user by ID
         */
        UserService
            .findUserById(vm.userId)
            .then(function (user) {
                vm.user = user;

                if (vm.user.userType === "Admin") {
                    UsageStatisicsService
                        .findAllUsageStatistics()
                        .then(function (reports) {
                            if(reports.length === 0)
                                vm.error = "No usage statistics information obtained. Please run comparison on submissions!";
                            else {
                                vm.reports = reports;
                            }
                        });
                } else {
                    UsageStatisicsService
                        .findAllUsageStatisticsByProfessor(vm.userId)
                        .then(function (reports) {
                            if(reports.length === 0)
                                vm.error = "No usage statistics information obtained. Please run comparison on submissions!";
                            else {
                                vm.reports = reports;
                            }
                        });
                }
                openNav(vm.user.userType);
            });

        /**
         * find all usage statistics of the number of plagiarism detection cases run for the
         * current user(Professor in this case)
         */
        // UsageStatisicsService
        //     .findAllUsageStatisticsByProfessor(vm.userId)
        //     .then(function (reports) {
        //         if(reports.length === 0)
        //             vm.error = "No usage statistics information obtained. Please run comparison on submissions!";
        //         else {
        //             vm.reports = reports;
        //         }
        //         openNav("Professor");
        //     });

    }
})();