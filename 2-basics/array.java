import java.util.Arrays;

class array {
    static void method() {
        System.out.println("Inside arrays ...");
        int[] intArray = new int[7];
        intArray[0] = 9;
        intArray[1] = 8;
        intArray[2] = 7;
        intArray[3] = 6;
        intArray[4] = 5;
        intArray[5] = 4;
        intArray[6] = 3;
        // intArray[7] = 2; // This is out of index
        System.out.println("This is the length of intArray: "+intArray.length);
        System.out.println("This is first element of intArray: "+intArray[0]);
        // System.out.println("This is eighth element of intArray: "+intArray[7]);
        // Compiles fine, but throws a runtime error. 
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7 

        // Second way of declaring arrays
        char[] charArray = {'d','e','a','d'};
        System.out.println("This is the length charArray: "+charArray.length);
        System.out.println("This is first element of charArray: "+charArray[0]);
        // HOW TO PRINT WHOLE ARRAY???
        // good question, add "import java.util.Arrays;"
        // THEN:
        System.out.print("This is the complete charArray: ");
        System.out.println(Arrays.toString(charArray));

        String[] stringArray = {"apple", "banana", "oranges"};
        System.out.println("This is the stringArray: "+stringArray.length);
        System.out.println("This is first element of stringArray: "+stringArray[0]);
        System.out.println("This is the complete stringArray: "+Arrays.toString(stringArray));
        
        // OUTPUT:
        // Inside arrays ...
        // This is the length of intArray: 7
        // This is first element of intArray: 9
        // This is the length charArray: 4
        // This is first element of charArray: d
        // This is the complete charArray: [d, e, a, d]
        // This is the stringArray: 3
        // This is first element of stringArray: apple
        // This is the complete stringArray: [apple, banana, oranges]

    }
    public static void main (String[] args) {
        method();
    }
}