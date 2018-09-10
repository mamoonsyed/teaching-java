class StatClass {
    public static int a = 0;    
    static {
        // static initializers can also be used to catch exceptions.
        a = addFive(a);
        System.out.println("Static block, value of a after adding 5: "+a);
    }
    public static int addFive(int x) {
        return (x+5);
    }
}

class StatMain {
    public static void main(String[] args) {
        System.out.println("main method, value of a: "+StatClass.a);
        StatClass sc1 = new StatClass();
        System.out.println("after sc1 initialized, value of a: "+StatClass.a);
        int y = StatClass.addFive(10);
        System.out.println("after StatClass.addFive(10);, value of a: "+StatClass.a);
        System.out.println("y: "+y);
    }
}
/*
Static block, value of a after adding 5: 5
main method, value of a: 5
after sc1 initialized, value of a: 5
after StatClass.addFive(10);, value of a: 5
y: 15
*/
