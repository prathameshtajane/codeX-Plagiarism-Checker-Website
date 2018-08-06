(function(){
    angular
        .module("PlagiarismChecker")
        .factory('UserService', UserService);

    function UserService($http) {

        var api = {
            "login": login,
            "logout": logout,
            "findUserByUsername": findUserByUsername,
            "register": register,
            "findUserById": findUserById,
            "findProfessor": findProfessor,
            "updateUser": updateUser,
            "getDistinctUsersForHw":getDistinctUsersForHw,
            "loggedIn":loggedIn,
            "getProfessors":getProfessors,
            "approveProfessors":approveProfessors
        };
        return api;

        function login(user) {
            return $http.post("/rest/user/login", user)
                .then(function(res){
                    return res.data;
                });
        }

        function logout() {
            return $http.get("/rest/user/logout")
                .then(function(res){
                    return res.data;
                });
        }

        function loggedIn() {
            return $http.get("/rest/user/loggedIn")
                .then(function(res){
                    return res.data;
                });
        }

        function updateUser(newUser) {
            return $http.put("/rest/user/update", newUser)
                .then(function(res){
                    return res.data;
                });
        }

        function findUserByUsername(username) {
            return $http.get("/rest/user/findUserByUsername?username="+username)
                .then(function(res){
                    return res.data;
                });
        }

        function findUserById(userId) {
            return $http.get("/rest/user/findUserByUserId/?userId="+userId)
                .then(function(res){
                    return res.data;
                });
        }

        function register(user) {
            return $http.post("/rest/user/registerUser", user)
                .then(function(res){
                    return res.data;
                });
        }

        function findProfessor() {
            return $http.get("/rest/user/findProfessor")
                .then(function(res){
                    return res.data;
                });
        }

        function getDistinctUsersForHw(hwId) {
            return $http.get("/rest/file/getUser/?hwId="+hwId)
                .then(function(res){
                    return res.data;
                });
        }

        function getProfessors() {
            return $http.get("/rest/user/findProfessors")
                .then(function(res){
                    return res.data;
                });
        }

        function approveProfessors(approvedProfessorsId){
            return $http.post("/rest/user/setUserStatus", approvedProfessorsId)
                .then(function(res){
                    return res.data;
                });
        }
    }
})();