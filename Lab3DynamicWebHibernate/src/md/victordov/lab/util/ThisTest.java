package md.victordov.lab.util;

import md.victordov.lab.vo.Curs;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class ThisTest {
	
	public static void main(String[] args) {
		Session session = null;

		try {
			session = HibernateUtil.getSessionFactory().openSession();

			Curs curs = new Curs();
			System.out.println("Inserting Record");
			Transaction tx = session.beginTransaction();
			curs.setCursId(12);
			curs.setNumeCurs("nume Acum");
			curs.setProfesorId(2);
			curs.setUniversitateId(2);
			session.save(curs);
			Curs instance = (Curs) session.get(
					Curs.class, 2);
			System.out.println(instance.getNumeCurs());
			tx.commit();
			session.flush();
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println("Eroare cursDetail");
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
