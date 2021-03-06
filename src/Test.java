class Test {
    public static void main(String[] args) {
        testSum();
    }

    private static void testSum() {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        if (result == expected) {
            System.out.println("Sum: OK");
        } else {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
    }

    private static void testSubtract() {
        int a = 5;
        int b = 6;
        int expected = -1;
        BasicMath bm = new BasicMath();
        int result = bm.subtract(a, b);
        if (result == expected) {
            System.out.println("Subtract: OK");
        } else {
            System.out.println("Subtract: Failed, expected = " + expected + ", result = " + result);
        }
    }

    private static void testMultiply() {
        int a = 5;
        int b = 6;
        int expected = 30;
        BasicMath bm = new BasicMath();
        int result = bm.multiply(a, b);
        if (result == expected) {
            System.out.println("Mult: OK");
        } else {
            System.out.println("Mult: Failed, expected = " + expected + ", result = " + result);
        }
    }

    private static void testDivide() {
        int a = 20;
        int b = 5;
        int expected = 4;
        BasicMath bm = new BasicMath();
        int result = bm.divide(a, b);
        if (result == expected) {
            System.out.println("Div: OK");
        } else {
            System.out.println("Div: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
