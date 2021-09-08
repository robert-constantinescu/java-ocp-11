package dExceptionHandling.m2;

import java.util.Locale;

public class Ex03TryCatchFlow {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = null;
        try {
            sb.append("a");
            str.toUpperCase(Locale.ROOT);
            sb.append("b");
        }
        catch (IllegalArgumentException e) {
            sb.append("c");
        }
        catch (Exception e) {
            sb.append("d");
        }
        finally {
            sb.append("e");
        }
        sb.append("f");

        System.out.println(sb);

    }
}
