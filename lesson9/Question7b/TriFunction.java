package Assignments.lesson9.Question7b;


@FunctionalInterface
public interface TriFunction<S,T,U,R> {
	R apply(S x, T t, U u);
}
