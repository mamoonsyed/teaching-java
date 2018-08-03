class methodOverloading {

    byte id = 90;
    static void method (int num) {
        System.out.println("Inside int method ...");

    }
    
    static void method (short num) {
        System.out.println("Inside short method ...");
        int id = num; // error: non-static variable id cannot be referenced from a static context
        // System.out.println("num: "+i);
    }


    public static void main(String[] args) {
        byte byteNum = 100;
        int j = 30;
        method(byteNum);
        /*
        OUTPUT:
        Inside short method ...
        */
    }
}