(function(){
    angular
        .module("PlagiarismChecker")
        .controller("HomeWorkController", HomeWorkController);

    function HomeWorkController (UserService, HomeworkService, $location, $routeParams) {
        var vm = this;
        var userId = $routeParams['uid'];
        vm.courseId = $routeParams['cid'];
        vm.openNav = openNav;
        vm.closeNav = closeNav;
        vm.createHomework = createHomework;
        vm.logout = logout;

        function openNav() {
            document.getElementById("mySidenav").style.width = "250px";
            document.getElementById("main").style.marginLeft = "250px";
        }

        /* Set the width of the side navigation to 0 and the left margin of the page content to 0 */
        function closeNav() {
            document.getElementById("mySidenav").style.width = "0";
            document.getElementById("main").style.marginLeft = "0";
        }

        function createHomework(homework) {
            HomeworkService
                .createHomework(homework, vm.user.id, vm.courseId)
                .then(function (homework) {
                    $location.url("/profile/"+vm.user.id+"/course/"+vm.courseId+"/homework");
                });
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
            .then(function (usr) {
                vm.user = usr;
                HomeworkService
                    .findAllHomeworkForCourse(vm.courseId)
                    .then(function (homeworks) {
                        if(homeworks.length === 0)
                            vm.error = "No Homework created.";
                        else
                            vm.homeworks = homeworks;
                        openNav();
                    });
            });
    }
})();