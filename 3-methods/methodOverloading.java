class methodOverloading {
    static void method (int num) {
        System.out.println("Inside int method ...");
    }

    static void method (short num) {
        System.out.println("Inside short method ...");
    }

    public static void main(String[] args) {
        byte byteNum = 100;
        method(byteNum);
        /*
        OUTPUT:
        Inside short method ...
        */
    }
}