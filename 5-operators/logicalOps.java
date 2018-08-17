class logicalOps {
    static void method() {
        // float pi = 3.14;
        // float phi = 1.81;
        // error: incompatible types: possible lossy conversion from double to float
        float pi = 3.14f;
        float phi = 1.81f; // don't forget f after the literal in case of float.
                           // or else above error will occur.
        int x =5; int y = 6;

        if (pi == phi) {
            System.out.println("pi is phi");
        }
        else {
            System.out.println("not equal HAHA!");
        }

        if ((x<7)&&(y<3)) {
            System.out.println("AND condition is true!");
        }
        else {
            System.out.println("AND condition is false!");
        }

        if ((x<7)||(y<3)) {
            System.out.println("OR condition is true!");
        }
        else {
            System.out.println("OR condition is false!");
        }

        if (!(x<7)) {
            System.out.println("NOT condition is true!");
        }
        else {
            System.out.println("NOT condition is false!");
        }
    }
    public static void main(String[] args) {
        method();
    }
}