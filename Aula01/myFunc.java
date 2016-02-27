import java.util.*;

class myFunc {
	
	public static double averageOf(double somaItens, int numItens){
		double output = somaItens / numItens;
		return output;
	}
	
	public static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
	
	public static double randDouble(double min, double max) {
		Random rand = new Random();
		double randomNum = min + (max - min) * rand.nextDouble();
		return randomNum;
	}
	
	public static String randString(int length){
		String output = "";
		Random rand = new Random();
		char[] abc = {
			'A','B','C','D','E','F','G','H','I','J','K',
			'L','M','N','O','P','Q','R','S','T','U','V',
			'W','X','Y','Z','a','b','c','d','e','f','g',
			'h','i','j','k','l','m','n','o','p','q','r',
			's','t','u','v','w','x','y','z'
		};
		
		for (int i = 0; i < length; i++) {
			output += abc[myFunc.randInt(0, abc.length - 1)];
		}
		return output;
	}
}