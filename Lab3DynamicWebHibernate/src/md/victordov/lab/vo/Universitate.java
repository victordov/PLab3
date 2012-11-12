package md.victordov.lab.vo;

import java.io.Serializable;

public class Universitate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int universitateId;
	private String numeUniversitate;
	private String adresa;
	private String telefon;

	public Universitate() {

	}

	public Universitate(int u_ID, String u_Denumirea, String u_Adresa,
			String u_Telefon) {
		super();
		this.setUniversitateId(u_ID);
		this.setNumeUniversitate(u_Denumirea);
		this.setAdresa(u_Adresa);
		this.setTelefon(u_Telefon);
	}

	public int getUniversitateId() {
		return universitateId;
	}

	public void setUniversitateId(int u_id) {
		this.universitateId = u_id;
	}

	public String getNumeUniversitate() {
		return numeUniversitate;
	}

	public void setNumeUniversitate(String nume_univer) {
		this.numeUniversitate = nume_univer;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

}
