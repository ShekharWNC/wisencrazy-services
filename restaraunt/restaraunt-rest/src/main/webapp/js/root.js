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
	
	$scope.getNearestLocation = function()
    {
        if ( $scope.latitudePosition && $scope.longitudePosition) {
			$scope.axisJson={
				"latitude": $scope.latitudePosition,
				"longitude": $scope.longitudePosition,
				"distance": "8",
				"areaSid": null,
				"stateSid": null,
				"timings": "BR"
			}
			$scope.remoteCommunication(CONSTANTS.RESTAPIS.SEARCHNEARBY, "POST",$scope.axisJson, {'Content-type': 'application/json'}, null, "getNear");

        }
    }
    
		
//This method used to send request and receive response over http
    $rootScope.remoteCommunication = function(requestUrl, requestMethod, data, header, optionalData, callBackOption)
    {
	$http({method: requestMethod, url: requestUrl, data:data, headers: header}).
        success(function(data, status, headers, config)
        {
            $scope.httpSuccess(callBackOption, data, optionalData);
        }).
        error(function(data, status, headers, config)
        {
            $scope.httpError(callBackOption, data, optionalData);
        });
    }


    /*
	** This method used to execute the process based on remoteCommunication response
	** If "remoteCommunication" response are success then this method get injected & execute the process based on "callBackOption"
    */
    $scope.httpSuccess = function(callBackOption, data, optionalData)
    {
        switch(callBackOption)
        {
      	    case "getNear":
                alert(data);
      	    break;
        }   
    }
    

     /*
	** This method used to execute the process based on http response
	** If "remoteCommunication" response are failed then this method get injected & execute the process based on "callBackOption"
    */
    $scope.httpError = function(callBackOption, data, optionalData)
    {
        switch(callBackOption)
        {
		    case "getNear":
	               alert(data.errorMessage);
		    break;
        }
    }
	
	
	
    $scope.loadTab = function(t) {
        $scope.selectedTab = t;
    }
    $scope.selectedTab = "login";
	$scope.initAll();
})