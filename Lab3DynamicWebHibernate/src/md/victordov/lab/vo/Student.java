package md.victordov.lab.vo;

import java.io.Serializable;

public class Student implements Serializable{

   

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Student() {

    }

    public Student(int s_s_id, String s_nume, String s_prenume,
	    String s_grupa, String s_email, String s_telFix) {
    	super();
	this.setStudentId(s_s_id);
	this.setNume(s_nume);
	this.setPrenume(s_prenume);
	this.setGrupa(s_grupa);
	this.setEmail(s_email);
	this.setTelFix(s_telFix);
    }

    public int getStudentId() {
	return studentId;
    }

    public void setStudentId(int s_id) {
	this.studentId = s_id;
    }

    public String getNume() {
	return nume;
    }

    public void setNume(String nume) {
	this.nume = nume;
    }

    public String getPrenume() {
	return prenume;
    }

    public void setPrenume(String prenume) {
	this.prenume = prenume;
    }

    public String getGrupa() {
	return grupa;
    }

    public void setGrupa(String grupa) {
	this.grupa = grupa;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getTelFix() {
	return telFix;
    }

    public void setTelFix(String telFix) {
	this.telFix = telFix;
    }

    private int studentId;
    private String nume;
    private String prenume;
    private String grupa;
    private String email;
    private String telFix;

}
