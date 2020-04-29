import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("serial")
public class deck extends ArrayList<card>{
	private ArrayList<card> cards;
	
	
	public deck() {
		this.cards = new ArrayList<card>();
	}

	public void populateDeck() {
		clearDeck();
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
		values.add("10");
		values.add("J");
		values.add("Q");
		values.add("K");
		
		for(String suit : suits){
            for(String value : values){
                this.cards.add(new card(value+suit, suit));
            }
        }
		System.out.println(this.cards.size());
	}

	public void shuffle() {
		ArrayList<card> tmpDeck = new ArrayList<card>();
		Random random = new Random();
		int randomCardIndex = 0;
		int originalSize = this.cards.size();
		for(int i = 0; i<originalSize;i++){
			randomCardIndex = random.nextInt((this.cards.size()-1 - 0) + 1) + 0;
			tmpDeck.add(this.cards.get(randomCardIndex));
			this.cards.remove(randomCardIndex);
		}
		this.cards = tmpDeck;
		
	}
	
	public String draw(deck origin) {
		this.cards.add(origin.getCard(0));
		
		return origin.removeCard(0).getName();
	}
	
	public String drawAce() {
		this.cards.add(new card("AC", "C"));
		
		return "AC";
	}
	public String draw10() {
		this.cards.add(new card("10H", "H"));
		
		return "10H";
	}
	
	public card getCard(int i){
		return this.cards.get(i);
	}
	
	public card removeCard(int i){
		return this.cards.remove(i);
	}
	
	public int calculateValue() {
		int total = 0;
		for(int i = 0; i < this.cards.size();i++) {
			total += this.cards.get(i).getbjValue();
		}
		return total;
	}
	
	public int containsAce() {
		int total = 0;
		for(int i = 0; i < this.cards.size();i++) {
			if(this.cards.get(i).getIsAce()) {
				total++;
			}
		}
		return total;
	}
	
	public void clearDeck(){
		this.cards.clear();
	}
	
}