class InstClass {
    public InstClass () {
        System.out.println ("inside no-arg constructor");
    }
    public InstClass (int num) {
        System.out.println ("inside constructor w/ args");
    }
    // following is the instance initializer.
    {
        System.out.println ("inside instance initializer");
    }
}

class InstMain {
    public static void main (String[] args) {
        InstClass ic1 = new InstClass ();
        InstClass ic2 = new InstClass (5);
    }
}