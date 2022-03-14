package javaapplication2.Polimorphisme.Latihan3;

public class Pegawai {
    String nama;
    int gaji;
    Pegawai(){
        
    }
    
    Pegawai(String nm){
        this.nama = nm;
        System.out.println("Pegawai");
    }
    public int gaji(){
        return 0;
    }
}
