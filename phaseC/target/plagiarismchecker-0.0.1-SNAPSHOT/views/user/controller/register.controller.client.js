(function(){
    angular
        .module("PlagiarismChecker")
        .controller("RegisterController", RegisterController);

    function RegisterController(UserService, $location, $scope) {
        var vm = this;
        vm.createUser = createUser;
        vm.goToProfile = goToProfile;
        vm.logout = logout;

        function createUser (user) {
            if($scope.registerNew.$valid){
                if(user.password === user.verifypassword)
                {
                    UserService
                        .findUserByUsername(user.username)
                        .then(function (usr) {
                            if(usr === "")
                                goToProfile(user);
                            else
                                vm.error = "Sorry Could not register";
                        });
                }
                else
                    vm.error = "Passwords mismatch.";
            }
            else{
                $scope.registerNew.submitted = true;
                vm.error ="Form Incomplete";
            }
        }

        function goToProfile(user){
            UserService
                .register(user)
                .then(function (usr) {
                    if(usr)
                        $location.url('/profile/'+ usr.id);
                    else
                        vm.error = "Sorry Could not register";
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
    }
})();