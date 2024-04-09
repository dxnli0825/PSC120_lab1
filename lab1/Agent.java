package lab1;
import java.util.Random;
import java.util.Scanner;

class Agent {
	
		Random rd = new Random();
		
		String[] months = {
	            "January", "February", "March", "April", "May", "June",
	            "July", "August", "September", "October", "November", "December"
	        };
		
		
	package lab1;
import java.util.Random;

class Agent {
	
		Random rd = new Random();
		
		String[] months = {
	            "January", "February", "March", "April", "May", "June",
	            "July", "August", "September", "October", "November", "December"
	        };
		
		
	public void printMonths()
	{
		for (int i =0;i<months.length;i++) {
            System.out.println((i+1) +"." + months[i]);
        }
	}
	
	public void printRandomList(int length) {
        System.out.println("Randomly generated list:");
        Random rd = new Random();
        
        for (int i = months.length - 1; i > 0; i--) {
            int index = rd.nextInt(i + 1);
            // Swap the elements at index i and index
            String temp = months[i];
            months[i] = months[index];
            months[index] = temp;
        }
        
        for (int i = 0; i < length; i++) {
            // Use switch statement to convert index to month number
            int monthIndex = i + 1;
            String monthNumber;
            switch (months[i]) {
            case "January": monthNumber = "1"; break;
            case "February": monthNumber = "2"; break;
            case "March": monthNumber = "3"; break;
            case "April": monthNumber = "4"; break;
            case "May": monthNumber = "5"; break;
            case "June": monthNumber = "6"; break;
            case "July": monthNumber = "7"; break;
            case "August": monthNumber = "8"; break;
            case "September": monthNumber = "9"; break;
            case "October": monthNumber = "10"; break;
            case "November": monthNumber = "11"; break;
            case "December": monthNumber = "12"; break;
            default: monthNumber = "Invalid";
            }
            System.out.println(monthNumber + ". " + months[i]);
        }
    }
	
}






	
	public void printRandomList(int length) {
	
		System.out.println("Randomly generated list:");
        Random rd = new Random();
        for (int i = 0; i <length; i++) {
            int randomIndex = rd.nextInt(months.length);
            System.out.println((i + 1) + ". " + months[randomIndex]);
	}
	}
	
	static String intToDay(int day) {
		switch(day) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		}
		return null;
	}

	static void WeekMonthDay() {
		// question 2
		//variables
		String month;
		String day;
		int date;
		
		// get user input
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = userInput.nextInt();
		System.out.println("You entered: " + num); 
		
		//error checking
		if (num > 366 || num < 1) {
			System.out.println("The number you enter is out of range."); 
		}
		else {
			day = intToDay(num % 7);
			if (num >= 1 && num <= 31) {
				month = "January";
				date = num;
			}
			else if (num >= 32 && num <= 60) {
				month = "February";
				date = (num - 31);
			}
			else if (num >= 61 && num <= 91) {
				month = "March";
				date = (num - 60);
			} 
			else if (num >= 92 && num <= 121) {
				month = "April";
				date = (num - 91);
			}
			else if (num >= 122 && num <= 152) {
				month = "May";
				date = (num - 121);
			}
			else if (num >= 153 && num <= 182) {
				month = "June";
				date = (num - 152);
			}
			else if (num >= 183 && num <= 213) {
				month = "July";
				date = (num - 182);
			}
			else if (num >= 214 && num <= 244) {
				month = "August";
				date = (num - 213);
			}
			else if (num >= 245 && num <= 274) {
				month = "September";
				date = (num - 244);
			}
			else if (num >= 275 && num <= 305) {
				month = "October";
				date = (num - 274);
			}
			else if (num >= 306 && num <= 335) {
				month = "November";
				date = (num - 305);
			}
			else {
				month = "December";
				date = (num - 335);
			}
			
			System.out.println(day + ", " + month + " " + date); 
		}
	}

}





