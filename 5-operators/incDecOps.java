class incDecOps {
    public static void main (String[] args) {
        int a = 3;
        System.out.println(a++); // 3
        System.out.println(a); // 4
        System.out.println(++a); // 5
        System.out.println(a); // 5
        int x = 1;
        // System.out.println(x);
        // x=x++; // Never write x=x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        x+=2;
        System.out.println(x);
        x*=2; 
        System.out.println(x);


        // Simplest operations to understand pre-
        // and post increment. 
        int i = 0;
        int j = ++i;
        System.out.println(i+" "+j); // 1 0

        int k = 0;
        int l = ++i;
        System.out.println(k+" "+l); // 1 1

        /*
        In Java, postfix operator has higher precedence than
        assignment operator, so the x++ returns the original
        value of x, not the incremented one. Then meanwhile
        x gets incremented and becomes 2. But finally x is
        assigned the original value returned by x++ that was 1.
        */
        /*
        Conclusion: Its always better to use x+=1
        instead of these unary increment ops.
        and if you ever do use them, try to use
        the prefix operator instead of postfix operator.
        */
    }
}