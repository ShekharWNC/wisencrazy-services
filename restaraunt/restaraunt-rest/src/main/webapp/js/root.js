var app=angular.module("shop",[]);
app.controller("HomeController",function($scope,$rootScope){
	$scope.initAll=function(){
		$scope.selectedTab = "login";
		$scope.date = Date('hh');
		 $scope.getLocation();
		 $scope.restaurantData={"restaurantName":"Jiyo Natural","imgPath":"../img/food.jpg","ratings":"2","lastReview":"Food is good"};
		// if($scope.date.getHours()>=7 && $scope.date.getHours()<=11){
		// 	$scope.foodReady="Now Your Breakfast Is Ready";
		// }else if($scope.date.getHours()>11 && $scope.date.getHours()<=15){
		// 	$scope.foodReady="Now Your Lunch Is Ready";
		// }else if($scope.date.getHours()>15 && $scope.date.getHours()<=17){
		// 	$scope.foodReady="Now Your Snacks Is Ready";
		// }else if($scope.date.getHours()>17 && $scope.date.getHours()<=20){
		// 	$scope.foodReady="Now Your Dinner Is Ready";
		// }else if($scope.date.getHours()<7 && $scope.date.getHours()>21){
		// 	$scope.foodReady="Free Hour";
		// }
	}
	
	$scope.getLocation=function() {
		if (navigator.geolocation) {
			navigator.geolocation.getCurrentPosition($scope.showPosition);
		} else { 
			x.innerHTML = "Geolocation is not supported by this browser.";
		}
	}

	 $scope.showPosition=function(position) {
	    $scope.latitudePosition= position.coords.latitude ;
	    $scope.longitudePosition=position.coords.longitude;	
	}
	
	$scope.initAll();
	
	
	
	function onSignIn(googleUser) 
    {
        // var myParams = {
        //    'clientid' : "10729869381-d1j12631kms40f6tpiha765eh9bjiu7o.apps.googleusercontent.com",
        //    'cookiepolicy' : 'single_host_origin',
        //    'callback' : 'mySignInCallback',
        //    'scope' : 'https://www.googleapis.com/auth/plus.login email'
        //    // Additional parameters
        //  };
         var profile = googleUser.getBasicProfile();
        console.log("ID: " + profile.getId()); // Don't send this directly to your server!
        console.log("Name: " + profile.getName());
        console.log("Image URL: " + profile.getImageUrl());
        console.log("Email: " + profile.getEmail());

    };

    $scope.loadTab = function(t) {
        $scope.selectedTab = t;
    }
    $scope.selectedTab = "login";
   
})