(function(){
    angular
        .module("PlagiarismChecker")
        .factory('UsageStatisicsService', UsageStatisicsService);

    function UsageStatisicsService($http) {

        var api = {
            "findAllUsageStatisticsByProfessor": findAllUsageStatisticsByProfessor,
            "addStatistics": addStatistics,
            "findAllUsageStatistics": findAllUsageStatistics
        };
        return api;

        /**
         * finds all usage statistics for the given userId
         * @param userId
         * @returns {PromiseLike<T> | Promise<T>}: usage statistics of the number of plagiarism detection cases run
         * by the respective userId
         */
        function findAllUsageStatisticsByProfessor(userId) {
            return $http.get("/rest/usagestatistics/findAllUsageStatisticsSummary/?userId="+userId)
                .then(function(res){
                    return res.data;
                });
        }

        /**
         * finds all usage statistics for the given userId
         * @param userId
         * @returns {PromiseLike<T> | Promise<T>}: usage statistics of the number of plagiarism detection cases run
         * by the respective userId
         */
        function findAllUsageStatistics() {
            return $http.get("/rest/usagestatistics/findAllSummary")
                .then(function(res){
                    return res.data;
                });
        }

        /**
         * saves usage statistics of the number of plagiarism detection cases run
         * @param professor: User who is running the plagiarism detection
         * @param student: User whose homework is being compared
         * @param course
         * @param homework
         * @param compareCount: count of the homework file comparisons done
         * @param algoType: comparison algorithm used for this compare run
         * @returns {PromiseLike<T> | Promise<T>}
         */
        function addStatistics(professor, student, course, homework, compareCount, algoType) {
            var usageData = {
                professor: professor,
                student: student,
                course: course,
                homework: homework,
                compareCount: compareCount,
                algoType: algoType
            };
            return $http.post("/rest/usagestatistics/registerStats", usageData)
                .then(function(res){
                    return res.data;
                });
        }
    }
})();