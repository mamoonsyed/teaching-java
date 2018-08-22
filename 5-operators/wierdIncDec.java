class wierdIncDec {
    static void method () {
        int numAdd = 5+6;
        System.out.println("numAdd = "+numAdd);
        // int numSub = 6-7;
        // int numMul = 40*10;
        // int numDiv = 3/6;
        // int numNegative = -numAdd;
        // JAVA FOLLOWS PEMDAS

        // Below operations were giving funky results.
        // so better not to use them
        // Even the easiest of operations were botched by these unary operators.

        /*
        I WAS MAKING A MISTAKE BY ASSIGNING THE INCREMENT OPERATOR.
        THIS IS NOT HOW IT IS SUPPOSED TO WORK. YOU CAN'T WRITE THIS:
        int num = anotherNum++;
        MAINLY BECAUSE ASSIGNMENT IS ALREADY IMPLIED IN THE INCREMENT
        OPERATOR. IT RETURNS A VALUE DEPENDING ON WHETHER IT IS PRE
        OR POST.
        */

        int numPreInc = numAdd + 1;
        System.out.println("numPreInc = "+numPreInc);
        // int numPostInc = numAdd++;
        // System.out.println("numPostInc = "+numPostInc);
        int numPreDec = numAdd - 1;
        System.out.println("numPreDec = "+numPreDec);
        // int numPostDec = numAdd--;
        // System.out.println("numPostDec = "+numPostDec);
    }
    public static void main (String[] args) {
        method();
    }
}