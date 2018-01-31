package com.example.student.rejstracjawizyt;

/**
 * Created by student on 2018-01-31.
 */

public class lekarze {
        public String Nazwisko;
        public String Specjalizacja;

        public lekarze(String nazwisko,String specjalizacja){
            Nazwisko=nazwisko;
            Specjalizacja=specjalizacja;
        }
    public String getNazwisko(){
        return Nazwisko;
    }
    public String getSpecjalizacja(){
        return Specjalizacja;
    }
    public void SetNazwisko(String nazwisko){
        Nazwisko=nazwisko;
    }
    public void SetSpecjalizacja(String specjalizacja){
        Specjalizacja=specjalizacja;
    }
}
