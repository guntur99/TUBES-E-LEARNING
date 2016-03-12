/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guntur
 */
public class Orang {
    	private String nama;
	private int id;
	
public Orang (String nama, int id) {
	this.nama = nama;
	this.id   = id; 
}

public void setNama (String nama) {
	this.nama = nama;
}

public String getNama () {
	return nama;
}

public void setId (int id) {
	this.id = id;
}

public int getId (){
	return id;
}
	
}
