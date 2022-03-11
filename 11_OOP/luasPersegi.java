public class luasPersegi {
    final private String nama = "Persegi Panjang";
    private int panjang;
    private int lebar;


    //input nilai
    void luasPersgipanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    void setData(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    int getPanjang(){
        return this.panjang;
    }

    int getLebar(){
        return this.lebar;
    }

    void cetak(){

        int hasil = getPanjang() * getLebar();
        System.out.println("Hasil: "+getPanjang()+" X "+getLebar()+" = "+hasil);
    }

}



public class printHasil{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        luasPersegipanjang luas = new luasPersegipanjang();

        System.out.print("Masukkan panjang persegi panjang: ");

        int panjang = input.nextInt();
        System.out.print("Masukkan lebar persegi panjang:  ");

        int lebar = input.nextInt();

        luas.setData(panjang, lebar);


        luas.cetak();
    }


}