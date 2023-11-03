
public class TestDay {

	public static void main(String[] args) {

		Day ZachDay = new Day(); 
		//System.out.println(ZachDay.weekDay); can't do this because weekDay is private
		
		ZachDay.setDay("Thursday");
		myMethod(ZachDay);
	}	
	
	public static Day myMethod(Day AdamDay) {
		System.out.println(AdamDay.getDay());
		System.out.println("The next day is " + AdamDay.nextDay());
		return AdamDay;
	}
}

