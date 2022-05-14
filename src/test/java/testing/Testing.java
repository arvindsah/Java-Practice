package testing;

public class Testing {

	
	
	/* Arvind Sah May Interview
	 * 
	 * 	A
		rv
		ind
		(Space)Sah
		(Space)May(Space)
		Interv
		iew
	 */
	
	public static void main(String[] args) {
		String name= "Arvind Sah May Interview";
		
		int temp=1; 
		
		for (int i=0 ; i<name.length()-1; i++) { // i=0, j=0
			// i=1, j=1
			for (int j=i;j<temp+i;j++) {
				System.out.print(name.charAt(j));
			}
			temp=temp++;
			System.out.println();
		}
	}
}
