class methodArgPassing {
    static void go(int[] array, int num) {
        System.out.println("First element: "+array[0]);
        System.out.println("First element: "+array[1]);
        array[1] = 33;
        num = 99;
    }

    public static void main (String[] args) {
        int[] array = {1,2};
        int number = 9;
        go(array, number);
        // checking if changing value in the method makes any difference
        
        System.out.println("After passing by reference and changing value: "+array[1]);
        System.out.println("After passing by value and changing variable number: "+number);

        /*
        OUTPUT:
        First element: 1
        First element: 2
        After passing by reference and changing value: 33
        After passing by value and changing variable number: 9
        */
    }
}