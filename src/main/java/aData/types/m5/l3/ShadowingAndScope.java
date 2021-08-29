package aData.types.m5.l3;


/**
 *          SHADOWING only happens WHEN a LOCAL variable is
 *              DECLARED with the SAME NAME as EITHER a STATIC or an INSTANCE FIELD
 *      If this happens, the LOCAL VARIABLE overrides the STATIC or INSTANCE field
 *
 */
public class ShadowingAndScope {

    public static int memberVariable = 200;

    public void someMethod() {
        System.out.println(memberVariable); //200

        int memberVariable = 2;
        System.out.println(memberVariable); //2

        // The only way to access the STATIC field now, is by using the Class name as qualifier
        System.out.println(ShadowingAndScope.memberVariable); //200

    }

}
