package Lab1;

public class Environment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agent a = new Agent();
		a.printMonths();
		a.printRandomList(4);
		a.getMonth(3);
		a.printRangeOfMonths(2, 5);
		a.printMonthNumber("May");
		a.weekMonthDay(366);
	}

}