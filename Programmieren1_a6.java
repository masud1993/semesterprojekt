
public class Programmieren1_a6 {

	public static void main(String[] args) {
		double a=Double.parseDouble(args[0]);
		
		double b=Double.parseDouble(args[1]);
		double c=Double.parseDouble(args[2]);
	
		double s=(a+b+c)/2.0;
		
		
		double f=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(f);
		
		
		
		

	}

}
