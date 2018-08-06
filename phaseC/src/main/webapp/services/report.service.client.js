(function(){
    angular
        .module("PlagiarismChecker")
        .factory('ReportService', ReportService);

    function ReportService($http) {

        var api = {
            "findAllReportSummary": findAllReportSummary,
            "getDetailedReport": getDetailedReport
        };
        return api;

        function findAllReportSummary(userId, hwId) {
            return $http.get("/rest/report/findAllReportSummary/?userId="+userId+"&hwId="+hwId)
                .then(function(res){
                    return res.data;
                });
        }

        function getDetailedReport(file1Id, file2Id) {
            return $http.get("/rest/report/getDetailedReport/?file1Id="+file1Id+"&file2Id="+file2Id)
                .then(function(res){
                    return res.data;
                });
        }
    }
})();