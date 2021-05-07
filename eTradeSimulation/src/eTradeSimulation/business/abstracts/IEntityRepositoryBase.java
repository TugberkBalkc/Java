package eTradeSimulation.business.abstracts;

import java.util.List;

public interface IEntityRepositoryBase<T> {
	List<T> getAll();
	void delete(T entity);
	void add(T entity);
}
