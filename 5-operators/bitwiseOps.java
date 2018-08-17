class bitwiseOps {
    static void method() {
        System.out.println("Inside method ...");
        int x=1;
        int y=3;
        
        System.out.println("x AND y = "+(x&y));
        System.out.println("x OR y = "+(x|y));
        System.out.println("x XOR y = "+(x^y)); // caret is for XOR operation
        System.out.println("NOT x = "+(~x));

        char a = 'a'; // U+0061 0110 0001
        char b = 'b'; // U+0062 0110 0010
        System.out.println("a AND b = "+(a&b)); // 99: after conversion to int.

        // Since bitwise operations work only with integer types
        // Following will not compile.

        // double pi = 3.14;
        // double phi = 1.81;
        // System.out.println("phi OR pi = "+(pi|phi));
        // error: bad operand types for binary operator '|'
    }

    public static void main (String[] args) {
        method();
    }
}