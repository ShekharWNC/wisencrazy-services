var HOST = window.location.origin+":80"; 
var CONSTANTS = (function(){
    //Application RESTfulApi's
    this.RESTAPIS = (function()
    {
        //Common API's
        this.SEARCHNEARBY = HOST + "/restaraunt-rest-0.0.1.local-SNAPSHOT/rest/restaraunt/search/nearby";
        this.ONLINE_TEST = HOST +"/onlintest";
        this.REGISTERAPP = HOST +"/registerApp";
        this.GET_GALLERY_IMAGES = HOST +"/getImage?appSid=";
        
        return this;
    })();
    

    
    this.SCREENS = (function()
    {
        //Common Screens
        this.HEADER = HOST + "/web/pages/header.html";
        this.IMAGEUPLOAD = HOST + "/web/pages/upload.html";
        this.GALLERY = HOST + "/web/pages/gallery.html";
        this.SETACTION = HOST + "/web/pages/setaction.html";
        this.DEMO = HOST + "/web/pages/demo.html";

        return this;
    })();
    
    this.MESSAGES = (function(){
        this.INTERNAL_ERROR = "Oops! Internal error occured, Please try after sometime";
        this.IN_PROGRESS = "Please wait for  the momoment";
        return this;
    })();
    
  
    return this;
})();
