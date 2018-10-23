package lab7;

public class MyLongTestMain {

	public static void main(String[] args) {
		MyLong num1 = new MyLong(17);
		MyLong num2 = new MyLong(26);
		MyLong num3 = new MyLong(2);
		MyLong num4 = new MyLong(17);
		String myLong = "454";
		
		System.out.printf("%d is prime? %s%n",  num1.getValue(), num1.isPrime());
		System.out.printf("%d is prime? %s%n",  num2.getValue(), num2.isPrime());
		System.out.printf("%d is prime? %s%n",  num3.getValue(), num3.isPrime());

		System.out.printf("%d is even? %s%n",  num1.getValue(), num1.isPrime());
		System.out.printf("%d is even? %s%n",  num2.getValue(), num2.isPrime());
		System.out.printf("%d is even? %s%n",  num3.getValue(), num3.isPrime());

		System.out.printf("93 is odd? %s%n", MyLong.isOdd(93));
        
        System.out.printf("%d equals %d? %s%n", num1.getValue(), num4.getValue(), num1.equals(num4));

        System.out.printf("%d%n", MyLong.parseLong(new char[] {'2', '3', '6'}));
        System.out.printf("%d%n", MyLong.parseLong("454"));
	}

}
