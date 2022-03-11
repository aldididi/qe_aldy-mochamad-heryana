public class Manusia {
    int usia;
    String nama;
    String jenisKelamin;

    public Manusia(int u){
        usia = usia;
    }

    public Manusia(int u, String n, String jnsKelamin){
        usia = usia;
        nama = n;
        jenisKelamin = jnsKelamin;
    }

    void bernafas(String nama){
        System.out.println(nama+ " sedang nafas");
    }

    void bicara(String nama){
        System.out.println(nama+ " sedang bicara");
    }

    void berkenalan(String nama){
        System.out.println("saya adalah " + nama);
    }

    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setUsia(int usia){
        this.usia= usia;
    }

    public String getJenisKelamin(){
        return jenisKelamin;
    }

    public String getNama(){
        return nama;
    }

    //public String

    public static void main(String[] args){
        Manusia orang1 = new Manusia(22, "didi", "lelaki");
        Manusia orang2 = new Manusia(22, "diva", "perempuan");

        orang2.berkenalan("anjayyy");
    }
}
