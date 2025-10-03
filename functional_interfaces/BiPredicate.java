package functional_interfaces;

@FunctionalInterface
public interface BiPredicate<T extends CharSequence, U extends CharSequence> {
    boolean test(T t, U u);

    public default String duplicateString(T t, U u) {
        return t.subSequence(0, 1).toString() + u.subSequence(0, 1).toString();
    }
}
