class forEach {
    static void method() {
        // this for pattern is similar to for(item in array)
        // from python.
        int[] anArray = {0,1,2,3,4};
        for(int i : anArray) {
            for(int j : anArray) {
                System.out.println(i+" "+j);
            }
        }
    }
    public static void main(String[] args) {
        method();
    }
}