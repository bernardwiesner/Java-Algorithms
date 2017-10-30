
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author android-hw
 * sieve of Eratosthenes
 */
public class SieveOfEratosthenes {
    
    public static void main(String[] args) {
        
        int number = 1000000;
        
        boolean[] primes = new boolean[number+1];

        int top = (int)Math.sqrt(number);
        
        for (int i = 2; i <= top; i++) {
            
            if(primes[i] == false){
                
                for (int j = i*i; j <= number; j+=i ) {
                    primes[j] = true;
                }
            }
        }
        
        for (int i = 2; i < primes.length; i++) {
            if(primes[i] == false){
            System.out.println(i);    
            }
            
        }
    }
    
}
