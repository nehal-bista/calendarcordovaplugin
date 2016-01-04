package com.example.myplugin;
 
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import android.app.Activity;
import android.content.Intent;
import 	android.provider.CalendarContract;
import 	android.provider.CalendarContract.Events;


public class Calendar extends CordovaPlugin {
		public static final String ACTION_ADD_CALENDAR_ENTRY = "addCalendarEntry"; 
		@Override
		public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
			try {
				if (ACTION_ADD_CALENDAR_ENTRY.equals(action)) { 
					//JSONObject arg_object = args.getJSONObject(0);
					//Intent calIntent = new Intent(Intent.ACTION_EDIT)
					//.setType("vnd.android.cursor.item/event")
					//.putExtra("beginTime", arg_object.getLong("startTimeMillis"))
					//.putExtra("endTime", arg_object.getLong("endTimeMillis"))
					//.putExtra("title", arg_object.getString("title"))
					//.putExtra("description", arg_object.getString("description"))
					//.putExtra("eventLocation", arg_object.getString("eventLocation"));
					
					//.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true)
					//.putExtra(Events.TITLE, "Neel Birthday")
					//.putExtra(Events.DESCRIPTION, "This is a sample description")
					//.putExtra(Events.EVENT_LOCATION, "My Guest House")
					//.putExtra(Events.RRULE, "FREQ=YEARLY");
				   //this.cordova.getActivity().startActivity(calIntent);
				   //callbackContext.success("Event created.");
				   //return true;
				   callbackContext.success("Success");
				   return true;
				}
				callbackContext.error("Invalid action");
				return false;
				
			} catch(Exception e) {
				System.err.println("Exception: " + e.getMessage());
				callbackContext.error(e.getMessage());
				return false;
			} 
		}
}
