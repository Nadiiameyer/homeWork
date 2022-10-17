package org.example;

public class Main {
    public static void main(String[] args) {
        String name = "Nadiia";
        String job = "Fotografin";
        String alter = "26";
        String geburtsOrt = "Cherson/Ukraine";

showGreeting();
        System.out.println("Ich heiße " +name + ". Ich arbeite als " + job + ". Ich bin " +alter + " Jung.Ich bin in " + geburtsOrt + " geboren.");

    }
public static void showGreeting() {
    Integer hour = 11  ;

    if (hour < 12) {
        System.out.println("Guten Morgen!");
    } else {
        if (hour < 18) {
            System.out.println("Guten Tag!");
        } else {
            System.out.println("Guten Abend!");
        }
    }
}
}