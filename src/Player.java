import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Player {

	public static int getChips() {
		int chipsTotal = 0;
		try {
			FileReader fr = new FileReader("chips.txt");
			BufferedReader br = new BufferedReader(fr);
			String chips;
			chips = br.readLine();

			chipsTotal = Integer.valueOf(chips);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return chipsTotal;
	}

	public static String setChips(int newBal){
		try {
			FileWriter fw = new FileWriter("chips.txt");
			PrintWriter pw = new PrintWriter(fw);

			pw.println(Integer.toString(newBal));
			pw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return Integer.toString(newBal);
	}
}
