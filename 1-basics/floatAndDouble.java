// main class
class floatAndDouble {
    static void method() {
        float f = -0.005524f;
        double d = 636.256876431d;
        double product = f * d; //-3.514683082717482
        System.out.println("product:"+product);
    }
    
    public static void main(String[] args) {
        method();
    }
}