package datastucture;

public class CalendarStack {

	public static void main(String[] args) {
		
		System.out.println("Enter the month:");
		int month=Utility.inputInt();
		System.out.println("Enter the Year:");
		int year=Utility.inputInt();
		Utility.calendarStack(month, year);
	}
}
