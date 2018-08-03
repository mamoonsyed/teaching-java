class staticContext {
    static int instanceInt = 200;
    // void method (int paramInt) { // error: non-static method method(int) cannot be referenced from a static context
    static void method (int paramInt) {
        paramInt = instanceInt; //error: non-static variable instanceInt cannot be referenced from a static context
        System.out.println("paramInt: "+paramInt);
        System.out.println("instanceInt: "+instanceInt);
    }
    public static void main(String[] args) {
        int fromMain = 100;
        method(fromMain);
    }
}