
public class Day {
	private String weekDay;
	
	public Day() {
		weekDay = "Sunday";
	}
	
	public Day(String day) {
		weekDay = day;
	}
	
	public void setDay(String d) {
		weekDay = d;
	}
	
	public String getDay() {
		return weekDay;
	}
	
	public String nextDay() {
		if(weekDay.equals("Sunday"))
	        return "Monday";
	    else if (weekDay.equals("Monday"))
	        return "Tuesday";
	    else if (weekDay.equals("Tuesday"))
	        return "Wednesday";
	    else if (weekDay.equals("Wednesday"))
	        return "Thursday";
	    else if (weekDay.equals("Thursday"))
	        return "Friday";
	    else if (weekDay.equals("Friday"))
	        return "Saturday";
	    else 
	        return "Sunday";
		}
	}
