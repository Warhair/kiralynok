
package kiralynok;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Vezerlo {
 private String valsztas;

    public Vezerlo() {
        Valasztas();
    }
 public void Valasztas(){
     Scanner scanner = new Scanner(System.in);
     String valasz;
        do {
            System.out.println("Melyik alkalmazast szeretne futtatni? (g-c):");
            valasz = scanner.nextLine();

            if (valasz.equals("g")) {
                new Kiralynok_gui().setVisible(true);
            } else if (valasz.equals("c")) {
                Console_program();
            } else {
                System.out.println("Hibás válasz. Kérem, válasszon újra.");
            }
        } while (!valasz.equals("g") && !valasz.equals("c"));

        scanner.close();
    }
 public void Console_program(){
     System.out.println("4. feladat: Az üres tábla:");
        Tábla sakk = new Tábla('#');
        sakk.Megjelenít_conzol();

        // 6. feladat
        System.out.println("\n6. feladat: A feltöltött tábla:");
        sakk.Elhelyez(8);
         sakk.Megjelenít_conzol();

        // 9. feladat
        System.out.println("\n9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + sakk.getÜresOszlopokSzáma() + "\nSorok: " + sakk.getÜresSorokSzáma());

        // 10. feladat
        try {
            FileWriter myWriter = new FileWriter("tablak64.txt");
            for (int k = 0; k < 64; k++) {
                Tábla t = new Tábla('*');
                t.Elhelyez(k);
                String[] a = t.Fájlbaír();
                for (String p : a) {
                    myWriter.write(p);
                    myWriter.write("\n");
                }
                myWriter.write("\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
 }
}


