package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoise = "Ring";
		bookTitle = "The Lord Of the Rings";
		
		if (bookTitle.contains(wordChoise)) {
			System.out.println("The book contain the word " + wordChoise);
		}
		
		String browser = "Chrome";
		// (browser == "chrome")
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "945216874";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		//Print the initials plus lat 4 digits of SSN
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 1));
		System.out.print(SSN.substring(5));

	}

}
