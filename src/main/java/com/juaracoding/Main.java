package com.juaracoding;

public class Main {
    public static void main(String[] args) {

        Atm atm = new Atm(1000);

        System.out.println("Saldo awal : "+atm.lihatSaldo());

        atm.setorUang(1000);
        System.out.println("Saldo setelah penyetoran : "+atm.lihatSaldo());

        atm.tarikUang(500);
        System.out.println("Saldo setelah penarikkan : "+atm.lihatSaldo());

    }
}