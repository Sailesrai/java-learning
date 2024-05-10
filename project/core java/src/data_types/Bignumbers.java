package data_types;

import java.math.BigInteger;

public class Bignumbers {
 public static void main(String[] args) {
	

	BigInteger a = BigInteger.valueOf(Long.MAX_VALUE);
	BigInteger b = BigInteger.valueOf(Long.MAX_VALUE);
	
	BigInteger c = a.add(b);
   
	System.out.println(c);
 }	
}
