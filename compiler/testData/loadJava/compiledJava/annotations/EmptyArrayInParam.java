package test;


public interface EmptyArrayInParam {

    public @interface MyAnnotation {
        String[] value();
    }

    @MyAnnotation({})
    public class A {

    }
}
