class stringPool {
    public static void main(String[] args) {
        String s1 = "hello!";
        String s2 = "hello!";
        String s3 = "hello!".intern();
        String s4 = new String("hello!");
        String s5 = "lo!";
        final String s6 = "lo!";

        System.out.println("s1 equals s2: "+(s1==s2)); // true
        System.out.println("s1 equals s3: "+(s1==s3)); // true
        System.out.println("s1 equals s4: "+(s1==s4)); // false
        System.out.println("s1 equals interned s4: "+(s1==s4.intern())); // true
        System.out.println("s1 equals hel + lo: "+(s1== "hel"+"lo!")); // true
        System.out.println("s1 equals hel +s5: "+(s1== "hel"+s5)); // false
        System.out.println("s1 equals hel +s6: "+(s1== "hel"+s6)); // true
    }
}