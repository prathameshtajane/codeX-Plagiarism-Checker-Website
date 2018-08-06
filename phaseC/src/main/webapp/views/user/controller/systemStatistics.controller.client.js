(function(){
    angular
        .module("PlagiarismChecker")
        .controller("SystemStatisticsController", SystemStatisticsController);

    function SystemStatisticsController ($location, $routeParams, UserService, SystemStatisicsService) {
        var vm = this;
        vm.userId = $routeParams['uid'];
        vm.openNav = openNav;
        vm.closeNav = closeNav;
        vm.logout = logout;
        vm.healthData = [];
        vm.envData = [];
        vm.infoData = [];

        /**
         * open the naviation panel,
         * Set the width of the side navigation to 250 and the left margin of the page content to 250
         * @param type: type of the user
         */
        function openNav(type) {
            if (type === "Admin") {
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
            if(type === "Admin"){
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
         * fetch the user by ID, get system data
         */
        UserService
            .findUserById(vm.userId)
            .then(function (user) {
                vm.user = user;

                if (vm.user.userType === "Admin") {
                    SystemStatisicsService
                        .getSystemHealth()
                        .then(function (healthData) {
                            if(healthData.length === 0)
                                vm.error1 = "No system health statistics information available";
                            else {
                                vm.healthData = healthData;
                            }
                        });
                    SystemStatisicsService
                        .getSystemEnv()
                        .then(function (envData) {
                            if(envData.length === 0)
                                vm.error2 = "No system environment statistics information available";
                            else {
                                vm.envData = envData;
                            }
                        });
                    SystemStatisicsService
                        .getSystemInfo()
                        .then(function (infoData) {
                            vm.infoData = infoData;
                        });
                }
                openNav(vm.user.userType);
            });
    }
})();