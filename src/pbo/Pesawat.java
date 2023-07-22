
package pbo;
//class
public class Pesawat {
    //atribut dan encapsulation
    private String nama;
    private String np;
    
    //construtor
    public Pesawat(String nama, String np) {
        this.nama = nama;
        this.np = np;
    }

    //mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNp(String np) {
        this.np = np;
    }

    //accessor
    public String getNama() {
        return nama;
    }

    public String getNp() {
        return np;
    }
    
    public String displayInfo(){
        return "Nama: "+getNama()+" \nNP: "+getNp();
    }
    
    //polymophis
    public String displayInfi(String maskapai){
        return displayInfo() + "\nMaskapai : "+maskapai;
    }
}
