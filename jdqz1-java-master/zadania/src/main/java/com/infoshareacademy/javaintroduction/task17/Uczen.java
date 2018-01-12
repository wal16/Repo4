package com.infoshareacademy.javaintroduction.task17;

/**
 * Created by waldemar on 2018-01-06.
 */

    public class Uczen {
        private String imie;
        private String nazwisko;
        private double[] oceny;


        Uczen(String imie, String nazwisko, double[] oceny) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.oceny = oceny;
        }

        public String getImie() {
            return imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public double[] getOceny() {
            return oceny;
        }

        public void srednia() {
            double suma=0;
            for (double ocena : oceny){
                suma += ocena;
            }
            double srednia = suma/oceny.length;
            System.out.println("Średnia ucznia " + this.imie + " to: " + srednia);
        }

        public void maksymalna(){
            if (oceny.length>0) {
                double maksymalna = 0;
                for (double ocena : oceny) {
                    if (maksymalna<ocena) {
                        maksymalna = ocena;
                    }
                }
                System.out.println("Maksymalna ocena ucznia " + this.imie + " to: " + maksymalna);
            }
            else
                System.out.println("Zero ocen");
        }

        public void minimalna(){
            if (oceny.length>0) {
                double minimalna = 0;
                for (double ocena : oceny) {
                    if (minimalna>ocena) {
                        minimalna = ocena;
                    }
                }
                System.out.println("Minimalna ocena ucznia " + this.imie + " to: " + minimalna);
            }
            else
                System.out.println("Zero ocen");

        }
        public void wypiszOceny() {
            for (double ocena : oceny) {
                System.out.print(ocena + " ");
            }
            System.out.println();
        }

    }

