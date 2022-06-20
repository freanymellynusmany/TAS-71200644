package com.uas.prakrplbo;

public class Evolusi extends Monster{
    private Monster monster1;
    private Monster monster2;

    public Evolusi(Monster monster1,Monster monster2){
        super(monster1.getNama() + " " + monster2.getNama());
        this.monster1 = monster1;
        this.monster2 = monster2;
    }

    public String bergerak(){
        String gerakan =" ";
        if (monster2 instanceof Cyclops){
            gerakan =  "Berjalan";
        } else if(monster2 instanceof Cerberus){
            gerakan =  "Berlari";
        }else if(monster2 instanceof Manticore){
            gerakan = "Terbang";
        }
        return gerakan;
    }

    public String bersuara(){
        String suara = "";
        for  (int i = 0; i < 8; i++) {
            if (i % 2 == 0){
                suara += monster2.bersuara().charAt(i);
            }else {
                suara += monster1.bersuara().charAt(i);
            }
        }
        return suara;
    }


}

