import java.util.Scanner;

public class Faktor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String[] contain = word.split(" ");
		
		int numPublished = Integer.parseInt(contain[0]);
		int impactFactor = Integer.parseInt(contain[1]);
		int bribes = numPublished * impactFactor - (numPublished - 1);
		
		System.out.println(bribes);
		
		
	}

}
