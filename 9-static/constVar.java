/*
we know that the "case" statement only takes 
constants, that is why we will be using switch
case example to evaluate if our declared literals
are constants or not. following are a few examples.
*/

class ConstVar {
    static final byte month2 = 2 // will work
    final byte month2 = 2 // will not work
    // // following will not work too.
    // static final byte month2;
    // static {
    //     month2 = 2;
    // }
    
    public static void main(String[] args) {

        byte month = 3;
        // byte month2 = 2; // will not work
        final byte month2 = 2; // will work
        // following will also not work
        final byte month2;
        month2 = 2;
        
        switch (month) {
            case 1: System.out.println("month is january!"); break;
            case month2: System.out.println("month is February!"); break;
            case 1: System.out.println("month is March!"); break;
        }
    }

}