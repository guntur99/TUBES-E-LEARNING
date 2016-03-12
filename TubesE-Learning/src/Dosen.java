/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guntur
 */
public class Dosen extends Orang {
    private int nKelas;
	private Kelas [] daftarKelas;
	
	public Dosen (String nama, int Id){
		//super.(nama,Id);
	}

	public void createKelas (String namaKelas){
		daftarKelas [nKelas] = new Kelas;
		nKelas++;
	}
}
