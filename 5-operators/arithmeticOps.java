class arithmeticOps {
    static void method () {
        System.out.println("Inside method ...");
        int numAdd = 5+6;
        int numSub = 6-7;
        int numMul = 40*10;;
        int numDiv = 3/6;

        // Below operations were giving funky results.
        // so better not to use them
        // Even the easiest of operations were botched by these unary operators.
        // int numPreInc = ++numAdd;
        // int numPostInc = numAdd++;
        // int numPreDec = --numAdd;
        // int numPostDec = numAdd--;
        int numInc = numAdd + 1;
        int numDec = numAdd - 1;

        System.out.println("numAdd = "+ numAdd);
        System.out.println("numSub = "+ numSub);
        System.out.println("numMul = "+ numMul);
        System.out.println("numDiv = "+ numDiv);
        // System.out.println("numPreInc = "+ numPreInc);
        // System.out.println("numPostInc = "+ numPostInc);
        // System.out.println("numPreDec = "+ numPreDec);
        // System.out.println("numPostDec = "+ numPostDec);
        System.out.println("numInc = "+numInc);
        System.out.println("numDec = "+numDec);

    }
    public static void main (String[] args) {
        method();
    }
}