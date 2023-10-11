public class Nilai {
    String Nama;
    String NIM;
    float NilaiAbsen, NilaiTugas, NilaiUTS, NilaiUAS, NilaiAkhir;

    void Nilai(){
        NilaiAbsen = NilaiAbsen * 10 / 100;
        NilaiTugas = NilaiTugas * 20 / 100;
        NilaiUTS = NilaiUTS * 30 / 100;
        NilaiUAS = NilaiUAS * 40 / 100;
        NilaiAkhir = NilaiAbsen + NilaiTugas + NilaiUTS + NilaiUAS;
    }

    void CetakNilai(){
        System.out.println("NIM         : "+NIM);
        System.out.println("Nama        : "+Nama);
        System.out.println("Nilai Absen : "+NilaiAbsen);
        System.out.println("Nilai Tugas : "+NilaiTugas);
        System.out.println("Nilai UTS   : "+NilaiUTS);
        System.out.println("Nilai UAS   : "+NilaiUAS);
        System.out.println("Nilai Akhir : "+NilaiAkhir);
    }
}
