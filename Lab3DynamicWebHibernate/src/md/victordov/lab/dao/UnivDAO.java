package md.victordov.lab.dao;

import java.io.Serializable;
import java.util.List;

import md.victordov.lab.ListersUtils.HibernateUtil;
import md.victordov.lab.vo.Universitate;
import md.victordov.lab.vo.Universitate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UnivDAO implements GenericDAO<Universitate>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Session session;

	/**
	 * @author victor Clasa UnivDAO - Universitate Data Access Object, classa
	 *         destinata sa faca legatura dintre baza de date si utilizator
	 *         gestionind clasa Universitate Executa 4 tipuri de functii CRUD
	 */

	public UnivDAO() {

	}

	public List<Universitate> retrieve() {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		List<Universitate> list = session.createQuery("from Universitate")
				.list();
		List<Universitate> allUsers = list;
		tx.commit();
		return allUsers;

	}

	public Universitate retrieve(int id) {
		session = HibernateUtil.getSessionFactory().openSession();

		System.out.println("getting Universitate instance with id: " + id);

		try {
			Universitate instance = (Universitate) session.get(
					Universitate.class, id);
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

	public boolean create(Universitate t) {
		boolean status = true;
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(t);
		tx.commit();
		return status;

	}

	public boolean update(Universitate t) {
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
		Universitate p;
		p = (Universitate) session.get(Universitate.class, id);
		session.delete(p);
		tx.commit();
		return status;
	}

}
