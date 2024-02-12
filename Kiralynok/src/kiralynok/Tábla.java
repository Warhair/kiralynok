
package kiralynok;

import java.util.Random;



public class Tábla {
     private char[][] T;
    private char ÜresCella;

    public Tábla(char ch) {
        T = new char[8][8];
        ÜresCella = ch;
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                T[i][j] = ch;
    }
    
    public void Megjelenít_conzol() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.print(T[i][j]);
            System.out.println();
        }
    }
 
    
     public void Elhelyez(int N) {
        Random r = new Random();
        int n = 0;
        for (int k = 0; k < N; k++) {
            do {
                n = r.nextInt(64);
            } while (T[n / 8][n % 8] == 'K');
            T[n / 8][n % 8] = 'K';
        }
    }
     public boolean ÜresOszlop(int a) {
        int i = 0;
        while (i < 8 && T[i][a] != 'K')
            i++;
        return i == 8;
    }
     
    public boolean ÜresSor(int a) {
        int i = 0;
        while (i < 8 && T[a][i] != 'K')
            i++;
        return i == 8;
    }

    public int getÜresOszlopokSzáma() {
        int db = 0;
        for (int i = 0; i < 8; i++)
            if (ÜresOszlop(i))
                db++;
        return db;
    }

    public int getÜresSorokSzáma() {
        int db = 0;
        for (int i = 0; i < 8; i++)
            if (ÜresSor(i))
                db++;
        return db;
    }
    
     public String[] Fájlbaír() {
        String s;
        String[] st = new String[8];
        for (int i = 0; i < 8; i++) {
            s = "";
            for (int j = 0; j < 8; j++)
                s += T[i][j];
            st[i] = s;
        }
        return st;
    }
    
     
    
    
}
