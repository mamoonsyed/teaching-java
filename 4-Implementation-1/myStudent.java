 class myStudent {
    int id;
    char gender;
    String name;

    // Never give return type with a constructor.
    // previously I wrote void, due to which i had to comment a lot of lines of
    // code and search for the bug all over the place. because of the following error:
    /*
    error: constructor myStudent in class myStudent cannot be applied to given types;
        myStudent student1 = new myStudent(7001, "Sarah");
                             ^
    required: no arguments
    found: int,String
    reason: actual and formal argument lists differ in length
    */
    
    myStudent(String name) {
        this.name = name;
    }

    myStudent(int id, String name) {
        this(name);
        // this.name = name;
        this.id = id;
    }

    // any of the constructors can come first.
    // i.e. it is not necessary that the this() call
    // is made in the later constructor. but looks cleaner and 
    // more understandable if this is called afterwards.

    boolean updateProfile(String name) {
        this.name = name;
        return true;
    }
    // following logic is common in such updating operations.
    // i.e. we want to return old value for various reasons.
    // String updateProfile(String name) {
    //     String oldName = this.name;
    //     this.name = name;
    //     return oldName;
    // }
}