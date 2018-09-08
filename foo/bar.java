/*
You can compile this from same folder but you can't
run the class file from foo folder. for that you 
have to go to src folder where /com/cstldr/foo
folder structure exists. then run the following:
"java com.cstldr.foo.bar"
and it will work, for windows it will work if you
have "." in your classpath environment variable.
foo folder has only been created to demo how to 
create a package.
if you want to run above command from the foo folder
you're gonna have to add this folder to the classpath
variable.
"javac -d ../classes com/cstldr/packages/foo.java"
above command will replicate the com/... folder structure
in the classes folder.
*/
package com.cstldr.foo;
class bar {
    static void method() {
        System.out.println("Inside method ...");
    }
    public static void main(String[] args) {
        method();
    }
}