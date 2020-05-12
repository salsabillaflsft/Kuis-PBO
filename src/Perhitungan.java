public class Perhitungan extends Mahasiswa implements Penilaian {
    private float nilaiAkhir;
    private float tulis,coding,wawancara,microJaringan;

    public Perhitungan( int nim, String nama, float tesTulis, float tesCoding, float tesWawancara, float tesMicroJaringan){
        super(nim,nama);
        this.tulis = tesTulis;
        this.coding = tesCoding;
        this.wawancara = tesWawancara;
        this.microJaringan = tesMicroJaringan;
    }

    @Override
    public void nilaiAkhir() {
        nilaiAkhir = (tulis+coding+wawancara+microJaringan)/4;
        System.out.println("Nilai Akhir: "+nilaiAkhir);
    }

    @Override
    public void keterangan() {
        if(nilaiAkhir>85){
            System.out.println();
            System.out.println("LOLOS");
            System.out.print("Selamat kepada (" +super.getNim()+ ") telah diterima ");
        }
        else{
            System.out.println();
            System.out.println("Gagal");
            System.out.print("Mohon maaf kepada (" +super.getNim()+ ") telah ditolak ");
        }

    }
}
