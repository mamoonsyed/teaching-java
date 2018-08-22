// Java program to demonstrate working of System.console()
// Note that this program does not work on IDEs as 
// System.console() may require console
class consoleInput {
    public static void main(String[] args) {        
        // Using Console to input data from user
        System.out.print("Enter a string: ");
        String name = System.console().readLine();
        System.out.println("you entered: "+name);
    }
}