package com.cstldr.oop.white;

/**
    This class extends WhiteParent class and thus,
    everything is accessible except privateMember.
 */

public class WhiteChild extends WhiteParent {
    public static void main(String[] args) {
        
        // inaccessable
        System.out.println("privateMember"+privateMember);

        // inherited members are directly accessibe
        System.out.println("defaultMember: "+defaultMember);
        System.out.println("protectedMember: "+protectedMember);
        System.out.println("publicMember: "+ publicMember);
    }
}