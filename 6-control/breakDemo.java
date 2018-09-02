// this program demonstrate break and labelled break
// feature of java programming language.
// break is also used with switch case, see "switchCase.java"
// for its use there.

class breakDemo {
    public static void main (String[] args) {
        int num0 = 0;
        for (int i = 0; i<=10; i+=1) {
            for (int j =0; j<=5; j+=1) {
                num0++;
                if (num0 ==15) break;
            }
        }
        System.out.println("num0 = "+num0); // 63
        
        int num1 = 0;
        outer: for (int i = 0; i<=10; i+=1) {
            for (int j =0; j<=5; j+=1) {
                num1++;
                if (num1 ==15) break outer;
            }
        }
        System.out.println("num1 = "+num1); // 15
    }
}