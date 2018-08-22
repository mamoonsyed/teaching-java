class arithmeticOps {
    static void method () {
        System.out.println("Inside method ...");
        int numAdd = 5+6;
        int numSub = 6-7;
        int numMul = 40*10;
        int numDiv = 3/6;
        // int numNegative = -numAdd;
        // JAVA FOLLOWS PEMDAS

        // Below operations were giving funky results.
        // so better not to use them
        // Even the easiest of operations were botched by these unary operators.
        // int numPreInc = ++numAdd;
        // int numPostInc = numAdd++;
        // int numPreDec = --numAdd;
        // int numPostDec = numAdd--;

        int numInc = numAdd + 1;
        int numDec = numAdd - 1;

        System.out.println("numAdd = "+ numAdd); // 11
        System.out.println("numSub = "+ numSub); // -1
        System.out.println("numMul = "+ numMul); // 400
        System.out.println("numDiv = "+ numDiv); //0
        System.out.println("numNegative = "+ numNegative); // -11
        
        // System.out.println("numPreInc = "+ numPreInc);
        // System.out.println("numPostInc = "+ numPostInc);
        // System.out.println("numPreDec = "+ numPreDec);
        // System.out.println("numPostDec = "+ numPostDec);
        System.out.println("numInc = "+numInc); // 12
        System.out.println("numDec = "+numDec); // 10

    }
    public static void main (String[] args) {
        method();
    }
}