package tests;

import model.User;

public class UserTests {

	public static void main(String[] args) {
		// Old manual testing

		/*
		 * User testUser = new User("mike", "my_passwd", "Mike", "Smith",
		 * "07771234567");
		 * 
		 * System.out.println(testUser);
		 */

		// 1 - Setup the object and test data
		String testUsername = "mike";
		String testPassword = "my_passwd";
		String testFirstName = "Mike";
		String testLastName = "Smith";
		String testMobileNumber = "07771234567";

		// 2 - Run the object under test
		User testUser = new User(testUsername, testPassword, testFirstName, testLastName, testMobileNumber);

		// 3 - Verify
		Boolean passed = true;

		if (testUser.getUsername() != testUsername) {
			System.out.println("TC1 failed: username did not match");
			passed = false;
		}

		if (testUser.getPassword() != testPassword) {
			System.out.println("TC2 failed: password did not match");
			passed = false;
		}

		// TODO 1

		if (testUser.getFirstName() != testFirstName) {
			System.out.println("TC3 failed: first name did not match");
			passed = false;
		}

		if (testUser.getLastName() != testLastName) {
			System.out.println("TC4 failed: last name did not match");
			passed = false;
		}

		if (testUser.getMobileNumber() != testMobileNumber) {
			System.out.println("TC5 failed: mobile number did not match");
			passed = false;
		}

		if (passed) {
			System.out.println("All TC's passed.");
		}
	}
}