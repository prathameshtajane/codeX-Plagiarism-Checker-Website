(function(){
    angular
        .module("PlagiarismChecker")
        .controller("AdminController", AdminController);
    
    function AdminController(UserService, $location, $routeParams,$route) {
        var vm = this;
        vm.getProfessors = getProfessors;
        vm.logout=logout;
        vm.addInApprovedProfessorList=addInApprovedProfessorList;
        vm.approveProfessors=approveProfessors;
        vm.rejectProfessors=rejectProfessors;
        vm.approvedProfessors=[];
        var userId = $routeParams['uid'];

        function logout() {
            UserService
                .logout()
                .then(function (res) {
                    $location.url("/login");
                },function (err) {
                    $location.url("/login");
                });
        }

        function getProfessors(){
            UserService
                .getProfessors()
                .then(function (res){
                    console.log(res);
                    vm.professors=res;
                    console.log("returned professors");
                },function (err){
                    console.log("error returned professors");
                });
        };
        getProfessors();


        function addInApprovedProfessorList(profId){
            if(vm.approvedProfessors.indexOf(profId) > -1){
            }else{vm.approvedProfessors.push(profId);}
            console.log(vm.approvedProfessors);
        }

        function approveProfessors(){
            console.log("Calling approved Professors");
            console.log(vm.approvedProfessors);
            UserService
                .approveProfessors(vm.approvedProfessors)
                .then(function (res){
                    console.log("returned approved professors");
                    $route.reload();
                },function (err){
                    console.log("error returned approved professors");
                });
        }
        
        function rejectProfessors(profId) {
            if(vm.approvedProfessors.indexOf(profId) > -1){
                var index = vm.approvedProfessors.indexOf(profId);
                vm.approvedProfessors.splice(index,1);
            }
        }

        function logout() {
            $location.url("/login");
        }
    }

})();
