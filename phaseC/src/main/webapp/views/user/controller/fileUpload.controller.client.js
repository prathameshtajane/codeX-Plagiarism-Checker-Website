(function(){
    angular
        .module("PlagiarismChecker")
        .controller("FileUploadController", FileUploadController);

    function FileUploadController(FileUploader, UserService, FileService, $location, $routeParams) {
        var vm = this;
        var userId = $routeParams['uid'];
        vm.courseId = $routeParams['cid'];
        var hwId = $routeParams['hid'];
        vm.openNav = openNav;
        vm.closeNav = closeNav;
        vm.logout = logout;
        vm.uploader = new FileUploader({url:"/rest/file/upload/?userId="+userId+"&courseId="+vm.courseId+"&hwId="+hwId});

        $('#fileUploadButton').click(function(event) {
            $('#fileDialog').click();
        });

        $('#folderUploadButton').click(function(event) {
            $('#folderDialog').click();
        });

        //Filter for uploading only python files.
        vm.uploader.filters.push({
            name:'pythonFilter',
            fn: function(item, options){
                var allowedExtensions = ['py'];
                var ext = item.name.split('.').pop();
                return allowedExtensions.indexOf(ext) !== -1;
            }
        });

        function openNav() {
            document.getElementById("mySidenav").style.width = "250px";
            document.getElementById("main").style.marginLeft = "250px";
        }

        /* Set the width of the side navigation to 0 and the left margin of the page content to 0 */
        function closeNav() {
            document.getElementById("mySidenav").style.width = "0";
            document.getElementById("main").style.marginLeft = "0";
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

        UserService
            .findUserById(userId)
            .then(function (user) {
                vm.user = user;
                FileService
                    .findAllFileForHomework(userId, vm.courseId, hwId)
                    .then(function (files) {
                        if (files.length === 0)
                            vm.fileExists = false;
                        else {
                            vm.fileExists = true;
                            vm.message = "Homework already uploaded."
                        }
                    });
            });
    }
})();