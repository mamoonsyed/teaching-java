class forLoop {
    static void method() {
        int[] a = {0,1,2,3};
        int i=0, j=0;

        // most compact form below,
        // works for just one statement though.
        for(; i<a.length; System.out.println(a[i++]));
        // for(i=1,j=1; i<a.length && j<a.length ; i++,j++) {
        
        //     System.out.println(a[i]+" "+j);
        // }
    }
    public static void main(String[] args) {
        method();
    }
}