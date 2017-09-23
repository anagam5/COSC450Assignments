package GamboaP1;
import java.util.Scanner;
/**
 *
 * @author anagam5
 */

/*
1. Write a Java program that asks the user to enter a single hex value H and a small text string T.
1.1 The program first uses AES in counter mode as follows:
Encrypts the 16-byte value S consisting of T padded on the right with zeros (if necessary) with the key K, 
where K is the 16-byte value consisting of H repeated 32 times, and the counter is initialized to the 16-byte 
value consisting of all zeros. It then prints the encrypted result in hex.
1.2 Next, it authenticates the original 16-byte value S above using HMAC SHA256 with the same key K above 
and with the IV for HMAC SHA 256 taken to be the 32-byte value S concatenated with itself. It then 
prints the final computed HMAC result in hex.
*/
public class P1 {
    public static void main(String[] args) {
        String h, t;
        String k = "";
        String s = "";
        String counter = "";
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        
        System.out.println("Enter a single hex value (1-9, A-F): ");
        h = input.nextLine();
        
        while (hexValidation(h) == false) {
            System.out.println("Invalid input. Try again.\nEnter a single hex value (1-9, A-F): ");
            h = input.nextLine();
        }
        
        System.out.println("Enter a small text string: ");
        t = sc.next();
        
        counter = buildCounter(counter);
        h = hexToBinary(h);
        k = buildK(k, h);
        
        if (t.length() > 16)
            t = t.substring(0, 16);
        s = stringToBinary(t);
        
        
        
        System.out.println("k = " + k + "\nc = " + counter + "\ns = " + s);
        
    }
    
    public static Boolean hexValidation(String hex) {
        if (hex.length() != 1)
            return false;
        if (hex.matches("-?[0-9a-fA-F]+")) 
            return true;
        return false; 
    }
    
    public static String hexToBinary(String hex) {
        int num = Integer.parseInt(hex,16);    
        return Integer.toBinaryString(num);
    }
    
    public static String stringToBinary(String text) {
        Boolean pad = false;
        int len = 0;
        if (text.length() < 16) {
            len = 16 - text.length();
            pad = true;
        }
        //text = text.replaceAll("\\s+","");
        StringBuilder binary = new StringBuilder();
        byte[] bytes = text.getBytes();
        for (byte b : bytes) {
            int val = b;
            for (int ix = 0; ix < 8; ix++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
        }
        if (pad == true) {
            for (int ix = 0; ix < len; ix++) {
                binary.append("00000000");
            }   
        }
        return binary.toString();
    }
    
    public static String buildCounter(String c) {
        for (int i = 0; i < 16; i++) {
            c = c + "00000000";
        }
        return c;
    }
    
    public static String buildK(String k, String h) {
        for (int i = 0; i < 32; i++) {
                k += h;
        }
        return k;
    }
}
