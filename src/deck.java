import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("serial")
public class deck extends ArrayList<card>{
	private ArrayList<card> cards;
	
	
	public deck() {
		this.cards = new ArrayList<card>();
	}
	
	public void populateDeck() {
		ArrayList<String> suits = new ArrayList<String>();
		suits.add("S");
		suits.add("D");
		suits.add("C");
		suits.add("H");
		ArrayList<String> values = new ArrayList<String>();
		values.add("A");
		values.add("2");
		values.add("3");
		values.add("4");
		values.add("5");
		values.add("6");
		values.add("7");
		values.add("8");
		values.add("9");
		values.add("1"); //this is 10 but 1 to keep 2 chars
		values.add("J");
		values.add("Q");
		values.add("K");
		
		for(String suit : suits){
            for(String value : values){
                this.cards.add(new card(value+suit));
            }
        }
		System.out.println(this.cards.size());
	}

	public String getRandomCard() {
		Random random = new Random();
		int cardNumber = random.nextInt(51);
		return this.cards.get(cardNumber).getName();
	}

}