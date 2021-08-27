package aData.types.m5.l2;

/**
 *           a MEMBER is AN ASPECT of a CLASS that can BE INHERITED
 *
 *
 *      MEMBERS:
 *          - static (class) field; A MEMBER
 *          - instance field; A MEMBER
 *          - static (class) method; A MEMBER
 *          - instance method; A MEMBER
 *
 *
 *      NOT MEMBERS:
 *          - static initializer; NOT A MEMBER
 *          - instance initializer; NOT A MEMBER
 *          - constructor; NOT A MEMBER
 *
 *
 *     MEMBERS and CONSTRUCTORS can be assigned ACCESS MODIFIERS.
 *          - private
 *          - 'empty' (package-private)
 *          - protected
 *          - public
 *
 *     An ACCESS MODIFIER tells you if a FIELD or METHOD can be INHERITED BY OTHER CLASSES
 *
 *
 *
 *
 */

public class MembersAndScope {

    /**
     *  a MEMBER is AN ASPECT of a CLASS that can BE INHERITED
     */

    static { /* static initializer; NOT A MEMBER */}

    { /* instance initializer; NOT A MEMBER */ }

    // static (class) field; A MEMBER
    public static int staticField = 1;

    // instance field; A MEMBER
    // instance filed can only be ACCESSED by INSTANCE methods
    public int instanceField = 1;

    // static (class) method; A MEMBER
    public static void aStaticMethod() {  }

    // instance method; A MEMBER
    public void anInstanceMethod() {}

    // constructor; NOT A MEMBER
    public MembersAndScope() { }

}
