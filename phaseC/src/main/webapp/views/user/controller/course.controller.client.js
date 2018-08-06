(function(){
    angular
        .module("PlagiarismChecker")
        .controller("CourseController", CourseController);

    function CourseController (UserService, CourseService, EnrollService, $location, $routeParams) {
        var vm = this;
        var userId = $routeParams['uid'];
        vm.openNav = openNav;
        vm.closeNav = closeNav;
        vm.createCourse = createCourse;
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

        function logout() {
            UserService
                .logout()
                .then(function (res) {
                    $location.url("/login");
                },function (err) {
                    $location.url("/login");
                });
        }

        function createCourse(course) {
            if(course === undefined || course.name === undefined )
                vm.error1 = "Course name not provided.";
            else{
                CourseService
                    .createCourse(course, vm.user.id)
                    .then(function (course) {
                        $location.url("/profile/"+vm.user.id+"/course");
                    });
            }
        }

        UserService
            .findUserById(userId)
            .then(function (user) {
                vm.user = user;
                if(vm.user.userType === 'Student') {
                    EnrollService
                        .findAllEnrollmentForUser(userId)
                        .then(function (enrollments) {
                            if(enrollments.length === 0)
                                vm.error = "No courses enrolled.";
                            else
                                vm.enrollments = enrollments;
                        });
                }
                else {
                    CourseService
                        .findAllCoursesForUser(userId)
                        .then(function (courses) {
                            if(courses.length === 0)
                                vm.error = "No courses created.";
                            else
                                vm.courses = courses;
                        });
                }
                openNav();
            });
    }
})();