package com.cstldr.oop.white;
import com.cstldr.oop.black.BlackChild;

public class WhiteCousin {
    public static void main(String[] args) {
        System.out.println("WhiteParent.privateMember: "+WhiteParent.privateMember);
        
        System.out.println("WhiteParent.defaultMember: "+WhiteParent.defaultMember);
        System.out.println("WhiteChild.defaultMember: "+WhiteChild.defaultMember);
        
        System.out.println("WhiteParent.protectedMember: "+WhiteParent.protectedMember);
        System.out.println("WhiteChild.protectedMember: "+WhiteChild.protectedMember);
        System.out.println("BlackChild.protectedMember: "+BlackChild.protectedMember);
        
        System.out.println("WhiteParent.publicMember"+WhiteParent.publicMember);
        System.out.println("WhiteChild.publicMember"+WhiteChild.publicMember);
    }
}