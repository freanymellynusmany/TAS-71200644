package com.uas.prakrplbo;

public abstract class Monster implements MonsterInterface{
    private String nama;

    public Monster(String nama){
        this.nama = nama;
    }

    public abstract String bersuara();

    public void getInfo(){
        System.out.println("Nama:" + getNama());
        System.out.println("Suara : " + bersuara());
        String gerakan ="";
        if (this instanceof Cyclops){
            gerakan ="Berjalan";
            System.out.println("Jalan: " +getNama() + " " + gerakan + "....");
        } else if(this instanceof Manticore){
            gerakan =" Terbang";
            System.out.println("Jalan" + getNama()+ " " + gerakan + "...." );
        }else if(this instanceof Cerberus){
            gerakan =" Berlari";
            System.out.println("Jalan" + getNama()+ " " + gerakan + "...." );
        }
    }

    public String getNama(){
        return this.nama;
    }
}
