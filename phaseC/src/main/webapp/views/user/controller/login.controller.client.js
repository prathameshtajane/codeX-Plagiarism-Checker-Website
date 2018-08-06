(function(){
    angular
        .module("PlagiarismChecker")
        .controller("LoginController", LoginController);

    function LoginController(UserService, $location) {
        var vm = this;
        vm.login = login;

        function login(user) {
            if(user === undefined || user.username === undefined || user.password === undefined)
                vm.error = "All fields are mandatory.";
            else {
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
    }
})();