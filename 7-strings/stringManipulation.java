class stringManipulation {
    public static void main(String[] args) {
        System.out.println("inside main ...");
        String s = "     hello world!   ";
        System.out.println("string s = "+s);

        // Case conversion
        System.out.println("s.toUpperCase(): "+s.toUpperCase());
        System.out.println("s.toLowerCase(): "+s.toLowerCase());

        // trimming, replacing and splitting
        System.out.println("s.trim(): "+s.trim());
        System.out.println("replace all o's with r's: "+s.replaceAll("o","r"));
        System.out.println("splitting by white space: ");
        String[] sSplit = s.split(" ");
        for(String temp : sSplit) {
            System.out.println(temp);
        }

        // Static string method:
        System.out.println("String.valueOf(1.3): "+1.3);
        System.out.println("String.valueOf(1.3): "+String.valueOf(1.3)); // converts other datatypes into strings
    }
}