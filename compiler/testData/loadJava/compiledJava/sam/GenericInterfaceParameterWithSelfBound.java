package test;


public interface GenericInterfaceParameterWithSelfBound<T extends GenericInterfaceParameterWithSelfBound<T>> {
    T method(T t);
}
