// Varun Batra 110256128
public class CountDigits {
	public static int[] count(String s){
		final int NUMS = 10;
		int [] result = new int [NUMS];
		for (int i =0; i< s.length(); i++){
			result[(int)s.charAt(i)-48]++;
			
		}
		return result;
		
		}
	public static void main(String[] args) {
		
		String n = "933899";
		for( int i =0; i< 10; i++)
		System.out.println("There are " + count(n)[i]+": " + i +  "'s");
		
		

	}

}
