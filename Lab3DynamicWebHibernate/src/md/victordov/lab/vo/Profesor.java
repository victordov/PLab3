package md.victordov.lab.vo;

import java.io.Serializable;

public class Profesor implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Profesor() {

    }

    public Profesor(int P_ProfesorID, String P_Nume, String P_Prenume,
	    String P_Adresa) {
    	super();
	this.profesorId = P_ProfesorID;
	this.nume = P_Nume;
	this.prenume = P_Prenume;
	this.adresa = P_Adresa;

    }

    public int getProfesorId() {
	return profesorId;
    }

    public void setProfesorId(int p_id) {
	this.profesorId = p_id;
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

    public String getAdresa() {
	return adresa;
    }

    public void setAdresa(String adresa) {
	this.adresa = adresa;
    }

    private int profesorId;
    private String nume;
    private String prenume;
    private String adresa;
}
