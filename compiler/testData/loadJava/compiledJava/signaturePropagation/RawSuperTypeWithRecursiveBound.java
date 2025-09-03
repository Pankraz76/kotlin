package test;


public class RawSuperTypeWithRecursiveBound {

    public interface Super<T extends Super<T>> {
        void foo(T t);

        void dummy(); // To make it not SAM
    }

    public class Derived implements Super {
        public void foo(Object o) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void foo(Super o) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void dummy() {}
    }

}