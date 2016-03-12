/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubese.learning;

/**
 *
 * @author Guntur
 */
public class TubesELearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    

public class Matakuliah {
	private String namaMatkul;
	private int sks;
	
	public Matakuliah (String namaMatkul, int sks) {
		this.namaMatkul = namaMatkul;
		this.sks = sks;
	}
	
	public void setNamaMatkul(String namaMatkul) {
		this.namaMatkul = namaMatkul;
	}
	
	public void setSks(int sks){
		this.sks = sks;
	}
	
	public String getNamaMatkul() {
		return namaMatkul;
	}
	
	public int getSks() {
		return sks;
	}
}

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

}


