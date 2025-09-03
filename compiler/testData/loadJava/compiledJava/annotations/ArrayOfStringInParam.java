package test;


public interface ArrayOfStringInParam {

    public @interface MyAnnotation {
        String[] value();
    }

    @MyAnnotation({"a", "b", "c"})
    public class A {

    }
}
