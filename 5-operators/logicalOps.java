class logicalOps {
    static void method() {
        // float pi = 3.14;
        // float phi = 1.81;
        // error: incompatible types: possible lossy conversion from double to float
        float pi = 3.14f;
        float phi = 1.81f; // don't forget f after the literal in case of float.
                           // or else above error will occur.

        if (pi == phi) {
            System.out.println("pi is phi");
        }
        else {
            System.out.println("not equal HAHA!");
        }
    }
    public static void main(String[] args) {
        method();
    }
}