(function(){
    angular
        .module("PlagiarismChecker")
        .controller("EnrollController", EnrollController);

    function EnrollController (UserService, CourseService, EnrollService, $location, $routeParams) {
        var vm = this;
        var userId = $routeParams['uid'];
        vm.openNav = openNav;
        vm.closeNav = closeNav;
        vm.enrollCourse = enrollCourse;
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

        function enrollCourse(course) {
            EnrollService
                .createEnrollment(course, userId)
                .then(function (enroll) {
                    $location.url("/profile/"+userId+"/course");
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
            .then(function (user) {
                vm.user = user;
                CourseService
                    .findAllCoursesNotEnrolledByUser(user)
                    .then(function (courses) {
                        if(courses.length === 0)
                            vm.error = "No courses to enroll.";
                        else
                            vm.courses = courses;
                        openNav();
                    });
            });
    }
})();