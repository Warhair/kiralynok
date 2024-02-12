
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
    
    public void Megjelenít() {
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
    
    
}
