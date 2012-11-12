package md.victordov.lab.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import md.victordov.lab.ListersUtils.HibernateUtil;
import md.victordov.lab.vo.Student;
import md.victordov.lab.vo.Student;
import md.victordov.lab.vo.Student;

public class StudentDAO implements Serializable, GenericDAO<Student> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Session session;

	public List<Student> retrieve() {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		List<Student> list = session.createQuery("from Student").list();
		List<Student> allUsers = list;
		tx.commit();
		return allUsers;

	}

	public Student retrieve(int id) {
		session = HibernateUtil.getSessionFactory().openSession();

		System.out.println("getting Student instance with id: " + id);

		try {
			Student instance = (Student) session.get(Student.class, id);
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

	public boolean create(Student t) {
		boolean status = true;
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(t);
		tx.commit();
		return status;
	}

	public boolean update(Student t) {
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
		Student p;
		p = (Student) session.get(Student.class, id);
		session.delete(p);
		tx.commit();
		return status;
	}

}
