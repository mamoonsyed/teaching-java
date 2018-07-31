class array {
    static void method() {
        System.out.println("Inside arrays ...");
        int[] array1 = new int[7];
        array1[0] = 9;
        array1[1] = 8;
        array1[2] = 7;
        array1[3] = 6;
        array1[4] = 5;
        array1[5] = 4;
        array1[6] = 3;
        // array1[7] = 2; // This is out of index
        System.out.println("This is the length of array1: "+array1.length);
        System.out.println("This is first element of array1: "+array1[0]);
        // System.out.println("This is eighth element of array1: "+array1[7]);
        // Compiles fine, but throws a runtime error. 
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7 

        // Second way of declaring arrays
        int[] array2 = new int[] {3,4,5,6,7,8,9};
        System.out.println("This is the length of array2: "+array2.length);
        System.out.println("This is first element of array2: "+array2[0]);
        
    
    }
    public static void main (String[] args) {
        method();
    }
}