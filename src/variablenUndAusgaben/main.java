package variablenUndAusgaben;

import java.sql.SQLOutput;

public class main {

    public static void main(String[] args) {

        //Name in Variable speichern und ausgeben
        String name = "Larissa Blachfelder";
        System.out.println(name);

        //Alter in Variable speichern und ausgeben
        int alter = 19;
        System.out.println(alter);




        //Aufgabe4

        String fachhochschuleKufsteinTirol = "Fachhochschule Kufstein Tirol";

        //variablenname verkürzen

        String fhKufsteinTirol = "Fachhochschule Kufstein Tirol";

        //In Konstante umwandeln und umbenennen

        final String FH_KUFSTEIN_TIROL = "Fachhochschule Kufstein Tirol";




        //aufgabe 5
        final String aufgabe5;

        //ALT+Command+L markiert das unnötige ;


        //aufgabe6

        System.out.println("Java verwendet für Strings \"doppelte Anführungszeichen\" und einzelne Anführungszeichen \'c\' um einzelne Zeichen zu definieren.");
        System.out.println("Durch \\ kann man auch den Backslash beliebig oft ausgeben: \\\\\\\\");

        // \b löscht den vorherigen Buchstaben \n macht eine neue Zeile und \t setzt einen Tabulator
        System.out.println("Ich verwende den\b Backspace, die Newline\n und den \tTabulator.");

        //der teil vor \r wird überschrieben und \f macht in der Konsole nichts
        System.out.println("Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \r überschreibt die bestehende Zeile. \f ist in der Konsole nicht bemerkbar, da es einen Seitenumbruch erzwingt.");

    }


}
