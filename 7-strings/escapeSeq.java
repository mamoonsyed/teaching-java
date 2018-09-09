class escapeSeq {
    public static void main (String[] args) {
        String s1 = "\"Mr.\"\n\tHow are you?\\";
        System.out.println(s1);
        System.out.println("'single quotes'"); // don't need escape sequence
        System.out.println("\"double quotes\"");
        char doubleQuote = '"'; // don't need escape sequence here either
        System.out.println(doubleQuote);
    }
}