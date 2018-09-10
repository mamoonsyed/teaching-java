class FinalClass {
    private static int idInit = 1000;
    private final int id;

    public FinalClass() {
        id = ++idInit;
        System.out.println("id: "+id);
    }
}

class FinalMain {
    public static void main(String[] args) {
        FinalClass fc1 = new FinalClass();
        FinalClass fc2 = new FinalClass();
        FinalClass fc3 = new FinalClass();
    }
}

/*
id: 1001
id: 1002
id: 1003
*/