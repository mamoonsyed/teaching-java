// LETS TALK ABOUT TWO DIMENSIONAL ARRAYS.
import java.util.Arrays;

class twoDimArrays {
    static void method() {
        System.out.println("Inside method ...");
        // Declaring members one by one.
        int[][] intTwoDimArray = new int[2][2];
        intTwoDimArray[0][0] = 0;
        intTwoDimArray[0][1] = 1;
        intTwoDimArray[1][0] = 2;
        intTwoDimArray[1][1] = 3;
        System.out.println("intTwoDimArray[0][0]: " + intTwoDimArray[0][0]);
        System.out.println("intTwoDimArray[0][1]: " + intTwoDimArray[0][1]);
        System.out.println("intTwoDimArray[1][0]: " + intTwoDimArray[1][0]);
        System.out.println("intTwoDimArray[1][1]: " + intTwoDimArray[1][1]);

        // More terse method of declaring and assigning.
        // char[][] charTwoDimArray = new char[][]{
        char[][] charTwoDimArray = {    
                                    {'a','b'},
                                    {'c','d'}
                                   };
        System.out.println("This is the complete charTwoDimArray: "
                            + Arrays.deepToString(charTwoDimArray));
        /*
        OUTPUT:
        Inside method ...
        intTwoDimArray[0][0]: 0
        intTwoDimArray[0][1]: 1
        intTwoDimArray[1][0]: 2
        intTwoDimArray[1][1]: 3
        This is the complete charTwoDimArray: [[a, b], [c, d]]
        */
    }
    public static void main(String[] args) {
        method();
    }
}