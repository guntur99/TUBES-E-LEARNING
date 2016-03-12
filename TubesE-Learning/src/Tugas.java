/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guntur
 */
public class Tugas {
    private String namaTugas;
	private String jenisTugas;
	private int nilaiTugas;
	
	public Tugas(String namaTugas, String jenisTugas, int nilaiTugas) {
		this.namaTugas = namaTugas;
		this.jenisTugas = jenisTugas;
	}
	
	public void setNamaTugas(String namaTugas) {
		this.namaTugas = namaTugas;
	}
	
	public void setJenisTugas(String JenisTugas) {
		this.jenisTugas = jenisTugas;
	}
	
	public void setNilaTugas(int nilaiTugas) {
		this.nilaiTugas = nilaiTugas;
	}
	
	public String namaTugas() {
		return namaTugas;
	}
	
	public String jenisTugas() {
		return jenisTugas;
	}
	
	public int nilaiTugas() {
		return nilaiTugas;
	}

}
