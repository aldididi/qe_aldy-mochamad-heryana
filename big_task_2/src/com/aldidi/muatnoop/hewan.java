package com.aldidi.muatnoop;

public class hewan {
    public class Hewan {
        public int beratBadan;
        public int usia;
        public int maxMuatan;
        public int listHewan;
        public String kelamin;

        public Hewan(int u, String nama, String jenisKelamin, int bb){
            usia = u;
            nama = nama;
            kelamin = jenisKelamin;
            beratBadan = bb;
        }

        public void setBeratBadan(int beratBadan){
            this.beratBadan = beratBadan;
        }

    }
}
