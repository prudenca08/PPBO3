/*
 * PRUDENCA AHMAD DAFFA KURNIA
 * 123190005   
 */
package pbo3;

public class Balok extends PersegiPanjang implements HitungRuang{

    double tinggi;

    public Balok(double panjang, double lebar, double inputTinggi) {
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.tinggi = tinggi;
    }

    public void setTinggi(double inputTinggi) {
        tinggi = inputTinggi;
    }
    
    
    public double hitungLuasPermukaan(){
        return 2*((panjang*lebar)+(lebar*tinggi)+(panjang*tinggi));
    }
    
    
    
    public double hitungVolume(){
        return panjang*lebar*tinggi;
    }

    
}
