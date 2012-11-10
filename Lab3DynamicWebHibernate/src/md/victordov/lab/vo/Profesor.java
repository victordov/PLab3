package md.victordov.lab.vo;

public class Profesor {

    public Profesor() {

    }

    public Profesor(long P_ProfesorID, String P_Nume, String P_Prenume,
	    String P_Adresa) {
    	super();
	this.profesorId = P_ProfesorID;
	this.nume = P_Nume;
	this.prenume = P_Prenume;
	this.adresa = P_Adresa;

    }

    public long getProfesorId() {
	return profesorId;
    }

    public void setProfesorId(long p_id) {
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

    private long profesorId;
    private String nume;
    private String prenume;
    private String adresa;
}
