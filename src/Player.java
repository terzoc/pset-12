import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Player {
	private int chips;
	
	public Player() {
		try {
			FileReader fr = new FileReader("chips.txt");
			BufferedReader br = new BufferedReader(fr);
			String chips;
			chips = br.readLine();
					
			this.chips = Integer.valueOf(chips);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public int getChips() {
		return chips;
	}
	
}
