package aData.types.m5.l3;

public class MethodVariableScope {

    public static void someMethod(int param1, int param2) {
        int localVar0 = 0;

        if(true) {
            int localVar1 = 0;
            if(true) {
                int localVar2 = localVar1;
            }
        } else {
            int localVar1 = 2;
            for(int i = 0; i < 10; i++) {
                int localVar2 = localVar1;
                //more code goes here
            }
        }

        int localVar3 = 3;
        while (true) {
            int localVar4 = param2;
            //more code goes here
        }

    }
}
