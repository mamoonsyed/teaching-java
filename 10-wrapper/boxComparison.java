/*
comparing two boxed primitives using "==" does not work simply because
that would compare the object reference, because wrapped primitive is
an object not a value. you can use i2.intValue() method to compare values
alternatively, i1.equals(i2) also works.
i1 < i2 works, because it unboxes before comparison. 
*/

class BoxComparison {
    public static void main(String[] args) {

        // using deprecated format for declaring and assigning wrapped primitive
        Integer i1 = new Integer(0);
        Integer i2 = new Integer(0);
        System.out.println("old i1 == i2: "+(i1==i2)); // false
        /*
        above problem is because == and != operators perform identity
        comparison. which is not true in this case
        */

        // solution # 1        
        System.out.println("i1.intValue()==i2.intValue(): "+
                           (i1.intValue()==i2.intValue())); // true

        // solution # 2
        System.out.println("(i1.equals(i2): "+
                           (i1.equals(i2))); // true

        // now using auto-boxing format
        Integer i3 = 0;
        Integer i4 = 0;
        System.out.println("auto i3 == i4: "+(i3==i4)); // true

        /*
        "<" or ">" works on values even while declared using old method.
        <= >= also have same behavior, these operators perform auto-unboxing.
        but does not work with other kinds of object references
        */
        System.out.println("i1<i2: " + (i1<i2)); // false
    }
}