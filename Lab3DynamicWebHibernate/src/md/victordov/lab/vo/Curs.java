package md.victordov.lab.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Curs implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int cursId;
	private String numeCurs;
	private int universitateId;
	private int profesorId;
	
	

	public Curs() {
	
	}

	public Curs(int ID, String Num_Curs, int U_ID, int P_ID) {
		super();
		this.setCursId(ID);
		this.setNumeCurs(Num_Curs);
		this.setUniversitateId(U_ID);
		this.setProfesorId(P_ID);
	}

	public int getCursId() {
		return cursId;
	}

	public void setCursId(int c_id) {
		this.cursId = c_id;
	}

	public String getNumeCurs() {
		return numeCurs;
	}

	public void setNumeCurs(String nume_curs) {
		this.numeCurs = nume_curs;
	}

	public int getUniversitateId() {
		return universitateId;
	}

	public void setUniversitateId(int u_id) {
		this.universitateId = u_id;
	}

	public int getProfesorId() {
		return profesorId;
	}

	public void setProfesorId(int p_id) {
		this.profesorId = p_id;
	}

	public void printCurs() {
//				this.getNumeCurs(), this.getUniversitateId(),
//				this.getProfesorId());
	}
}
