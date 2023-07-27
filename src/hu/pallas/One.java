package hu.pallas;

public class One {
	private String szoveg;
	
	public String getSzoveg() {
		return szoveg;
	}

	public void setSzoveg(String szoveg) {
		this.szoveg = szoveg;
	}
	
	public void kiiras() {
		for (int szam = 0; szam < 10; szam++) {
		System.out.print(szoveg + ", ");
	}
}}