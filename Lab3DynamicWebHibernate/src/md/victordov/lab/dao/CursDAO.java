package md.victordov.lab.dao;

import java.io.Serializable;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import md.victordov.lab.ListersUtils.HibernateUtil;
import md.victordov.lab.vo.Curs;
import md.victordov.lab.vo.Curs;


public class CursDAO implements Serializable, GenericDAO<Curs> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Session session;

	public CursDAO() {

	}

	@Override
	public List<Curs> retrieve() {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		List<Curs> list = session.createQuery("from Curs").list();
		List<Curs> allUsers = list;
		tx.commit();
		return allUsers;
	}

	@Override
	public Curs retrieve(int id) {
		Session session = null;

		session = HibernateUtil.getSessionFactory().openSession();

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
		}

	}

	@Override
	public boolean create(Curs t) {
		boolean status = true;
		
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(t);
		tx.commit();
		return status;
	}

	@Override
	public boolean update(Curs t) {
		boolean succes = true;
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(t);
		tx.commit();
		return succes;
	}

	@Override
	public boolean delete(int id) {
		boolean status = true;
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Curs p;
		p = (Curs) session.get(Curs.class, id);
		session.delete(p);
		tx.commit();
		return status;
	}

}
