package pbo;

import java.util.Scanner;

public class PesawatJaya {
    public static void main(String[] args) {
        //objek
        //Pesawat pst = new Pesawat("Garuda Indonesia","210112");
        
        //System.out.print(pst.displayInfo());
        //System.out.print(pst.displayInfi("GA"));
        
        //Error Handiling 
        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);

            //array
            PesawatDetail[] pst = new PesawatDetail[2];

            for(int i=0; i<pst.length; i++){
                System.out.print("Masukkan Nama Pesawat "+(i+1)+" : ");
                String nama = scanner.nextLine();
                System.out.println("Masukkan Kode Pesawat "+(i+1)+" : ");
                String np = scanner.nextLine();

            //objek
            pst[i] = new PesawatDetail(nama, np);
            }

            for(PesawatDetail data: pst){
                System.out.println("================");
                System.out.println("Data Pesawat :");
                System.out.println(data.displayInfo());

            }
        } catch (NumberFormatException e){
            System.out.println("Kesalahan Format Nomor: "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format Np: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Kesalahan umum: " +e.getMessage());
        }
    }
}