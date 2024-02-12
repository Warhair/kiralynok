/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiralynok;

import java.util.Scanner;

/**
 *
 * @author tegze
 */
public class Consol {
    
        public void consol_alkalmazas(){
        Tábla tábla = new Tábla('#');
        Scanner scanner = new Scanner(System.in);
        System.out.println("4. feldat: Ures tabla:");
        tábla.Megjelenít_conzol();
        tábla.Elhelyez(8);
        System.out.println("\n6. feladat: A feltoltott tabla:");
        tábla.Megjelenít_conzol();
            System.out.println("9.feladat: Ures oszlopok szama");
        System.out.println("\nOszlopok: " + tábla.getÜresOszlopokSzáma());
        System.out.println("Sor: " + tábla.getÜresSorokSzáma());

        scanner.close();
}
   
}
