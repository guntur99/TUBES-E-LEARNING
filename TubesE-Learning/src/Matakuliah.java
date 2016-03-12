/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guntur
 */
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
