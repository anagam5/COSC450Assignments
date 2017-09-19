package GamboaP2;
/**
 *
 * @author anagam5
 */

/*
2. Write a Java socket program to do a Diffie-Hellman (DH) key exchange as follows. 
The client A and server B must perform the given actions in order as specified below:
Client A actions
Asks user at A to enter prime q as a string
Asks user at A to enter a possible primitive root of q (alpha) as a string
Test if alpha is a primitive root; if not, reenter alpha and test
Asks user at A to enter A’s private key X(A) as an integer
Uses Diffie-Hellman to generate A’s public key Y(A) and prints Y(A)
Uses the socket to send q, alpha, A’s public key Y(A), and A’s email address to the server B
Uses the socket to receive the information sent by the server B 
Uses Diffie-Hellman to generate the shared key K and prints K.
Server B actions
Uses the socket to receive q, alpha, A’s public key Y(A), and A’s email address from A
Ask user at B to enter B’s private key X(B) as a string
Uses Diffie-Hellman to generate B’s public key Y(B) and print Y(B)
Uses the socket to send server B’s public key Y(B) and email address to the client A 
Uses Diffie-Hellman to generate the shared key K and prints K.
*/

public class P2 {
    
}
