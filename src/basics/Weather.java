package basics;

public class Weather {
	public static void main(String[] args) {
		
		int temperature = 65;
		String sunCondition = "Sunny";
		
		if (temperature > 80) {
			System.out.println("It`s pleasant. Wear shorts and T-shirt");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny") ) {
		
		System.out.println("It`s a little cooler.Perhaps wear a long-sleeve shirt and jeans.");
		System.out.println("Wear a hat to keep the sun out off eyse");
		
		} 
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day, make sure to wear warmer clothes");
			
		}
		else {
			System.out.println("Look like a cold day. Bring a sweater");
		}
		
		System.out.println("Program is ending");
		
	}

}
