package data_types;

public class Typeconversion {
 /*
  Type conversion/Casting
  a) implicit casting(auto casting;
   byte->short->int->long->float->double
  b)Explicit casting
   double->float->long->int->short->byte
   syntax:
   data_type var = (data_type) value;
    
  */
	public static void main(String[] args) {
		byte k =127;
		short p = k ; //auto casting
		
		double m = 3244321.5433434;
		float n = (float)m;
		
		int a =600;
		int b = 9;
		
//		float c = (float)a/b;
//		System.out.println(c);
//		System.out.printf("%.2f",c); //number of decimal required
		
		double ac = Math.PI*5*5;
		
		System.out.println(ac);
	}
}
