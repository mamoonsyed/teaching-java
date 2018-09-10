class StaticClass {
    private static int objCount;
    
    public StaticClass() {
        objCount++;
    }

    public static int getObjCount() {
        return objCount;
    }
}

class StaticMain {
    public static void main(String[] args) {
        StaticClass class1 = new StaticClass();
        StaticClass class2 = new StaticClass();
        // StaticClass class3 = new StaticClass();
        System.out.println("number of objects created: "+StaticClass.getObjCount());
    }
}