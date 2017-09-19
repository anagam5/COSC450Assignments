package GamboaP1;
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
    
}
