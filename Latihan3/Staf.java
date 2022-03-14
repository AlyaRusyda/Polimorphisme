package javaapplication2.Polimorphisme.Latihan3;

public class Staf extends Pegawai {
    private static final int gajiStaf = 50000;
    private static final int bonusStaf = 10000;
    
    @Override
    public int gaji(){
        return gajiStaf;
    }
    
    public int tunjangan(){
        return bonusStaf;
    }
}