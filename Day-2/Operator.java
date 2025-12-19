class Operator {
	/*
	 * This file contains the operators
	 * They are contain
	 * [Arithematic, Relational, Logical, Ternary, Assignment]
	 */
	public static void main(String... args) {
		int a = 10;
		int b = 20;

		// Arithematic Operators

		/*
		 * Arithematic operators are used to perform arithematic operations
		 * They include +, -, *, /, %
		 */

		System.out.println("----------Arithematic Operator----------");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		// Relational operators

		/*
		 * Relational operators are used to compare two values
		 * They include >, <, >=, <=, ==, !=
		 */

		System.out.println("-------Relational Operators---------");
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);

		boolean b1 = true;
		boolean b2 = false;

		// Logical operators

		/*
		 * Logical operators are used to perform logical operations
		 * They include &&, ||, !
		 */

		System.out.println("-----------Logical Operator with Boolean values---------");
		System.out.println((b1 && b2));
		System.out.println((b1 || b2));
		System.out.println((!b1));
		System.out.println((!b2));
		String brand = "Zara";
		int price = 499;
		char size = 'M';
		String color = "Red";

		// Brand Boolean

		/*
		 * Logical operators are used to perform logical operations
		 * They include &&, ||, !
		 */

		System.out.println("---------Logical Operator--------");
		boolean res = (brand == "Zara" && price <= 5000 && size == 'M' && color == "BLood Red");

		System.out.println(res);

		boolean res1 = (brand == "Nike" || price <= 2000 || size == 'M' || color == "Black");

		System.out.println(res1);

		// Terneray Operators

		/*
		 * Terneray operators are used to perform ternary operations
		 * They include (Condition) ? statement 1 : statement 2;
		 */

		System.out.println("--------Ternary Operations---------");
		byte age = 12;
		boolean res2 = (age >= 10) ? true : false;

		System.out.println(res2);

		// Rich or not

		/*
		 * Terneray operators are used to perform ternary operations
		 * They include (Condition) ? statement 1 : statement 2;
		 */

		System.out.println("----------Rich or Not-------");
		int amount = 150498;
		String rich = (amount > 100000) ? "Rich" : "Not Rich";

		System.out.println(rich);

		// Greater Number

		/*
		 * Terneray operators are used to perform ternary operations
		 * They include (Condition) ? statement 1 : statement 2;
		 */

		System.out.println("---------Greater Number--------");
		int number1 = 20;
		int number2 = 30;

		int greater = (number1 > number2) ? number1 : number2;

		System.out.println(greater);

		// Three Number greater

		/*
		 * Terneray operators are used to perform ternary operations
		 * They include (Condition) ? statement 1 : statement 2;
		 */

		System.out.println("-----------Three Number Greater-------");
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;

		int greatn = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
		System.out.println(greatn);

		// Assignment Operators

		/*
		 * Assignment operators are used to assign values to variables
		 * They include =, +=, -=, *=, /=, %=
		 */

		int bal = 500;

		System.out.println("--------Compound Assignment Operators--------");
		System.out.println("bal: " + bal);
		bal += 500;

		System.out.println("newBal (bal+=500) : " + bal);

	}
}