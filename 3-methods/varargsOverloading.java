class varargsOverloading {
    static void method(boolean flag, int i, int j, int k) {
        System.out.println("Inside non-vararg method ...");
    }

    static void method(boolean flag, int... list) {
        System.out.println("Inside vararg method ...");
        System.out.println("list.length: "+list.length);
    }

    /*
    Moral of the story is that, the overload with varargs will
    be matched in the last.
    */

    /*
    OUTPUT:
    Inside non-vararg method ...
    Inside vararg method ...
    list.length: 7
    Inside vararg method ...
    list.length: 0
    */

    public static void main (String... args) {
        method(true, 1,2,3);
        method(true, 1,2,3,4,5,6,7);
        method(true);
    }
}