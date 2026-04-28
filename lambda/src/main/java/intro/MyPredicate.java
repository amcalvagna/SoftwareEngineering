package intro;

public interface MyPredicate<T, Q> {
    boolean test(T t, Q q);
}
