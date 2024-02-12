/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiralynok;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tegze
 */
public class Consol {
    
        public void consol_alkalmazas() {
        Tábla tábla = new Tábla('#');
        Scanner scanner = new Scanner(System.in);
        System.out.println("4. feladat: Üres tábla:");
        tábla.Megjelenít_conzol();
        tábla.Elhelyez(8);
        System.out.println("\n6. feladat: A feltöltött tábla:");
        tábla.Megjelenít_conzol();
        System.out.println("9. feladat: Üres oszlopok száma");
        System.out.println("\nOszlopok: " + tábla.getÜresOszlopokSzáma());
        System.out.println("Sor: " + tábla.getÜresSorokSzáma());

        // Write the table contents to a file
        try {
            File file = new File("tablak64.txt");
            FileWriter writer = new FileWriter(file);

            // Get the table contents as an array of strings
            String[] tableContents = tábla.Fajlbaír();

            // Write each row of the table to the file
            for (String row : tableContents) {
                writer.write(row + "\n");
            }

            writer.close();
            System.out.println("File 'tablak64.txt' létrehozva.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Closing scanner
        scanner.close();
    }
   
}
