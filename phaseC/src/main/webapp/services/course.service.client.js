(function(){
    angular
        .module("PlagiarismChecker")
        .factory('CourseService', CourseService);

    function CourseService($http) {

        var api = {
            "findAllCoursesForUser": findAllCoursesForUser,
            "createCourse": createCourse,
            "findAllCoursesNotEnrolledByUser": findAllCoursesNotEnrolledByUser
        };
        return api;

        function findAllCoursesForUser (userId) {
            return $http.get("/rest/course/findAllCoursesForUser/?userId="+userId)
                .then(function(res){
                    return res.data;
                });
        }

        function findAllCoursesNotEnrolledByUser (user) {
            return $http.post("/rest/course/findAllCoursesNotEnrolledByUser", user)
                .then(function(res){
                    return res.data;
                });
        }

        function createCourse(course, userId) {
            return $http.post("/rest/course/create/?userId="+userId, course)
                .then(function(res){
                    return res.data;
                });
        }
    }
})();