package Gun34._01_Soru;

public class Otobus extends Arac{ //subclass , childclass

    int yolcuKapasitesi;
    public Otobus(String renk, int motorHacmi, String marka,int yolcuKapasitesi) {
        super(renk, motorHacmi, marka);
        setYolcuKapasitesi(yolcuKapasitesi);
    }


    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }


    @Override
    public String toString() {
        return super.toString() +" "+"\nYolcu Kapasite durumu =" + this.yolcuKapasitesi;
    }
}

