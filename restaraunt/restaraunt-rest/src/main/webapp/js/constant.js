var HOST = window.location.origin+":80"; 
var CONSTANTS = (function(){
    //Application RESTfulApi's
    this.RESTAPIS = (function()
    {
        //Common API's
        this.SEARCHNEARBY = HOST + "/restaraunt-rest-0.0.1.local-SNAPSHOT/rest/restaraunt/search/nearby";
        this.CITYBYSTATENAME = HOST +"/restaraunt-rest-0.0.1.local-SNAPSHOT/rest/restaraunt/cities/state/";
        this.AREABYCITY = HOST +"/restaraunt-rest-0.0.1.local-SNAPSHOT/rest/restaraunt/areas/city/";
        this.SIGNUPWITHGOOGLE = HOST +"/restaraunt-rest-0.0.1.local-SNAPSHOT/rest/customer/signup";
        
        return this;
    })();
    

    
    this.SCREENS = (function()
    {
        //Common Screens
        this.HEADER = HOST + "/web/pages/header.html";
        
        return this;
    })();
    
    this.MESSAGES = (function(){
        this.INTERNAL_ERROR = "Oops! Internal error occured, Please try after sometime";
        this.IN_PROGRESS = "Please wait for  the momoment";
        this.STATENOTFOUND="Please allow to access your location";
        return this;
    })();
    
  
    return this;
})();
