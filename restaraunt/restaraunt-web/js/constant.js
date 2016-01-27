var HOST =window.location.origin;  //"http://54.169.209.237";//window.location.origin+":80"; 
var CONSTANTS = (function(){
    //Application RESTfulApi's
    this.RESTAPIS = (function()
    {
        //Common API's
        this.SEARCHNEARBY =  "http://54.169.43.80/restaraunt-rest-0.0.1.local-SNAPSHOT/rest/restaraunt/search/nearby";
        this.CITYBYSTATENAME = "http://54.169.43.80/restaraunt-rest-0.0.1.local-SNAPSHOT/rest/restaraunt/cities/state/";
        this.AREABYCITY = "http://54.169.43.80/restaraunt-rest-0.0.1.local-SNAPSHOT/rest/restaraunt/areas/city/";
        this.SIGNUPWITHGOOGLE = "http://54.169.43.80/restaraunt-rest-0.0.1.local-SNAPSHOT/rest/customer/signup";
        this.GETALLSTATES = "http://54.169.43.80/restaraunt-rest-0.0.1.local-SNAPSHOT/rest/restaraunt/states";
        this.GETALLREVIEW="http://54.169.43.80/restaraunt-rest-0.0.1.local-SNAPSHOT/rest/restaraunt/review/info";
        return this;
    })();
    

    
    this.SCREENS = (function()
    {
        //Common Screens
        this.ORDER = HOST + "/pages/menuinfo.html";
        this.HOME = HOST + "/pages/home.html";
        
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
