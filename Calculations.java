/*
 * @author Cruz
 * created 3/9/20
 * description: calculation methods
 */
public class Calculations {
	/*method that computes the sum from 1 to N 
	  method: sum1ToN
	  parameter: int n
	  parameter: sum from 1 to n
	*/
	public static int sum1toN(int n) {
		
		int total = 0;
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		return total; 
	}	
	
	/*
	 * method: quadraticFormula
	 * parameters: a,b,c
	 * returns: double[]
	 */
	
	public static double[] quadraticFormula (double a, double b, double c){
		
		double [] roots = new double[2];
		double result =  b*b - 4*a*c; //what is under the square root
		result = Math.sqrt(result) / 2.0 * a; 
		
		roots[0] = -b + result;
		roots[1] = -b - result;
				
		return roots;
 	}
	
	
	
	/*
	 * method: weatherAlert
	 * parameter: temperature
	 * returns: String
	 */
	
	public static String weatherAlert(int temp) {
		
		if(temp > 70) {
			return "hot";
		}
		else if(temp > 50) {
			return "warm";
		}
		else if (temp > 35) {
			return "cool";
		}
		else {
			return "cold";
		}
	}
	
	public static void main(String [] args) {
		System.out.println(sum1toN(5));
		System.out.println(quadraticFormula(1,5,3) [0]);
		System.out.println(weatherAlert(30));
	}
	
}
