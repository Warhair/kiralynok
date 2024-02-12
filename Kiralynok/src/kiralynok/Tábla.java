
package kiralynok;



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
    
}
