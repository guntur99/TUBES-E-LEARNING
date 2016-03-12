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
    
public class Mahasiswa
{
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

public class Quiz {
	private String namaQuiz;
	private String soalQuiz;
	private int nilaiQuiz;
	
	public Quiz(String namaQuiz, String soalQuiz, int nilaiQuiz) {
		this.namaQuiz = namaQuiz;
		this.soalQuiz = soalQuiz;
		this.nilaiQuiz = nilaiQuiz;
	}
	
	public void setNamaQuiz(String namaQuiz) {
		this.namaQuiz = namaQuiz;
	}
	
	public void setSoalQuiz(String soalQuiz) {
		this.soalQuiz = soalQuiz;
	}
	
	public void getNilaiQuiz(int nilaiQuiz) {
		this.nilaiQuiz = nilaiQuiz;
	}
	
	public String getNamaQuiz() {
		return namaQuiz;
	}
	
	public String getSoalQuiz() {
		return soalQuiz;
	}
	
	public int nilaiQuiz() {
		return nilaiQuiz;
	}
	
}
