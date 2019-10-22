package Assignments.lesson9.Question10;


@FunctionalInterface
public interface TriFunction<S,T,U,R> {
	R apply(S x, T t, U u);
}
