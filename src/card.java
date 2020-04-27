public class card implements Comparable<card>{

	private int rankValue;	
	private String cardName;
	
	public card(String cardName) {
		this.cardName = cardName;
		
		switch(cardName.toUpperCase().charAt(0)) {
			case 'A' : 
				this.rankValue = 1;
				break;
			case '2' : 
				this.rankValue = 2;
				break;
			case '3' : 
				this.rankValue = 3;
				break;
			case '4' : 
				this.rankValue = 4;
				break;
			case '5' : 
				this.rankValue = 5;
				break;
			case '6' : 
				this.rankValue = 6;
				break;
			case '7' : 
				this.rankValue = 7;
				break;
			case '8' : 
				this.rankValue = 8;
				break;
			case '9' : 
				this.rankValue = 9;
				break;
			case '1' : 
				this.rankValue = 10;
				break;
			case 'J' : 
				this.rankValue = 11;
				break;
			case 'Q' : 
				this.rankValue = 12;
				break;
			case 'K' : 
				this.rankValue = 13;
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
}
