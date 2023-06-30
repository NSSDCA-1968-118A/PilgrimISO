public interface DataAccessor<T> {
	T retrieve(String identifier);
	boolean remove(T entity);
	boolean modify(T entity);
	boolean persist(T entity);
}
