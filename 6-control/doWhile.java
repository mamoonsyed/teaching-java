// https://stackoverflow.com/questions/8661559/reading-and-checking-strings-from-user-input
// check first answer: you can not use == when comparing String, because its not a primitive datatype.

class doWhile {
    static String getInput() {
        System.out.print("Enter a string: ");
        String name = System.console().readLine();
        System.out.println("you entered: "+name);
        return name;
    }

    public static void main(String[] args) {
        String name;
        do { // use do-while for things you want to run at least once.
            name = getInput();
        } while (!("mamoon".equals(name)));
    }
}