package md.victordov.lab.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import md.victordov.lab.ListersUtils.HibernateUtil;
import md.victordov.lab.vo.Profesor;

public class ProfesorDAO implements Serializable, GenericDAO<Profesor> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Session session;

	public List<Profesor> retrieve() {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		List<Profesor> list = session.createQuery("from Profesor").list();
		List<Profesor> allUsers = list;
		tx.commit();
		return allUsers;

	}

	@Override
	public Profesor retrieve(int id) {

		session = HibernateUtil.getSessionFactory().openSession();

		System.out.println("getting Profesor instance with id: " + id);

		try {
			Profesor instance = (Profesor) session.get(Profesor.class, id);
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
		}
	}

	public boolean create(Profesor t) {
		boolean status = true;
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(t);
		tx.commit();
		return status;
	}

	public boolean update(Profesor t) {
		boolean succes = true;
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(t);
		tx.commit();
		return succes;
	}

	public boolean delete(int id) {
		boolean status = true;
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Profesor p;
		p = (Profesor) session.get(Profesor.class, id);
		session.delete(p);
		tx.commit();
		return status;
	}

}
