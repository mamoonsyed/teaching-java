class myTestStudent {
    public static void main(String[] args) {
        myStudent student1 = new myStudent(7001, 'f', "Sarah");
        myStudent student2 = new myStudent(7002, 'm', "Donald");
        myStudent student3 = new myStudent(7003, 'm', "Jeff");

        System.out.println("Student 2's name: "+student2.getName());
        student2.setName("Steve");
        System.out.println("After changing: "+student2.getName());
    }
}
