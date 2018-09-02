class continueDemo {
    public static void main(String[] args) {
        // continue
        int num0 = 0;
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (i==5 && j==5) continue;
                num0++;
            }
        }
        System.out.println("num0 = "+num0); // 99
        
        // Labelled continue
        int num1 = 0;
        outer: for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                if (i==5 && j==5) continue outer;
                num1++;
            }
        }
        System.out.println("num1 = "+num1); // 95
    }
}