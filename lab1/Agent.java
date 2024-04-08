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
        for (int i = 0; i <length; i++) {
            int randomIndex = rd.nextInt(months.length);
            System.out.println((i + 1) + ". " + months[randomIndex]);
	}
	}
	
}





