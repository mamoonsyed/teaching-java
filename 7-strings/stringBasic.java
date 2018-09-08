class stringBasic {
    public static void main(String[] args) {
        System.out.println("inside main ...");
        String s = "hello world!";
        System.out.println("string s = "+s);

        // getting string's attributes
        System.out.println("string's length: "+s.length());
        System.out.println("string is empty?? "+s.isEmpty());

        // comparison
        System.out.println("s.equals(\"HELLO WORLD!\"): "+s.equals("HELLO WORLD!"));
        System.out.println("s.equalIgnoreCase(\"HELLO WORLD!\"): "+s.equalsIgnoreCase("HELLO WORLD!"));
        System.out.println("s.compareTo(\"HELLO WORLD!\"): "+s.compareTo("HELLO WORLD!"));

        // searching
        System.out.println("s.contains(\"HELLO WORLD!\"): "+s.contains("HELLO WORLD!"));
        System.out.println("s.contains(\"world\"): "+s.contains("world"));
        System.out.println("s.startswith(\"h\"): "+s.startsWith("h"));
        System.out.println("s.startswith(\"hello world!\"): "+s.startsWith("hello world!"));
        System.out.println("s.indexOf(\"o\"): "+s.indexOf("o"));
        System.out.println("s.lastIndexOf(\"o\"): "+s.lastIndexOf("o"));
        
        // Examining individual characters
        System.out.println("s.charAt(4): "+s.charAt(4));

        // Extracting substrings
        System.out.println("s.substring(4): "+s.substring(4));
        System.out.println("s.substring(4, 9): "+s.substring(4, 9)); // does not include 9th index

    }
}