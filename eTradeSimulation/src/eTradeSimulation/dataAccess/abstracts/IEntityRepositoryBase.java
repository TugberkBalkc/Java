package eTradeSimulation.dataAccess.abstracts;

import java.util.List;

public interface IEntityRepositoryBase<T> {
	List<T> getAll();
	void add(T entity);
	void delete(T entity);
	T getByEmail(String email);
}
