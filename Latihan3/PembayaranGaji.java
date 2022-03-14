package javaapplication2.Polimorphisme.Latihan3;

class PembayaranGaji {
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();
        if (peg instanceof Direktur)
            uang += ((Direktur)peg).tunjangan();
        
        if (peg instanceof Staf)
            uang += ((Staf)peg).tunjangan();
        
        return uang;
    }
    
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staf ali = new Staf();
        Direktur Tony = new Direktur();
        System.out.println("Gaji Staf : " + pg.hitungGaji(ali));
        System.out.println("Gaji DIrektur : " + pg.hitungGaji(Tony));
    }
}