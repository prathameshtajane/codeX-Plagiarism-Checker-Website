(function(){
    angular
        .module("PlagiarismChecker")
        .factory('SystemStatisicsService', SystemStatisicsService);

    function SystemStatisicsService($http) {

        var api = {
            "getSystemHealth": getSystemHealth,
            "getSystemEnv": getSystemEnv,
            "getSystemInfo": getSystemInfo
        };
        return api;

        function getSystemHealth() {
            return $http.get("/actuator/health")
                .then(function(res){
                    return res.data;
                });
        }

        function getSystemEnv() {
            return $http.get("/actuator/env")
                .then(function(res){
                    return res.data;
                });
        }

        function getSystemInfo() {
            return $http.get("/actuator/info")
                .then(function(res){
                    return res.data;
                });
        }
    }
})();