import java.util.Scanner;

public class luasKeliling {
    private String namaPersegi = "persegi";
    private String namaPersegiPanjang = "persegi panjang";
    private String namaSegitiga = "segitiga";
    private int panjang;
    private  int lebar;

    void luasPersegi(int panjangPersegi){
        this.panjang = panjangPersegi;
    }
    void luasPersegiPanjang(int panjang, int lebar){
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

    void printPersegiPanjang(){
        //System.out.println();
        int hasil1 = getPanjang() * getLebar();
    }

    void printPersegi(){
        //System.out.println();
        int hasil2 = getPanjang() * 2;
    }


}
