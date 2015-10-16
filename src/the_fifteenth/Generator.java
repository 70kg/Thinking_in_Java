package the_fifteenth;

public interface Generator<T> {
	T next();
	T next(Class<?>...agrs);
}
