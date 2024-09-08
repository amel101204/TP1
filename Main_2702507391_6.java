public class Main_2702507391_6 {
    public static void main(String[] args) {
        int a = 5; // Representasi biner: 0101
        int b = 3; // Representasi biner: 0011
        
        // Operator Bitwise AND (&) 
        int hasilAND = a & b;
        System.out.println("Hasil dari a & b: " + hasilAND); // Output: 1 (biner: 0001)
        
        // Operator Bitwise OR (&) 
        int hasilOR = a | b;
        System.out.println("Hasil dari a | b: " + hasilOR); // Output: 7 (biner: 0111)
     
        // Operator Bitwise XOR (&) 
        int hasilXOR = a ^ b;
        System.out.println("Hasil dari a ^ b: " + hasilXOR); // Output: 6 (biner: 0110) 
        
        // Operator Bitwise NOT (~)
        int hasilNOT_a = ~a;
        int hasilNOT_b = ~b;
        System.out.println("Hasil dari ~a: " + hasilNOT_a); // Output: -6 (biner: 1111111111111010)
        System.out.println("Hasil dari ~b: " + hasilNOT_b); // Output: -4 (biner: 1111111111111100)
        
        // Operator Bitwise Left Shift (<<)
        int hasilLeftShift = a << 1;
        System.out.println("Hasil dari a << 1: " + hasilLeftShift); // Output: 10 (biner: 1010)
        
        //Operator Bitwise Right Shift (>>)
        int hasilRightShift = a >> 1;
        System.out.println("Hasil dari a >> 1: " + hasilRightShift); // Output: 2 (biner: 0010)
       
    }
}