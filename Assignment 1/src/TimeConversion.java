
public class TimeConversion {

	
	public static String convertSeconds(int time) {
		
		int hours = 0; //initialized hours
		int minutes = 0; //initialized minutes
		
		
	
		if (time < 0) { 
			return "Error: Time must be greater than 0"; //If time is under 0 seconds, it returns an error
				
		}
		if (time < 60) {
			return "0 hour(s), 0 minute(s), " + time + " second"; //If time is under 60 seconds, it returns only the seconds value
		}
		else if (time == 60)
	
		if (time >= 60) { //If time is greater than or equal to 60 seconds
			minutes = time/60; //divide time by 60 (value of seconds in a minute) and initialize it to variable minutes
			time = time%60; //Divide time by 60 for seconds 
		}
		if (minutes >= 60) { //if minutes is greater than or equal to 60 minutes
			hours = minutes/60; // divide minutes by 60 (value of minutes in a hour) and initialize it to hours
			minutes = minutes/60; //divide minutes by 60 for minutes
		}
		
		String hourswords = "";
		String minutewords = ""; 
		String secondwords = "";
		
		if (hours == 1) {
			hourswords = "hour, ";
		}
		
		else {
			hourswords = "hours, ";
		}
		
		if (minutes == 1) {
			minutewords = "minute, ";
		}
		
		else {
			minutewords = "minutes, ";
		}
		
		if (time == 1) {
			secondwords = "second, ";
		}
		
		else {
			secondwords = "seconds, ";
		}
		return hours + hourswords + minutes + minutewords + time + secondwords; //return value of hours, minutes, and seconds
		
	}

	public static void main(String[] args) {
		System.out.println(convertSeconds(1));
		System.out.println(convertSeconds(-1));
		System.out.println(convertSeconds(45));
		System.out.println(convertSeconds(60));
		System.out.println(convertSeconds(200));
	}
}
