class ifElse {
    static void method () {
        System.out.println("Inside method ...");
        int x = 10;
        
        // single line if-else blocks
        if (x!=10)
            System.out.println("IF without curly braces, it works!");
        else
            System.out.println("ELSE without curly braces, it works!");
    
        // if, else-if, else code.
        if (x==8) {
            System.out.println("x is 8!");
            System.out.println("second line for lulzzz");
        }
        else if (x==9) {
            System.out.println("x is 9!");
            System.out.println("second line for lulzzz");
        }
        else if (x==10) {
            System.out.println("x is 10!");
            System.out.println("second line for lulzzz");
        }
        else if (x==11) {
            System.out.println("x is 11!");
            System.out.println("second line for lulzzz");
        }
        else { // else is always optional.
            System.out.println("x is none of those numbers!");
            System.out.println("second line for lulzzz");
        }

        // nested if else statements
        int y = 10;
        if (x == 10) {
            if (y == 100) {
                System.out.println("x is 10, and y is 100!!");
            }
            else {
                System.out.println("x is 10, but y is not 100!");
            }
        }
        else {
            if (y == 100) {
                System.out.println("x is not 10, but y is 100!!");
            }
            else {
                System.out.println("x is not 10, and y is not 100 either!");
            }
        }
    }
    public static void main (String[] args) {
        method();
    }
}