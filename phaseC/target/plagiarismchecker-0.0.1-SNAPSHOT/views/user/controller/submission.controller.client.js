(function(){
    angular
        .module("PlagiarismChecker")
        .controller("SubmissionController", SubmissionController);

    function SubmissionController (UserService, $location, $routeParams, $scope) {
        var vm = this;
        var userId = $routeParams['uid'];
        var hwId = $routeParams['hid'];
        vm.courseId = $routeParams['cid'];
        vm.openNav = openNav;
        vm.closeNav = closeNav;
        vm.checkPlagiarism = checkPlagiarism;
        vm.logout = logout;
        $scope.myVar = 1;

        function openNav(type) {
            if(type === "Professor"){
                document.getElementById("mySidenav").style.width = "250px";
                document.getElementById("main").style.marginLeft = "250px";
            }
        }

        /* Set the width of the side navigation to 0 and the left margin of the page content to 0 */
        function closeNav(type) {
            if(type === "Professor"){
                document.getElementById("mySidenav").style.width = "0";
                document.getElementById("main").style.marginLeft = "0";
            }
        }

        function checkPlagiarism(user) {
            $location.url('/profile/'+vm.user.id+'/course/'+vm.courseId+'/homework/'+hwId+'/submission/'+user.id+'/type/'+$scope.myVar+'/summary');
        }

        function logout() {
            UserService
                .logout()
                .then(function (res) {
                    $location.url("/login");
                },function (err) {
                    $location.url("/login");
                });
        }

        UserService
            .findUserById(userId)
            .then(function (user) {
                vm.user = user;
                UserService
                    .getDistinctUsersForHw(hwId)
                    .then(function (users) {
                        if(users.length === 0)
                            vm.error = "No submission.";
                        else
                            vm.users = users;
                        });
                openNav(vm.user.userType);
            });
        }

})();