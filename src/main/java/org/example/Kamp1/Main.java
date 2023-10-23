package org.example.Kamp1;

public class Main {
    public static void main(String[] args) {
        // Java'da değişken isimlendirmelerinde camelCase kullanılır.

        String ortaMetin = "İlginizi çekebilir!";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);
        System.out.println("---------------------");

        // integer
        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.20;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equals.svg";
            System.out.println(okYonu);
        }

        System.out.println("---------------------");

        // array

        String[] krediler = {
                "Hızlı Kredi",
                "Mutlu emekli Kredisi",
                "Konut Kredisi",
                "Çiftçi Kredisi",
                "Msb Kredisi",
                "Meb Kredisi",
                "Kültür Bakanlığı Kredisi"
        };
        System.out.println(krediler[0]);

        System.out.println("---------------------");

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }

    }
}