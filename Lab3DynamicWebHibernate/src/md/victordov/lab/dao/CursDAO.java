package md.victordov.lab.dao;

import java.util.ArrayList;
import java.util.Collection;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import md.victordov.lab.util.HibernateUtil;
import md.victordov.lab.vo.Curs;

public class CursDAO implements GenericDAO<Curs> {

	public CursDAO() {

	}

	@Override
	public Collection<Curs> retrieve() {
		Collection<Curs> c = new ArrayList<Curs>();
		return c;
	}

	@Override
	public Curs retrieve(int id) {
		Session session = null;

		session = HibernateUtil.getSessionFactory().getCurrentSession();

		System.out.println("getting Curs instance with id: " + id);

		try {
			Curs instance = (Curs) session.get(Curs.class, id);
			if (instance == null) {
				System.out.println("get successful, no instance found");
			} else {
				System.out.println("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			System.out.println("get failed");
			re.printStackTrace();
			throw re;
		} finally {
			session.close();
		}

	}

	@Override
	public boolean create(Curs t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Curs t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
