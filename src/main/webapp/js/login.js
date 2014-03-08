/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function LoginControl($scope, $http) {
    $scope.doLogin = function() {
        alert($scope.loginId ? 'こんにちは' + $scope.loginId + 'さん' : '何か入力してね');
    }
}




