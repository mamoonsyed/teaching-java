/*
look at the autoboxing feature introduced
since java 5. it makes the code look less
verbose. The compiler implements the
new ... code in the background. Although
beware of performance issues.
*/

class Autoboxing {
    public static void main(String[] args) {
        Integer boxedInt = 30; // not possible before java 5
        System.out.println("boxedInt: "+boxedInt);
        boxedInt++; // 
        System.out.println("boxedInt++ : "+boxedInt);
        int unboxedInt = boxedInt;

        System.out.println("unboxedInt: "+unboxedInt);
        
        // --------------------

        // Integer[] iList = new int[] {2,1,4};
        // -> error: incompatible types: int[] cannot be converted to Integer[]
    }
}