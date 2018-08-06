(function(){
    angular
        .module("PlagiarismChecker")
        .controller("SnippetController", SnippetController);

    function SnippetController (UserService, ReportService, $routeParams, $location) {
        var vm = this;
        var userId = $routeParams['uid'];
        vm.hwId = $routeParams['hid'];
        vm.studentId = $routeParams['userid'];
        vm.courseId = $routeParams['cid'];
        vm.fileId1 = $routeParams['fid1'];
        vm.fileId2 = $routeParams['fid2'];
        vm.type = $routeParams['sid'];
        vm.openNav = openNav;
        vm.closeNav = closeNav;
        vm.logout = logout;

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
                openNav(vm.user.userType);
            });


        ReportService
            .getDetailedReport(vm.fileId1, vm.fileId2)
            .then(function (divs) {
                vm.myFile1 = divs[0];
                vm.myFile2 = divs[1];
            });
    }

})();