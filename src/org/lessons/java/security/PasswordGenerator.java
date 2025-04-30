package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Scrivi il tuo nome");
        String nome = in.nextLine();
        System.out.println("Scrivi il tuo cognome");
        String cognome = in.nextLine();
        System.out.println("Scrivi il tuo colore preferito");
        String colore = in.nextLine();
        System.out.println("Scrivi il giorno della tua data di nascita");
        int giorno = in.nextInt();
        System.out.println("Scrivi il mese della tua data di nascita");
        int mese = in.nextInt();
        System.out.println("Scrivi l'anno della tua data di nascita");
        int anno = in.nextInt();

        System.out.println("Ecco la tua password: " + nome + "-" + cognome + "-" + colore + "-" + (giorno + mese + anno));
    }
}
