package it.strazzullo.blog;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringsFirstTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomStringUtils.randomAlphabetic(10));;
		}
	}
}
