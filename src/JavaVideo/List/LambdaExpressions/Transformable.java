package JavaVideo.List.LambdaExpressions;

@FunctionalInterface
public interface Transformable<T> {
    T transform(T t);
}
