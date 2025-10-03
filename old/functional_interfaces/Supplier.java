package functional_interfaces;

@FunctionalInterface
public interface Supplier<T> {
    T get();
}
