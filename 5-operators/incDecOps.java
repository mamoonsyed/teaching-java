class incDecOps {
    public static void main (String[] args) {
        int a = 3;
        System.out.println(a++); // 3
        System.out.println(a); // 4
        System.out.println(++a); // 5
        System.out.println(a); // 5
        /*
        Conclusion: Its always better to use x+1
        instead of these unary increment ops.
        and if you ever do use them, try to use
        the prefix operator instead of postfix operator.
        */
    }
}