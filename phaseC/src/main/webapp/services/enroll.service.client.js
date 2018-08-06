(function(){
    angular
        .module("PlagiarismChecker")
        .factory('EnrollService', EnrollService);

    function EnrollService($http) {

        var api = {
            "findAllEnrollmentForUser": findAllEnrollmentForUser,
            "createEnrollment": createEnrollment
        };
        return api;

        function findAllEnrollmentForUser (userId) {
            return $http.get("/rest/enroll/findAllEnrollmentForUser/?userId="+userId)
                .then(function(res){
                    return res.data;
                });
        }

        function createEnrollment(course, userId) {
            return $http.post("/rest/enroll/create/?userId="+userId, course)
                .then(function(res){
                    return res.data;
                });
        }
    }
})();