/*
 * PRUDENCA AHMAD DAFFA KURNIA
 * 123190005   
 */

package pbo3;

public class PersegiPanjang implements HitungBidang {
    public double panjang, lebar;

    public void setPanjang(double inputPanjang) {
        panjang = inputPanjang;
    }

    public void setLebar(double inputLebar) {
        lebar = inputLebar;
    }

    

    
    public double hitungKeliling(){
        return 2*(panjang+lebar);
    }

    
    public double hitungLuas(){
        return panjang*lebar;
    }

    
    
}
