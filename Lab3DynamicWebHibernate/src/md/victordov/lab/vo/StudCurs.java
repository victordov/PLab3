package md.victordov.lab.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudCurs implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int stud_curs_id;
	private int student_id;
	private int curs_id;

	public StudCurs(){
		
	}
	
	public int getStud_curs_id() {
		return stud_curs_id;
	}

	public void setStud_curs_id(int stud_curs_id) {
		this.stud_curs_id = stud_curs_id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getCurs_id() {
		return curs_id;
	}

	public void setCurs_id(int curs_id) {
		this.curs_id = curs_id;
	}

}
