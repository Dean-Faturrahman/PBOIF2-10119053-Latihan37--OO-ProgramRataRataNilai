/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rataNilai;

/**
 *
 * @author Dean
 */
public class RataNilai {
    public int n;
    public double jumlah;
    public double nilai;
    public double rata;
    
    public double hitungJumlah(){
        jumlah += nilai;
        return jumlah;
    }
    
    public double hitungRata(){
        return jumlah / n;
    }

}
