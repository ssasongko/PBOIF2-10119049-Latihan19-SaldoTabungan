/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan19.saldotabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program menampilkan saldo tabungan
 */
public class PBOIF210119049Latihan19SaldoTabungan {

    public static void tampilSaldo(double saldoAwal,int bunga,int lamaBulan){
        //init var & assign value
        int i = 1;
        double saldoSemt = saldoAwal;
             
        // set money value
        DecimalFormat kursID = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol(" Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursID.setDecimalFormatSymbols(formatRp);
        
        // logic        
        while(i != lamaBulan){
            System.out.println("Saldo di bulan ke-" + i + kursID.format(saldoSemt = saldoSemt + (saldoSemt *bunga/100)));
            i++;
        }    
    } 
    public static void main(String[] args) {
        // init var
        double saldoAwal;
        int bunga, lamaBulan;
                   
        // assign var
        saldoAwal = 2500000;
        bunga = 15;
        lamaBulan = 6;
        
        // call procedure
        tampilSaldo(saldoAwal,bunga,lamaBulan);
    }
    
}
