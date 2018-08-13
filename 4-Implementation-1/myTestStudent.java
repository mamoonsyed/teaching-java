class myTestStudent {
    public static void main(String[] args) {
        int[] studentIds = {7001,7002,7003};
        myStudent student1 = new myStudent(7001, "Sarah");
        student1.gender = 'f';

        myStudent student2 = new myStudent(7002, "Donald");
        student1.gender = 'm';
        
        myStudent student3 = new myStudent(7003, "Jeff");
        student1.gender = 'm';

        // System.out.println("Name of first student: "+ student1.name);
        // System.out.println("Name of first student: "+ student2.name);
        // System.out.println("Name of first student: "+ student3.name);  

        if (student1 == student2) {
            System.out.println("student1 and student2 are referencing same objects.");
        } 
        if (student1 != student2) {
            System.out.println("student1 and student2 are referencing different objects.");
        }
        
        myStudent student4 = null;
        student4 = student1;
        if (student4 != null && ((student2 == student4) || (student4 == student1))) { // just to teach you object reference checking.
            System.out.println("student4's name is: "+student4.name);
        }
        // Exception in thread "main" java.lang.NullPointerException
    }
}
