(function(){
    angular
        .module("PlagiarismChecker")
        .controller("LoginController", LoginController);

    function LoginController(UserService, $location) {
        var vm = this;
        vm.login = login;

        function login(user) {
            UserService
                .login(user)
                .then(function (loginUser) {
                    if(loginUser !== "")
                            $location.url('/profile/'+ loginUser.id);
                        else
                            vm.error = "User not found."
                });
        }
    }
})();