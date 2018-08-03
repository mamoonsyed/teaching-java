class user {
    int id;
    String name;
    int salary;
    
    // a constructor cannot invoke itself. 

    user(int userId, String name) {
        id = userId;
        this.name = name; // here this.name is used to refer to the instance variable.
                          // The ones before this method declaration.
    }

    // String testName;
    // above is a instance variable, and we can't use
    // instance variables in the constructors, because
    // they haven't been initialized yet.
    user(int userId, String userName, int userSalary) {
        this(userId, userName);
        // error: recursive constructor invocation.
        // this(userId, userName, userSalary);
        // above line is calling this constructor
        // recursively. which is illegal. Another
        // Another example would be for the constructors to
        // invoke each other. which also results in the same error.

        // Note that this() should be the first statement
        // in the constructor, and also it should not be 
        // repeated. it is used to avoid code repitition
        // while overloading constructors.
        salary = userSalary;
    }
    
    public static void main (String[] args) {
        user instructor = new user(586, "transmatter", 500);
        System.out.println("User name: "+ instructor.name);
        // above statement tells if the overloaded constructor
        // with this() statement worked correctly or not.

        /*
        OUTPUT:
        User name: transmatter
        */

    }

}