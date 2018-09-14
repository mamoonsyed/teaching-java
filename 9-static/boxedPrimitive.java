/*
There are corresponding classes for the 
primitive datatypes as follows:
int ~ Integer
long Long
byte Byte
short Short
float Float
double Double
boolean Boolean
char Character

these classes help us work with these primitive
types in some cases. and provide some useful
methods.
*/

class boxedPrimitive {
    public static void main(String[] args) {
        
        Integer i1 = new Integer(25);
        // -> warning: [deprecation] Integer(int) in Integer has been deprecated
        Boolean b1 = new Boolean(true);
        // -> warning: [deprecation] Boolean(boolean) in Boolean has been deprecated

        System.out.println("b1: "+Boolean.valueOf(b1));
        System.out.println("i1: "+Integer.valueOf(i1));

        int i2 = Integer.parseInt("34");
        System.out.println("i2: "+i2);

        Character c1 = new Character('/');
        System.out.println("c1 is a letter or a digit? "+Character.isLetterOrDigit(c1)); // false

        Double d1 = new Double(0.0/0.0);
        System.out.println("Double: d1 is NaN?"+Double.isNaN(d1)); // true

        // -----------------

        // ArrayList l1 = new ArrayList();
        // l1.add(123); // Legal after java 5
        // l1.add(new Integer(456)); // legal even before java 5

        // -----------------

        i2 = Integer.valueOf(34); // more resource-efficient method to box.
        // int i3 = i2.intValue(); // error: int cannot be dereferenced
        System.out.println("i2: "+i2);


    }
}