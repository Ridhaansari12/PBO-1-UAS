package pbo;

//inheritance
public class PesawatDetail extends Pesawat {
    
    //overriding
    public PesawatDetail(String nama, String np) {
        super(nama, np);
    }
    
    public int getKodePesawat(){
        return Integer.parseInt (getNp().substring(0, 2)) + 2000;
    }
    
     public String getJenis(){
         String kodeJen = getNp().substring(2, 4);
         //seleksi switch
         switch(kodeJen){
             case "01":
                 return "VIP";
             case "02":
                 return "Biasa";
             default :
                 return "Yang lain";
         }
     }
    
     public String getMaskapai(){
        String kodeMas = getNp().substring(0, 2);
        //selksi if
        if(kodeMas.equals("01")){
            return "Garuda Indonesia";
        } else {
            return "Yang lain";
        }
    }
     
     public int getNoPenerbangan(){
         return Integer.parseInt(getNp().substring(6));
     }
     
     //polymorphism
    @Override
     public String displayInfo(){
         return super.displayInfo()+
                 "\nKodePesawat :"+getKodePesawat()+
                 "\njenis :"+getJenis()+
                 "\nMaskapai :"+getMaskapai()+
                 "\nNomorPenerbangan :"+getNoPenerbangan();
     }
}
