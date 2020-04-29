public class card implements Comparable<card>{

	private int rankValue;	
	private String cardName;
	private int bjValue;
	private boolean isAce =false;
	private String suit;
	
	
	public card(String cardName, String suit) {
		this.cardName = cardName;
		this.suit = suit;
		switch(cardName.toUpperCase().charAt(0)) {
			case 'A' : 
				this.rankValue = 1;
				this.isAce = true;
				this.bjValue = 11;
				break;
			case '2' : 
				this.rankValue = 2;
				this.bjValue = 2;
				break;
			case '3' : 
				this.rankValue = 3;
				this.bjValue = 3;
				break;
			case '4' : 
				this.rankValue = 4;
				this.bjValue = 4;
				break;
			case '5' : 
				this.rankValue = 5;
				this.bjValue = 5;
				break;
			case '6' : 
				this.rankValue = 6;
				this.bjValue = 6;
				break;
			case '7' : 
				this.rankValue = 7;
				this.bjValue = 7;
				break;
			case '8' : 
				this.rankValue = 8;
				this.bjValue = 8;
				break;
			case '9' : 
				this.rankValue = 9;
				this.bjValue = 9;
				break;
			case '1' : 
				this.rankValue = 10;
				this.bjValue = 10;
				break;
			case 'J' : 
				this.rankValue = 11;
				this.bjValue = 10;
				break;
			case 'Q' : 
				this.rankValue = 12;
				this.bjValue = 10;
				break;
			case 'K' : 
				this.rankValue = 13;
				this.bjValue = 10;
				break;
		}
	}
	
	@Override
	public int compareTo(card card) {
		   if (this.getRank() > card.getRank()) {
	            return 1;
	        } else if (this.getRank() < card.getRank()) {
	            return -1;
	        } else {
	            return 0;
	        }
	}

	public int getRank() {
		return rankValue;
	}
	
	public String getName() {
		return cardName;
	}
	
	public int getbjValue() {
		return bjValue;
	}
	
	public boolean getIsAce() {
		return isAce;
	}
	
	public String getSuit() {
		return suit;
	}
	
}
