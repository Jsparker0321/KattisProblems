import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class yoda {

	public static void main(String[] args) throws Exception {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long first = Long.parseLong(br.readLine());
		long second = Long.parseLong(br.readLine());
		String a = "";
		String b = "";
		
		while (first > 0 && second > 0) {
			long dig1 = first % 10;
			long dig2 = second % 10;

			first /= 10;
			second /= 10;

			if(dig1 == dig2) {
				a = dig1 + a;
				b = dig2 + b;

			}else if (dig1 > dig2)
				a= dig1 + a;
			else if ( dig1 < dig2)
				b = dig2 + b;
			}
		
			if (first > 0) {
				a = first + a;
			}else if ( second > 0)
				b = second + b;
			if (a.equals(""))
				a = "YODA";
			else if (!a.equals(""));
			first = Long.parseLong(a);
			if (b.equals(""))
				b = "YODA";
			else if (!b.equals(""));
				second = Long.parseLong(b);
				
				bw.write((a.equals("YODA") ? a : first + "") + "\n" + (b.equals("YODA") ? b : second + ""));
				
			bw.close();
			br.close();


	}

}
