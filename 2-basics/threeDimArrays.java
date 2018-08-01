import java.util.Arrays;

// THREE DIMENSIONAL ARRAYS
class threeDimArrays {
    static void method() {
        System.out.println("Inside method ...");
        // Three dimensional arrays can also be declared
        // in the same way as other arrays.
        int[][][] intThreeDimArray = {
                                      {
                                       {1,2}, // don't forget to add comma after these curlies
                                       {3,4}
                                      }, // don't forget to add comma after these curlies
                                      {
                                       {5,6},
                                       {7,8}
                                      }, // don't forget to add comma after these curlies
                                     }; // don't forget to add semicolon after these curlies
    System.out.println("Complete intThreeDimArray: "+Arrays.deepToString(intThreeDimArray));

    /*
    OUTPUT:
    Inside method ...
    Complete intThreeDimArray: [[[1, 2], [3, 4]], [[5, 6], [7, 8]]]
    */
    }
    public static void main(String[] args) {
        method();
    }
}