import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
	
	public card drawForSwap(deck origin) {
		this.cards.add(origin.getCard(0));
		
		return origin.removeCard(0);
	}
	
	public String drawAce() {
		this.cards.add(new card("AC", "C"));
		
		return "AC";
	}
	public String draw10() {
		this.cards.add(new card("10C", "C"));
		
		return "10C";
	}
	
	public String draw9() {
		this.cards.add(new card("9C", "C"));
		
		return "9C";
	}
	
	public String drawJ() {
		this.cards.add(new card("JC", "C"));
		
		return "JC";
	}
	
	public String drawQ() {
		this.cards.add(new card("QC", "C"));
		
		return "QC";
	}
	
	public String drawK() {
		this.cards.add(new card("KC", "C"));
		
		return "KC";
	}
	
	public card getCard(int i){
		return this.cards.get(i);
	}
	
	public String getCardName(int i, deck playerDeck) {
		return playerDeck.getCard(i).getName();
	}
	
	
	
	public card removeCard(int i){
		return this.cards.remove(i);
	}
	
	public card replaceCard(int i, card newcard){
		return this.cards.set(i, newcard);
	}
	
	public boolean hasAce(deck playerDeck) {
		boolean ace = false;
		int card1Rank = playerDeck.getCard(0).getRank();
		int card2Rank = playerDeck.getCard(1).getRank();
		int card3Rank = playerDeck.getCard(2).getRank();
		int card4Rank = playerDeck.getCard(3).getRank();
		int card5Rank = playerDeck.getCard(4).getRank();
		int[] ranks = { card1Rank, card2Rank, card3Rank, card4Rank, card5Rank };
		
		for (int rank : ranks) {
		    if (rank == 1) {
		        ace = true;
		    }
		}
		return ace;
	}
	
	public int checkWinConditions(deck playerDeck) {
		int betMultiplier = -1;
		boolean flush = false;
		int card1Rank = playerDeck.getCard(0).getRank();
		String card1Suit = playerDeck.getCard(0).getSuit();
		int card2Rank = playerDeck.getCard(1).getRank();
		String card2Suit = playerDeck.getCard(1).getSuit();
		int card3Rank = playerDeck.getCard(2).getRank();
		String card3Suit = playerDeck.getCard(2).getSuit();
		int card4Rank = playerDeck.getCard(3).getRank();
		String card4Suit = playerDeck.getCard(3).getSuit();
		int card5Rank = playerDeck.getCard(4).getRank();
		String card5Suit = playerDeck.getCard(4).getSuit();
		String[] cardSuits = { card1Suit, card2Suit, card3Suit, card4Suit, card5Suit };
		int[] cardRanks = { card1Rank, card2Rank, card3Rank, card4Rank, card5Rank };
		int suits = 0;
		int pairs = 0;
		boolean threeOfKind = false;
		boolean fourOfAKind = false;
		boolean straight = false;
		boolean royalFlush = false;
		int straightCount = 0;

		
        for (int i = 0; i < cardSuits.length; i++) 
		        for (int j = i+1; j < cardRanks.length; j++) 
		  
		            if (cardSuits[i] == cardSuits[j]) 
		                suits++;
        if (suits > 6) {
        	flush = true;
        }

           for (int i = 0; i < cardRanks.length; i++) 
		        for (int j = i+1; j < cardRanks.length; j++) 
		  
		            if (cardRanks[i] == cardRanks[j]) 
		                pairs++;


           int [] rankFrequency = new int [cardRanks.length];  
           int visited = -1;  
           for(int i = 0; i < cardRanks.length; i++){  
               int count = 1;  
               for(int j = i+1; j < cardRanks.length; j++){  
                   if(cardRanks[i] == cardRanks[j]){  
                       count++;  
                       rankFrequency[j] = visited;  
                   }  
               }  
               if(rankFrequency[i] != visited)  
            	   rankFrequency[i] = count;  
           } 
         for (int i = 0; i < rankFrequency.length; i++) {
        	 if (rankFrequency[i] == 3 ) {
        		 threeOfKind = true;
        	 }
         }
         for (int i = 0; i < rankFrequency.length; i++) {
        	 if (rankFrequency[i] == 4 || rankFrequency[i] == 5 ) {
        		 fourOfAKind = true;
        	 }
         }
         Arrays.sort(cardRanks);
         
        
         for (int i = 0; i < cardRanks.length-1; i++) {
        	 int j = cardRanks[i];
        	 int k = cardRanks[i+1];
        	 if (k == j+1) {
        		 straightCount++;
        	 }
         }
         if (straightCount == 4) {
        	 straight = true;
         }
         
         if (cardRanks[0] == 1 && cardRanks[1] == 10 && cardRanks[2] == 11 && cardRanks[3] == 12 && cardRanks[4] == 13 && flush) {
        	 royalFlush = true;
        	 
         }

         if (pairs == 1) { //works
        	 betMultiplier = 0;
        	 System.out.println("pair");
         }
         if (pairs == 2) { //works
        	 betMultiplier = 1;
        	 System.out.println("2pair");
         }
         if (threeOfKind) { //works
        	 betMultiplier = 2;
        	 System.out.println("3kind");
         }
         if (straight) { //works
        	 betMultiplier = 3;
        	 System.out.println("straight");
         }
         if (flush) { //works
        	 betMultiplier = 5;
        	 System.out.println("flush");
         }
         
         if (pairs > 3 && threeOfKind) { //works
        	 betMultiplier = 10;
        	 System.out.println(pairs);
        	 System.out.println("full");
         }
         if (fourOfAKind) { //works
        	 betMultiplier = 25;
        	 System.out.println("4kind");
         }
         if (straight && flush) { //works
        	 betMultiplier = 100;
        	 System.out.println("straightFlush");
         }
         if (royalFlush) { //works
        	 betMultiplier = 250;
        	 System.out.println("royalFlush");
         }
		return betMultiplier; 
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
	
	
	public int getDeckSize() {
		return this.cards.size();
	}
	
}