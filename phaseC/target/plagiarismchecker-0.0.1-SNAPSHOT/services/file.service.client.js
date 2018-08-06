(function(){
    angular
        .module("PlagiarismChecker")
        .factory('FileService', FileService);

    function FileService($http) {

        var api = {
            "findAllFileForHomework": findAllFileForHomework
        };
        return api;

        function findAllFileForHomework (userId,courseId, hwId) {
            return $http.get("/rest/file/findAllHomeworkForCourse/?userId="+userId+"&courseId="+courseId+"&hwId="+hwId)
                .then(function(res){
                    return res.data;
                });
        }
    }
})();