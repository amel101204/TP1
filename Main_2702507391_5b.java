public class Main_2702507391_5b{
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int c = 8;
        
        // Operator Logis 
        boolean hasil1 = (a > b) && (b < c); // Operator AND
        boolean hasil2 = (a > b) || (b > c); // Operator OR
        boolean hasil3 = !(a == b);         // Operator NOT
        
        // Menampilkan hasil
        System.out.println("Hasil dari a > b AND b < c: " + hasil1);
        System.out.println("Hasil dari a > b AND b > c:" + hasil2);
        System.out.println("Hasil dari NOT (a == b): " + hasil3);
        
    }
}