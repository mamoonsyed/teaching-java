class switchCase {
    static void method () {
        /*
        I'm going to implement same chain of logic
        as in previous ifElse.java program. But only
        this time using switch-case. which is to 
        demonstrate that both methods can be used to
        do this task. I personally prefer if-else
        because of its flexibility. There is a reason why
        there is no switch-case-default control structure
        in python.
        We cannot use long datatype with switch-case
        */

        int x = 10;
        switch(x) {
            case 8:
                System.out.println("x is 8!");
                break;
            case 9:
                System.out.println("x is 9!");
                break;
            case 10:
                System.out.println("x is 10!");
                break;
            case 11:
                System.out.println("x is 11!");
                break;
            default:
                System.out.println("x is none of the above!!");
        }
    }
    public static void main (String[] args) {
        method();
    }
}