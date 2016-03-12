/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guntur
 */
public class Mahasiswa {
    private String namaMhs; //deklrasi variabel
	private long nim; //deklarasi variabel
	private String jurusan; //deklarasi variabel
	private String jenisKelamin; //deklarasi variabel
	public Mahasiswa(){} //default constructor
	public Mahasiswa(String namaMhs,long nim, String jurusan, String jenisKelamin) //constructor
	{
		this.namaMhs=namaMhs;
		this.nim=nim;
		this.jurusan=jurusan;
		this.jenisKelamin=jenisKelamin;
	}
	public void setNamaMhs(String namaMhs)
	{
		this.namaMhs=namaMhs;
	}
	public void setNim(long nim)
	{
		this.nim=nim;
	}
	public void setJurusan(String jurusan)
	{
		this.jurusan=jurusan;
	}
	public void setJenisKelamin(String jenisKelamin)
	{
		this.jenisKelamin=jenisKelamin;
	}
	public String getNamaMhs()
	{
		return namaMhs;
	}
	public long getNim()
	{
		return nim;
	}
	public String getJurusan()
	{
		return jurusan;
	}
	public String getJenisKelamin()
	{
		return jenisKelamin;
	}
	public void display()
	{
		System.out.println(namaMhs);
		System.out.println(nim);
		System.out.println(jurusan);
		System.out.println(jenisKelamin);
	}
}
