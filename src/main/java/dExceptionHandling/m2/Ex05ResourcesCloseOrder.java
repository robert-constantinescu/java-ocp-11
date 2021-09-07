package dExceptionHandling.m2;

public class Ex05ResourcesCloseOrder {


    public static void main(String[] args) {

        try (var one = new MyResource("One");
             var two = new MyResource("two")) {
            throw new RuntimeException();
        }
    }
}
