public class Sepeda {
    float kecepatan;
    int gear,cek;

    
    public Sepeda (float newKecepatan, int newGear){
        kecepatan = newKecepatan;
        gear = newGear;
    }

    public Sepeda() {
        
    }

    public void tambahKecepatan(float Increment) {
        if (cek > 20) { 
        } else {
            kecepatan += Increment;
        }
        
    }

    public void kurangiKecepatan(float decrement) {
        if (cek < 0) {
        } else {
            kecepatan -= decrement;
        }
    }

    public void cetakInfo() {
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println("Gear : " + gear);
        System.out.println("===================");
    }
}

