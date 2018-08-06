(function(){
    angular
        .module("PlagiarismChecker")
        .controller("ReportSummaryController", ReportSummaryController);

    function ReportSummaryController (ReportService, $location, $routeParams, UserService, UsageStatisicsService) {
        var vm = this;
        vm.userId = $routeParams['uid'];
        vm.studentId = $routeParams['userid'];
        vm.hwId = $routeParams['hid'];
        vm.sId = $routeParams['sid'];
        vm.courseId = $routeParams['cid'];
        vm.orderByField = 'percentageCompareHashMap';
        vm.openNav = openNav;
        vm.closeNav = closeNav;
        vm.logout = logout;
        vm.getDetailedReport = getDetailedReport;
        vm.algoType = "HashMap";
        switch (vm.sId) {
            case "2": vm.algoType = "Trees";
                break;
            case "3": vm.algoType = "LevenshteinDistance";
                break;
            case "4": vm.algoType = "All";
                break;
            default: vm.algoType = "HashMap";
                break;
        }


        function openNav(type) {
            if(type === "Professor"){
                document.getElementById("mySidenav").style.width = "250px";
                document.getElementById("main").style.marginLeft = "250px";
            }
        }

        /* Set the width of the side navigation to 0 and the left margin of the page content to 0 */
        function closeNav(type) {
            if(type === "Professor"){
                document.getElementById("mySidenav").style.width = "0";
                document.getElementById("main").style.marginLeft = "0";
            }
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

        function getDetailedReport(file1Id, file2Id) {
            $location.url('/profile/'+ vm.userId + '/course/' + vm.courseId + '/homework/' + vm.hwId + '/submission/'
                + vm.studentId + '/type/' + vm.sId + '/summary/file1/'+ file1Id + '/file2/' + file2Id);
        }

        /**
         * find plagiarism report summary by comparing the current student's homework with all other student's
         * who have submitted the same homework assignment for the registered course.
         * the generated report is then saved as usage statistics
         */
        ReportService
            .findAllReportSummary(vm.studentId, vm.hwId)
            .then(function (reports) {
                vm.reverseSort = false;
                console.log(reports);
                if(reports.length === 0)
                    vm.error = "No reports.";
                else {
                    vm.reports = reports;
                    UsageStatisicsService.addStatistics(vm.reports["0"].file1.course.user,
                        vm.reports["0"].file1.user, vm.reports["0"].file1.course,
                        vm.reports["0"].file1.homework, vm.reports.length, vm.algoType);
                }
                openNav("Professor");
            });
    }
})();