public class card implements Comparable<card>{

	private int rankValue;	
	private String cardName;

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
}
