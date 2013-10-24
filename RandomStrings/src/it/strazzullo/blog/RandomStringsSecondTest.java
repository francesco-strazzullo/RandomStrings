package it.strazzullo.blog;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class RandomStringsSecondTest {
	
	private static final String MOBILE_PREFIX = "+393";
	private static Random random = new Random();

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
			//Nome: Xxxxx(...) Xxxxxx(...)
			
			int nameLength = 3 + random.nextInt(5);
			int surnameLength = 5 + random.nextInt(8);
			
			String name = RandomStringUtils.randomAlphabetic(nameLength); 
			name = StringUtils.capitalize(name.toLowerCase());
			
			String surname = RandomStringUtils.randomAlphabetic(surnameLength);
			surname = StringUtils.capitalize(surname.toLowerCase());
			
			//Cellulare: +393XXXXXXXXX
			
			String phoneNumber = MOBILE_PREFIX + RandomStringUtils.randomNumeric(9);
			
			System.out.println(name + " " + surname + " (" + phoneNumber + ")");
		}
	}

}
