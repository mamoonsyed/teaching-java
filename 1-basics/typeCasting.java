class typeCasting {
    static void method() {
        System.out.println("\nInside method ...");
        
        long y = 42;
        // int x =y; // Compile time error
        int x = (int)y;
        System.out.println("long y: "+y);
        System.out.println("int x: "+x);

        //Information loss due to out-of-range assignment
        byte narrowByte = (byte)123456;
        System.out.println("actual value: 123456");
        System.out.println("narrowByte (after Higher order bytes loss): "+narrowByte);

        //Truncation
        int truncatedInt = (int)0.99;
        System.out.println("actual value: 0.99");
        System.out.println("Truncated value of Integer: "+truncatedInt);

        //Implicit cast (int to long)
        y = x;
        System.out.println("Implicit cast (int to long): "+y);

        //Implicit cast (char to int)
        char cChar = 'A';
        int iInt = cChar;
        System.out.println("iInt:" + iInt);

        //byte to char using an explicit cast
        byte bByte = 65;

        /* special conversion (widening from byte to int
         followed by) narowing from int to char) */
        cChar = (char)bByte; 
        System.out.println("cChar: "+cChar);

        /*
        OUTPUT:

        Inside method ...
        long y: 42
        int x: 42
        actual value: 123456
        narrowByte (after Higher order bytes loss): 64
        actual value: 0.99
        Truncated value of Integer: 0
        Implicit cast (int to long): 42
        iInt:65
        cChar: A
        */
    }
    // Initialize a field called count
    // this is a declaration statement and it can occur
    // directly within the class body.
    static int count = 0;

    // This is an assignment expression,
    // And an expression statement cannot be written directly in a class body.
    // But we can write such statements within methods.
    // count = 1; // typeCasting.java:54: error: <identifier> expected

    // starting an if statement within a class body will also invoke a compilation error.
    // if (count < 49) { // typeCasting.java:63: error: illegal start of type
    //     count++;
    // }

    /*
    you can only have the following in a class body:
        1. Field declarations.
        2. Method declarations.
        3. Constructor declaration.
        4. Nested class & interface declarations.
        5. Instance and static initializers.
    */
    public static void main (String[] args) {
        method();
    }
}