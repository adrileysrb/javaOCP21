package functional_interfaces;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
