var app=angular.module("shop",[]);
app.controller("HomeController",function($scope,$rootScope,$http){
	$scope.initAll=function(){
		$scope.selectedTab = "login";
		$scope.signUp={
			"sid": null,
			"id": null,
			"email": null,
			"password": null,
			"primaryContact": null,
			"name": null,
			"accountStatus": null,
			"signupType": "restaraunt",
			"isShow": false,
			"show": false,
			"googleAccessToken":null
		  };
		  $scope.nearBy={
						  "latitude": null,
						  "longitude": null,
						  "distance": 8,
						  "areaSid": null,
						  "stateSid": null,
						  "timings": "BR"
						};
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
		$scope.getStates();
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
			case "getCity":
				console.log(data);
				break;
			case "getArea":
				
				break;
			case "getAllStates":
				$currentState=data[0].stateName;
				$scope.getCities($currentState);
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
			case "getCity":
				
				break;
			case "getArea":
				
				break;
			case "getAllStates":
				console.log(data);
				break;
        }
    }
	
	$scope.getLocation=function() {
		if (navigator.geolocation) {
			navigator.geolocation.getCurrentPosition($scope.showPosition);
		} else { 
			x.innerHTML = "Geolocation is not supported by this browser.";
		}
	}

	$scope.showPosition=function(position) {
	    $scope.nearBy.latitude= position.coords.latitude ;
	    $scope.nearBy.longitude=position.coords.longitude;	
	};
	
	$rootScope.googlesignup = function(userData)
    {
		$scope.userData = userData ;
       if ($scope.userData && $scope.userData.email && $scope.userData.googleAccessToken && $scope.userData.name) {
               $scope.remoteCommunication(CONSTANTS.RESTAPIS.SIGNUPWITHGOOGLE, "POST",$scope.signUp, {'Content-type': 'application/json'}, null, "AuthenticationAction");
       }
    }
    
    $rootScope.onSignIn=function(googleUser) {
                // Useful data for your client-side scripts:
                var profile = googleUser.getBasicProfile();
               
                $scope.signUp.name=profile.getName();
                $scope.signUp.googleAccessToken=profile.getName();
                $scope.signUp.email= profile.getEmail();
                $rootScope.googlesignup($scope.signUp);
    };
    
	
    googleSignInSuccess = $rootScope.onSignIn;
	
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
    };
    
	$scope.getCities = function(stateName)
    {
        if ( stateName) {
			$scope.remoteCommunication(CONSTANTS.RESTAPIS.CITYBYSTATENAME + stateName, "GET",null, {'Content-type': 'application/json'}, null, "getCity");
        }else{
			alert(CONSTANTS.MESSAGES.STATENOTFOUND);
		}
    };
	
	$scope.getAreas = function(citySid)
    {
        if (citySid) {
			$scope.remoteCommunication(CONSTANTS.RESTAPIS.AREABYCITY + citySid, "GET",null, {'Content-type': 'application/json'}, null, "getArea");
        }else{
			alert(CONSTANTS.MESSAGES.STATENOTFOUND);
		}
    };
	
	$scope.getStates = function()
    {
		$scope.remoteCommunication(CONSTANTS.RESTAPIS.GETALLSTATES, "GET",null, {'Content-type': 'application/json'}, null, "getAllStates");
    };
	
    $scope.loadTab = function(t) {
        $scope.selectedTab = t;
    }
    $scope.selectedTab = "login";
	$scope.initAll();
});
