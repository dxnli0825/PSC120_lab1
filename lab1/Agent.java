package Lab1;

import java.util.Random;

public class Agent {
	String[] months = {"January", "February", "March", "April", "May", "June", 
			"July", "August", "September", "October", "November", "December"};
	
	String[] weeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", 
			"Friday", "Saturday"};
	
	int[] totalDaysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public void printMonths() {
		System.out.println("Problem 1.1:");
		
		for (int i = 0; i < months.length; i++) {
			System.out.println((i + 1) + ". " + months[i]);
		}
		System.out.println();
	}
	
	public void printRandomList(int length) {
		System.out.println("Problem 1.2:");
		
		Random rand = new Random();
		int randomNumber = 0;
		
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				randomNumber = rand.nextInt(months.length);
				System.out.println((randomNumber + 1) + ". " + months[randomNumber]);
			}
		}
		else {
			System.out.println("Please provide a positive length.");
		}
		
		System.out.println();
	}
	
	public String getMonth (int month) {
		System.out.println("Problem 1.3:");
		
		String monthName = null;
		
		if (month >= 1 || month <= 12) {
			monthName = months[month - 1];
			System.out.println(month + ". " + monthName);
		}
		else {
			System.out.println("Invalid month number. Please enter a valid month number.");
		}
		System.out.println();
		
		return monthName;
	}
	
	public void printRangeOfMonths(int start, int end) {
		System.out.println("Problem 1.4:");
		
		if (start >= 1 && end <= months.length && start < end) {
			for (int i = start - 1; i <= end - 1; i++) {
				System.out.println((i + 1) + ". " + months[i]);
			}
        }
		else {
			System.out.println("Invalid range");
		}
		
		System.out.println();
	}
	
	public void printMonthNumber(String monthName) {
		System.out.println("Problem 1.5:");
		
		int monthNumber = 0;
		
		for (int i = 0; i < months.length; i++) {
			if (monthName == months[i]) {
				monthNumber = i + 1;
				break;
			}
			else {
				continue;
			}
		}
		
		if (monthNumber == 0) {
			System.out.println("Invalid month name. Please enter a valid month name.");
		}
		else {
			System.out.println(monthNumber + ". " + monthName);
		}
		
		System.out.println();
	}
	
	public void weekMonthDay (int num) {
		System.out.println("Problem 2:");
		
		int monthCount = 0;
		int date = num;
		
		if (num < 1 || num > 366) {
			System.out.println("The number you enter is out of range."); 
		}
		else {
			for (int i = 0; i < totalDaysInMonth.length; i++) {
				if (date <= totalDaysInMonth[i]) {
					break;
				}
				date -= totalDaysInMonth[i];
				monthCount++;
			}
		}
		System.out.println(weeks[num % 7] + ", " + months[monthCount] + " " + date);
	}
}
