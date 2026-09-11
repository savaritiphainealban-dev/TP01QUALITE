package com.exemple;

public class App {

    // Notre "feature add"
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App calculatrice = new App();
        int resultat = calculatrice.add(5, 7);
        System.out.println("Le résultat de 5 + 7 est : " + resultat);
    }
}