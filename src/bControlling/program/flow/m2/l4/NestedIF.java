package bControlling.program.flow.m2.l4;

public class NestedIF {

    public static void main(String[] args) {
        int students = 0;
        int rooms = 4;

        if (students > 0)
            if (rooms > 0)
                System.out.println("Students per room: " + students/rooms);
        /* WITHOUT any BRACKETS, THE below ELSE will be ASSOCIATED with the NEAREST IF(rooms > 0)*/
         else
            System.out.println("NO STUDENTS");


        /*============================================================================================================*/
        /*======================= SAME AS ABOVE, BUT WITH BRACKETS ===================================*/

        if (students > 0) {
            if (rooms > 0)
                System.out.println("Students per room: " + students / rooms);
            /* WITHOUT any BRACKETS, THE below ELSE will be ASSOCIATED with the NEAREST IF(rooms > 0)*/
        }
        else
            System.out.println("NO STUDENTS");

    }
}
