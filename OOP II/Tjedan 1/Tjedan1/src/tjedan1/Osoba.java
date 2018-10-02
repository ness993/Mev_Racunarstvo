/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tjedan1;

/**
 *
 * @author mev
 */
public class Osoba {
    
    private String ime;
    private String prezime;
    private int godina;
    private char spol;

    public Osoba() {
        
    }
    
    public Osoba(String ime, String prezime, int godina, char spol) {
        this.ime = ime;
        this.prezime = prezime;
        this.godina = godina;
        this.spol = spol;
    }

    
    
    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public char getSpol() {
        return spol;
    }

    public void setSpol(char spol) {
        this.spol = spol;
    }

    /**
     * Get the value of ime
     *
     * @return the value of ime
     */
    public String getIme() {
        return ime;
    }

    /**
     * Set the value of ime
     *
     * @param ime new value of ime
     */
    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

       

  
    
    public void ispis()
    {
        System.out.println("Ime i prezime: " + ime+" "+prezime);
        System.out.println("Godina rodenja: "+ godina);
        System.out.println("Spol: "+(spol=='Z' ? "Zenski":"Muski"));
                
    }

}
