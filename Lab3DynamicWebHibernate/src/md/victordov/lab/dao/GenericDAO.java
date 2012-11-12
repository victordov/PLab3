package md.victordov.lab.dao;

import java.util.List;


public interface GenericDAO<T> {

	List<T> retrieve();

	T retrieve(int id);

	boolean create(T t);

	boolean update(T t);

	boolean delete(int id);

}
