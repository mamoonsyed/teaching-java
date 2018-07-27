class charAndBool {
    static void method() {

        char charSimple = 'A';
        char charInteger = 65;
        char charUnicode1 = '\u0041';
        char charHex = 0x41;
        char charBinary = 0b01000001;

        boolean result = true;

        System.out.println("charSimple: " + charSimple);
        System.out.println("charInteger: " + charInteger);
        System.out.println("charUnicode1: " + charUnicode1);
        System.out.println("charHex: " + charHex);
        System.out.println("charBinary: " + charBinary);
        System.out.println("result: " + result);
    }

    public static void main (String[] args) {
        method();
    }
}
