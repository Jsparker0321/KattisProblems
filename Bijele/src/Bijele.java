import java.util.Scanner;

public class Bijele {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int kings = input.nextInt();
		int queens = input.nextInt();
		int rooks = input.nextInt();
		int bishops = input.nextInt();
		int knights = input.nextInt();
		int pawns = input.nextInt();
		
		kings = 1 - kings;
		queens = 1 - queens;
		rooks = 2 - rooks;
		bishops = 2 - bishops;
		knights = 2 - knights;
		pawns = 8 - pawns;
		
		System.out.println(kings + " " + queens + " " + rooks + " " + bishops + " " + knights + " " + pawns);
	}

}
