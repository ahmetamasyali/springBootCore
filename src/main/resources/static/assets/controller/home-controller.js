var app = angular.module('homeApp', ['ui.router','angular-growl']);

app.config([
	'$stateProvider',
	'$urlRouterProvider',
	function($stateProvider, $urlRouterProvider) {

		$stateProvider
		.state('home', {
			url: '/',
			templateUrl: "assets/views/main.html",
			controller: "homeCtrl"
		});

		$urlRouterProvider.otherwise('/');
	}]);



app.controller('homeCtrl', ['$scope','$http','growl', function($scope,$http,growl) {
	

	
	$scope.isLoggedIn = isLoggedIn;
	$scope.username = username;

	$scope.logout = function(){
		window.location.href = "/logout";
	}




}]);

