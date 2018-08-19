class ternaryOp {
    static int method(int a, int b) {
        int result=(a<b)?a:b;
        return result;
        //can also be returned directly.
        
        // In order to do the same thing 
        // using if-else:
        
        // int result;
        // if (a<b) result = a;
        // else result = b;
        // return result;

    }
    public static void main(String[] args) {
        int min = method(9,11);
        System.out.println("minimum is: "+min);
    }
}