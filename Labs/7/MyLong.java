package lab7;

public class MyLong {
	private int Value;

    public MyLong(int value) {
        Value = value;
    }

    public int getValue() {
        return Value;
    }

    public boolean isEven() {
        return (Value % 2) == 0;
    }

    public boolean isOdd() {
        return (Value % 2) == 1;
    }

    public boolean isPrime() {
        if (Value == 1 || Value == 2) {
            return true;
        }
        else {
            for (int i = 2; i < Value; i++) {
                if (i % Value == 0) return false;
            }
        }
        return true;
    }

    public static boolean isEven(int mylong) {
        return (mylong % 2) == 0;
    }

    public static boolean isOdd(int myLong) {
        return (myLong % 2) == 1;
    }

    public static boolean isPrime(int myLong) {
        if (myLong == 1 || myLong == 2) {
            return true;
        }
        else {
            for (int i = 2; i < myLong; i++) {
                if (i % myLong == 0) return false;
            }
        }
        return true;
    }    

    public static boolean isEven(MyLong myNum) {
        return myNum.isEven();
    }

    public static boolean isOdd(MyLong myNum) {
        return myNum.isOdd();
    }

    public static boolean isPrime(MyLong myNum) {
        return myNum.isPrime();
    }

    public boolean equals(int testNum) {
        if (testNum == Value) 
            return true;
        return false;
    }

    public boolean equals(MyLong myNum) {
        if (myNum.Value == this.Value) 
            return true;
        return false;
    }

    public static int parseLong(char[] values) {
        int sum = 0;
        for (char i : values) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    public static int parseLong(String value) {
        return Integer.parseInt(value);
    
	}
    
}
