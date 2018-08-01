import java.util.Arrays;

// FOUR DIMENSIONAL ARRAYS. THATS AS FAS AS WE GO
class fourDimArrays {
    static void method() {
        System.out.println("Inside method ...");
        /*
        
        Trick to declaring a four dimensional array is
        to first declare a 2-dim array, copy the whole declaration
        replicate it just after the first one, and enclose the whole
        declaration. add appropriate commas and semicolons. and
        replicate the above step again. then go on to verify that
        each opening curly has a closing and vice versa.
        Verify the commas and semicolon again. Commas come between
        two elements, could be individual elements and also rows or colums.
        You're good to go.
        
        */
        int[][][][] intFourDimArray = { 
                                        {
                                         {
                                          {1,2}, 
                                          {3,4}
                                         }, 
                                         {
                                          {5,6},
                                          {7,8}
                                         }, 
                                        },
                                        {
                                         {
                                          {1,2}, 
                                          {3,4}
                                         }, 
                                         {
                                          {5,6},
                                          {7,8}
                                         }, 
                                        }
                                       };
    System.out.println("Complete intFourDimArray: "+Arrays.deepToString(intFourDimArray));

    /*
    OUTPUT:
    Inside method ...
    Complete intFourDimArray: [[[[1, 2], [3, 4]], [[5, 6], [7, 8]]], [[[1, 2], [3, 4]], [[5, 6], [7, 8]]]]
    */
    }
    public static void main(String[] args) {
        method();
    }
}