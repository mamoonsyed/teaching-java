class charPromotion {
    static void method() {
        System.out.println("inside Method ...");
        char character1 = 50; // will be assigned UTF-16 equivalent value "2"
        System.out.println("character1: "+character1); 
        System.out.println("73-character1= "+(73-character1)); /* character1 gets promoted to
        int, i.e. numerical equivalent 50 is used for this operation */
        System.out.println("character1-'3'= "+(character1-'3')); /*both character1 and '3' are
        promoted to int datatype before this operation */
        System.out.println("'a'+'b'= "+('a'+'b')); /*Same as above, both characters are
        promoted to int equivalents i.e. 97 and 98 */
        /*
        OUTPUT:
        inside Method ...
        character1: 2
        73-character1= 23
        character1-'3'= -1
        'a'+'b'= 195
        */
    }
    public static void main(String[] args) { /* not adding "String[] args" results in
    a runtime error. Compiles fine */
        method();
    }
}