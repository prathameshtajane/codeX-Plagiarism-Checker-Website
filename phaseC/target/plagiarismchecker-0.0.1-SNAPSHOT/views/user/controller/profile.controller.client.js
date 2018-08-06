(function(){
    angular
        .module("PlagiarismChecker")
        .controller("ProfileController", ProfileController);

    function ProfileController(UserService, $location, $routeParams) {
        var vm = this;
        var userId = $routeParams['uid'];
        vm.update = update;
        vm.deleteUser = deleteUser;
        vm.openNav = openNav;
        vm.closeNav = closeNav;
        vm.goToHome = goToHome;
        vm.logout = logout;

        function openNav(type) {
            if(type === "Student"){
                document.getElementById("mySidenav").style.width = "250px";
                document.getElementById("main").style.marginLeft = "250px";
            }
            else if(type ==="Professor")
            {
                UserService
                    .findUserById(userId)
                    .then(function (user) {
                        vm.Tempuser = user;
                        if(vm.Tempuser.statusFlag === "true") {
                            document.getElementById("mySidenav1").style.width = "250px";
                            document.getElementById("main").style.marginLeft = "250px";
                        }
                    });
            }
            else if(type === "Admin") {
                UserService
                    .findUserById(userId)
                    .then(function (user) {
                        vm.Tempuser = user;
                        if(vm.Tempuser.statusFlag === "true") {
                            document.getElementById("mySidenav3").style.width = "250px";
                            document.getElementById("main").style.marginLeft = "250px";
                        }
                    });
                }
        }

        /* Set the width of the side navigation to 0 and the left margin of the page content to 0 */
        function closeNav(type) {
            if(type === "Student"){
                document.getElementById("mySidenav").style.width = "0";
                document.getElementById("main").style.marginLeft = "0";
            }
            else if(type === "Professor"){
                document.getElementById("mySidenav1").style.width = "0";
                document.getElementById("main").style.marginLeft = "0";
            }
            else if(type === "Admin"){
                document.getElementById("mySidenav3").style.width = "0";
                document.getElementById("main").style.marginLeft = "0";
            }
            else
            {
                document.getElementById("mySidenav2").style.width = "0";
                document.getElementById("main").style.marginLeft = "0";
            }
        }

        UserService
            .findUserById(userId)
            .then(function (user) {
                vm.user = user;
                openNav(vm.user.userType);
            });

        function update(newUser) {
            if(newUser.password === newUser.verifypassword) {
                UserService
                    .updateUser(newUser)
                    .then(function (user) {
                        if (user) {
                            vm.message = "User Successfully Updated!";
                            vm.error= null;
                        } else {
                            vm.error = "Unable to update user";
                            vm.message= null;
                        }
                    })
            }
            else{
                vm.error = "Password doesnt match.";
                vm.message= null;
            }

        }

        function deleteUser() {
            UserService
                .deleteUser(vm.userId);
        }

        function goToHome(){
            $location.url("/home")
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