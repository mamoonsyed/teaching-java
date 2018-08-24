// https://stackoverflow.com/questions/3875114/why-use-a-for-loop-instead-of-a-while-loop
// see this link to see why you shouldn't use while loop instead of a for loop.
// use this loop when you don't know the number of iterations.
// like for example when reading a file, or
class whileLoop {
    public static void main (String[] args) {
        while (true) {
            System.out.print("Enter a string: ");
            String name = System.console().readLine();
            System.out.println("you entered: "+name);
            // press CTRL-C to halt this loop for now.
            // better techniques in later chapters.
        }
    }
}