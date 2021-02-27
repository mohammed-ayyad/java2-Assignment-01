public class q10_3 {

    public static void main(String[] args) {
        MyInteger c = new MyInteger(101);
        System.out.println(c.isEven());
        System.out.println(c.getValue());
        System.out.println(c.isPrime());
    }
}

class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 == 1;
    }

    public boolean isPrime() {
        boolean b = true;
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static boolean isEven(int value) {
        return (value % 2) == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 == 1;
    }

    public static boolean isPrime(int value) {
        boolean b = true;
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static boolean isEven(MyInteger I) {
        return I.isEven();
    }

    public static boolean isOdd(MyInteger I) {
        return I.isOdd();
    }

    public static boolean isPrime(MyInteger I) {
        return I.isPrime();
    }

    public boolean equals(int v) {
        return this.value == v;
    }

    public boolean equals(MyInteger v) {
        return this.value == v.getValue();
    }

    public static int parseInt(char[] values) {
        int num = 0;
        for (int i = 0; i < values.length; i++) {
            num += Character.getNumericValue(values[i]) * Math.pow(10, values.length - i - 1);
        }
        return num;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}
