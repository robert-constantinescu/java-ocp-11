package dExceptionHandling.m2;

public class MyResource implements AutoCloseable {

    private String name;

    public MyResource(String name) {
        this.name = name;
    }

    @Override
    public void close() {
        System.out.println("Closing resource #: " + this.name);
    }
}
