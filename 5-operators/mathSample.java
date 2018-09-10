class mathSample {
    public static void main(String[] args) {
        System.out.println("divide zero by zero: "+0.0/0.0); // NaN
        System.out.println("take sqrt of negative num: "+Math.sqrt(-2)); // NaN
        System.out.println("take sqrt of 5: "+Math.sqrt(5));
        System.out.println("2 raised to the power 3: "+Math.pow(2, 3));
        System.out.println("Random number between 0.0 to 5.0: "+(int)(Math.random()*5));
        System.out.println("rounded 21.525: "+Math.round(21.525));
        System.out.println("floored 21.525: "+Math.floor(21.525));
        System.out.println("ceil 21.525: "+Math.ceil(21.525));
        System.out.println("89 is bigger or 32: "+Math.max(89, 32));
    }
}