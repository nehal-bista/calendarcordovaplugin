var exec = require('cordova/exec');
var calendar = {
    //createEvent: function(title, location, notes, startDate, endDate, successCallback, errorCallback) {
    createEvent: function(title, location, notes, startDate, endDate) {
		//alert(title+" - "+ location+" - "+  notes+" - "+  startDate+" - "+  endDate+" - "+  successCallback+" - "+  errorCallback);
		//alert(exec);
		function successCallback(message){
			alert("success: "+message);
		}
		function errorCallback(message){
			alert("failed: "+message);
		}
        //cordova.exec(
        exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'Calendar', // mapped to our native Java class called "Calendar"
            'addCalendarEntry', // with this action name
             [{                  // and this array of custom arguments to create our entry
                 "title": title,
                 "description": notes,
                 "eventLocation": location,
                 "startTimeMillis": startDate.getTime(),
                 "endTimeMillis": endDate.getTime()
             }],
            
        ); 
     }
}
module.exports = calendar;
