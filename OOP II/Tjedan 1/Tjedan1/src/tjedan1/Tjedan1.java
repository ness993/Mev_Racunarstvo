/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tjedan1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 *
 * @author mev
 */




public class Tjedan1 {

    Vector vec = new Vector();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tjedan1 App = new Tjedan1();
        System.out.println(Tjedan1.class.getResource(""));
        App.upisPodataka();
        App.ispisVektora();
        App.naistarija();
    }
    
    void upisPodataka()
    {
        //String path= getClass().getClassLoader().getResource(".").getPath();
        try {
        BufferedReader bufferRead=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Upisite podatke o osobama");

    for(int i =1;i<=3;i++)
    {
        System.out.println("Upis " + i + ".osobe");
        Osoba osoba = new Osoba();
        System.out.print("Ime: ");
        osoba.setIme(bufferRead.readLine());
        System.out.print("Prezime: ");
        osoba.setPrezime(bufferRead.readLine());
        System.out.print("Godina rodenja: ");
        String god = bufferRead.readLine();
        osoba.setGodina(Integer.parseInt(god));
        System.out.print("Spol: ");
        osoba.setSpol(bufferRead.readLine().charAt(0));
        vec.add(osoba);
    }
    }
     catch (IOException e)
        {
             e.printStackTrace();
        }

    }
    
    void ispisVektora(){
        for (int x =0; x<vec.size();x++){
            Osoba data=(Osoba)vec.elementAt(x);
            data.ispis();
        }
    }
    void naistarija(){
        Osoba majstarija=new Osoba("Najstarija","Osoba",999999,'m');
        int privremena=0;
         for (int x =0; x<vec.size();x++){
            Osoba data=(Osoba)vec.elementAt(x);            
            if (data.getGodina() < majstarija.getGodina()){
                majstarija = data;
            }
         }
         System.out.println("Najstarija osoba  je ");
         majstarija.ispis();
    }
}


