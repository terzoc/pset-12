import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class poker extends JPanel {
	private deck mainDeck = new deck();
	private deck playerDeck = new deck();
	private deck swapDeck = new deck();
	private int betAmount = 1;
	private JLabel totalChipDisplay;
	private JButton increaseBet;
	private JButton decreaseBet;
	private JLabel playerCardDisplay;
	private JLabel playerCardDisplay2;
	private JLabel playerCardDisplay3;
	private JLabel playerCardDisplay4;
	private JLabel playerCardDisplay5;
	private JLabel betDisplay;
	private int totalPlayerChips;
	private int swapsSelected;
	private JCheckBox swapBox1;
	private JCheckBox swapBox2;
	private JCheckBox swapBox3;
	private JCheckBox swapBox4;
	private JCheckBox swapBox5;
	private JButton startButton;
	private JButton swapButton;
	private JButton holdButton;
	private ImageIcon backOfCard;
	private boolean isGameStarted = false;
	private boolean swap1 = false;
	private boolean swap2 = false;
	private boolean swap3 = false;
	private boolean swap4 = false;
	private boolean swap5 = false;
	private boolean swapped = false;
	private int winMultiplier = -1;
	private int winnings = 0;
	

	/**
	 * Create the panel.
	 */
	public poker() {
		totalPlayerChips = Player.getChips();
		
		setBackground(Color.WHITE);
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Poker");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel_1.setBounds(437, 11, 109, 46);
		add(lblNewLabel_1);	
				
		betDisplay = new JLabel("Bet Amount : 1");
		betDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		betDisplay.setBounds(705, 56, 140, 25);
		add(betDisplay);
		
		increaseBet = new JButton("+");
		increaseBet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(betAmount < 10) {
					betAmount += 1;
					betDisplay.setText("Bet Amount : " + betAmount);
				}
			}
		});
		increaseBet.setBounds(651, 56, 46, 23);
		add(increaseBet);
		
		decreaseBet = new JButton("-");
		decreaseBet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(betAmount > 1) {
					betAmount -= 1;
					betDisplay.setText("Bet Amount : " + betAmount);
				}
			}
		});
		decreaseBet.setBounds(855, 56, 46, 23);
		add(decreaseBet);
		
		backOfCard = new ImageIcon("cards/anotherback.png");
		backOfCard = scaleImage(backOfCard, 131 , 200);	

		
		totalChipDisplay = new JLabel("Total Chips : " + totalPlayerChips);
		totalChipDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		totalChipDisplay.setBounds(651, 11, 169, 25);
		add(totalChipDisplay);
		
		Panel cardDisplayPanel = new Panel();
		cardDisplayPanel.setBounds(51, 138, 140, 210);
		add(cardDisplayPanel);
		cardDisplayPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		playerCardDisplay = new JLabel();
		playerCardDisplay.setForeground(Color.WHITE);
		playerCardDisplay.setBackground(Color.WHITE);
		cardDisplayPanel.add(playerCardDisplay);
		
		
		
		Panel cardDisplayPanel2 = new Panel();
		cardDisplayPanel2.setBounds(229, 138, 140, 210);
		add(cardDisplayPanel2);
		cardDisplayPanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		playerCardDisplay2 = new JLabel();
		playerCardDisplay2.setForeground(Color.WHITE);
		playerCardDisplay2.setBackground(Color.WHITE);
		cardDisplayPanel2.add(playerCardDisplay2);
		

		Panel cardDisplayPanel3 = new Panel();
		cardDisplayPanel3.setBounds(406, 138, 140, 210);
		add(cardDisplayPanel3);
		cardDisplayPanel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		playerCardDisplay3 = new JLabel();
		playerCardDisplay3.setForeground(Color.WHITE);
		playerCardDisplay3.setBackground(Color.WHITE);
		cardDisplayPanel3.add(playerCardDisplay3);
		
		Panel cardDisplayPanel4 = new Panel();
		cardDisplayPanel4.setBounds(599, 138, 140, 210);
		add(cardDisplayPanel4);
		cardDisplayPanel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		playerCardDisplay4 = new JLabel();
		playerCardDisplay4.setForeground(Color.WHITE);
		playerCardDisplay4.setBackground(Color.WHITE);
		cardDisplayPanel4.add(playerCardDisplay4);
		
		Panel cardDisplayPanel5 = new Panel();
		cardDisplayPanel5.setBounds(778, 138, 140, 210);
		add(cardDisplayPanel5);
		cardDisplayPanel5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		playerCardDisplay5 = new JLabel();
		playerCardDisplay5.setForeground(Color.WHITE);
		playerCardDisplay5.setBackground(Color.WHITE);
		cardDisplayPanel5.add(playerCardDisplay5);
		
		playerCardDisplay.setIcon(backOfCard);
		playerCardDisplay2.setIcon(backOfCard);
		playerCardDisplay3.setIcon(backOfCard);
		playerCardDisplay4.setIcon(backOfCard);
		playerCardDisplay5.setIcon(backOfCard);
		
		swapBox1 = new JCheckBox("Swap");
		swapBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(swapBox1.isSelected()) {
					swapsSelected++;
					swap1 = true;
				}else {
					swapsSelected--;
					swap1 = false;
				}
				
				if(swapsSelected == 3) {
					if(!swapBox1.isSelected()) {
						swapBox1.setEnabled(false);
					}
					if(!swapBox2.isSelected()) {
						swapBox2.setEnabled(false);
					}
					if(!swapBox3.isSelected()) {
						swapBox3.setEnabled(false);
					}
					if(!swapBox4.isSelected()) {
						swapBox4.setEnabled(false);
					}
					if(!swapBox5.isSelected()) {
						swapBox5.setEnabled(false);
					}
				}else {
					swapBox1.setEnabled(true);
					swapBox2.setEnabled(true);
					swapBox3.setEnabled(true);
					swapBox4.setEnabled(true);
					swapBox5.setEnabled(true);
				}
			}
		});
		swapBox1.setBackground(Color.WHITE);
		swapBox1.setBounds(92, 354, 62, 23);
		add(swapBox1);
		
		swapBox2 = new JCheckBox("Swap");
		swapBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(swapBox2.isSelected()) {
					swapsSelected++;
					swap2 = true;
				}else {
					swapsSelected--;
					swap2 = false;
				}
				
				if(swapsSelected == 3) {
					if(!swapBox1.isSelected()) {
						swapBox1.setEnabled(false);
					}
					if(!swapBox2.isSelected()) {
						swapBox2.setEnabled(false);
					}
					if(!swapBox3.isSelected()) {
						swapBox3.setEnabled(false);
					}
					if(!swapBox4.isSelected()) {
						swapBox4.setEnabled(false);
					}
					if(!swapBox5.isSelected()) {
						swapBox5.setEnabled(false);
					}
				}else {
					swapBox1.setEnabled(true);
					swapBox2.setEnabled(true);
					swapBox3.setEnabled(true);
					swapBox4.setEnabled(true);
					swapBox5.setEnabled(true);
				}
			}
		});
		swapBox2.setBackground(Color.WHITE);
		swapBox2.setBounds(267, 354, 62, 23);
		add(swapBox2);
		
		swapBox3 = new JCheckBox("Swap");
		swapBox3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(swapBox3.isSelected()) {
					swapsSelected++;
					swap3 = true;
				}else {
					swapsSelected--;
					swap3 = false;
				}
				
				if(swapsSelected == 3) {
					if(!swapBox1.isSelected()) {
						swapBox1.setEnabled(false);
					}
					if(!swapBox2.isSelected()) {
						swapBox2.setEnabled(false);
					}
					if(!swapBox3.isSelected()) {
						swapBox3.setEnabled(false);
					}
					if(!swapBox4.isSelected()) {
						swapBox4.setEnabled(false);
					}
					if(!swapBox5.isSelected()) {
						swapBox5.setEnabled(false);
					}
				}else {
					swapBox1.setEnabled(true);
					swapBox2.setEnabled(true);
					swapBox3.setEnabled(true);
					swapBox4.setEnabled(true);
					swapBox5.setEnabled(true);
				}
			}
		});
		swapBox3.setBackground(Color.WHITE);
		swapBox3.setBounds(452, 354, 67, 23);
		add(swapBox3);
		
		swapBox4 = new JCheckBox("Swap");
		swapBox4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(swapBox4.isSelected()) {
					swapsSelected++;
					swap4 = true;
				}else {
					swapsSelected--;
					swap4 = false;
				}
				
				if(swapsSelected == 3) {
					if(!swapBox1.isSelected()) {
						swapBox1.setEnabled(false);
					}
					if(!swapBox2.isSelected()) {
						swapBox2.setEnabled(false);
					}
					if(!swapBox3.isSelected()) {
						swapBox3.setEnabled(false);
					}
					if(!swapBox4.isSelected()) {
						swapBox4.setEnabled(false);
					}
					if(!swapBox5.isSelected()) {
						swapBox5.setEnabled(false);
					}
				}else {
					swapBox1.setEnabled(true);
					swapBox2.setEnabled(true);
					swapBox3.setEnabled(true);
					swapBox4.setEnabled(true);
					swapBox5.setEnabled(true);
				}
			}
		});
		swapBox4.setBackground(Color.WHITE);
		swapBox4.setBounds(646, 354, 62, 23);
		add(swapBox4);
		
		swapBox5 = new JCheckBox("Swap");
		swapBox5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(swapBox5.isSelected()) {
					swapsSelected++;
					swap5 = true;
				}else {
					swapsSelected--;
					swap5 = false;
				}
				
				if(swapsSelected == 3) {
					if(!swapBox1.isSelected()) {
						swapBox1.setEnabled(false);
					}
					if(!swapBox2.isSelected()) {
						swapBox2.setEnabled(false);
					}
					if(!swapBox3.isSelected()) {
						swapBox3.setEnabled(false);
					}
					if(!swapBox4.isSelected()) {
						swapBox4.setEnabled(false);
					}
					if(!swapBox5.isSelected()) {
						swapBox5.setEnabled(false);
					}
				}else {
					swapBox1.setEnabled(true);
					swapBox2.setEnabled(true);
					swapBox3.setEnabled(true);
					swapBox4.setEnabled(true);
					swapBox5.setEnabled(true);
				}
			}
		});
		swapBox5.setBackground(Color.WHITE);
		swapBox5.setBounds(823, 354, 62, 23);
		add(swapBox5);
		
		swapButton = new JButton("Swap");
		swapButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (swap1) {
					playerDeck.replaceCard(0, swapDeck.drawForSwap(mainDeck));
					swapped = true;
				}
				if (swap2) {
					playerDeck.replaceCard(1, swapDeck.drawForSwap(mainDeck));
					swapped = true;
				}
				if (swap3) {
					playerDeck.replaceCard(2, swapDeck.drawForSwap(mainDeck));
					swapped = true;
				}
				if (swap4) {
					playerDeck.replaceCard(3, swapDeck.drawForSwap(mainDeck));
					swapped = true;
				}
				if (swap5) {
					playerDeck.replaceCard(4, swapDeck.drawForSwap(mainDeck));
					swapped = true;
				}
				ImageIcon playerCard1 = new ImageIcon("cards/" + playerDeck.getCardName(0, playerDeck) + ".png");
//				ImageIcon playerCard1 = new ImageIcon("cards/" + playerDeck.drawAce() + ".png");
				playerCard1 = scaleImage(playerCard1, 131 , 200);		
				playerCardDisplay.setIcon(playerCard1);
				
				ImageIcon playerCard2 = new ImageIcon("cards/" + playerDeck.getCardName(1, playerDeck) + ".png");
//				ImageIcon playerCard2 = new ImageIcon("cards/" + playerDeck.drawAce() + ".png");
				playerCard2 = scaleImage(playerCard2, 131 , 200);		
				playerCardDisplay2.setIcon(playerCard2);
				
				ImageIcon playerCard3 = new ImageIcon("cards/" + playerDeck.getCardName(2, playerDeck) + ".png");
//				ImageIcon playerCard3 = new ImageIcon("cards/" + playerDeck.drawAce() + ".png");
				playerCard3 = scaleImage(playerCard3, 131 , 200);		
				playerCardDisplay3.setIcon(playerCard3);
				
				ImageIcon playerCard4 = new ImageIcon("cards/" + playerDeck.getCardName(3, playerDeck) + ".png");
//				ImageIcon playerCard4 = new ImageIcon("cards/" + playerDeck.draw10() + ".png");
				playerCard4 = scaleImage(playerCard4, 131 , 200);		
				playerCardDisplay4.setIcon(playerCard4);
				
				ImageIcon playerCard5 = new ImageIcon("cards/" + playerDeck.getCardName(4, playerDeck) + ".png");
//			    ImageIcon playerCard5 = new ImageIcon("cards/" + playerDeck.draw10() + ".png");
				playerCard5 = scaleImage(playerCard5, 131 , 200);		
				playerCardDisplay5.setIcon(playerCard5);
				
               swapButton.setEnabled(false);
               winMultiplier = playerDeck.checkWinConditions(playerDeck);
               winnings = winMultiplier * betAmount;
			switch(winMultiplier) {
			case -1 :					
				JOptionPane.showMessageDialog(null, "You Lose! Better luck next time!");
				resetGame();
				break;
			case 0 :
				Player.setChips((int) (totalPlayerChips + betAmount + winnings));
				JOptionPane.showMessageDialog(null, "One Pair! You recieved your bet back.");
				
				resetGame();
				break;
			case 1 :
				Player.setChips((int) (totalPlayerChips + betAmount + winnings));
				JOptionPane.showMessageDialog(null, "Two Pairs! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
				resetGame();
				break;
			case 2 :
				Player.setChips((int) (totalPlayerChips + betAmount + winnings));
				JOptionPane.showMessageDialog(null, "Three of a kind! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
				resetGame();
				break;
			case 3 :
				Player.setChips((int) (totalPlayerChips + betAmount + winnings));
				JOptionPane.showMessageDialog(null, "Straight! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
				resetGame();
				break;
			case 5 :
				Player.setChips((int) (totalPlayerChips + betAmount + winnings));
				JOptionPane.showMessageDialog(null, "Flush! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
				resetGame();
				break;
			case 10 :
				Player.setChips((int) (totalPlayerChips + betAmount + winnings));
				JOptionPane.showMessageDialog(null, "Full House! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
				resetGame();
				break;
			case 25 :
				Player.setChips((int) (totalPlayerChips + betAmount + winnings));
				JOptionPane.showMessageDialog(null, "Four of a kind! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
				resetGame();
				break;
			case 100 :
				Player.setChips((int) (totalPlayerChips + betAmount + winnings));
				JOptionPane.showMessageDialog(null, "Straight Flush! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
				resetGame();
				break;
			case 250 :
				Player.setChips((int) (totalPlayerChips + betAmount + winnings));
				JOptionPane.showMessageDialog(null, "Royal Flush! Wow! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
				resetGame();
				break;
				
			}
               
               
			}
		});
		swapButton.setBounds(437, 398, 89, 23);
		add(swapButton);
		
		holdButton = new JButton("Hold");
		holdButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				winMultiplier = playerDeck.checkWinConditions(playerDeck);
				if (winMultiplier != -1) {
				winnings = winMultiplier * betAmount;
				}
				switch(winMultiplier) {
				case -1 :					
					JOptionPane.showMessageDialog(null, "You Lose! Better luck next time!");
					resetGame();
					break;
				case 0 :
					Player.setChips((int) (totalPlayerChips + betAmount + winnings));
					JOptionPane.showMessageDialog(null, "One Pair! You recieved your bet back.");		
					resetGame();
					break;
				case 1 :
					Player.setChips((int) (totalPlayerChips + betAmount + winnings));
					JOptionPane.showMessageDialog(null, "Two Pairs! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
					resetGame();
					break;
				case 2 :
					Player.setChips((int) (totalPlayerChips + betAmount + winnings));
					JOptionPane.showMessageDialog(null, "Three of a kind! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
					resetGame();
					break;
				case 3 :
					Player.setChips((int) (totalPlayerChips + betAmount + winnings));
					JOptionPane.showMessageDialog(null, "Straight! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
					resetGame();
					break;
				case 5 :
					Player.setChips((int) (totalPlayerChips + betAmount + winnings));
					JOptionPane.showMessageDialog(null, "Flush! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
					resetGame();
					break;
				case 10 :
					Player.setChips((int) (totalPlayerChips + betAmount + winnings));
					JOptionPane.showMessageDialog(null, "Full House! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
					resetGame();
					break;
				case 25 :
					Player.setChips((int) (totalPlayerChips + betAmount + winnings));
					JOptionPane.showMessageDialog(null, "Four of a kind! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
					resetGame();
					break;
				case 100 :
					Player.setChips((int) (totalPlayerChips + betAmount + winnings));
					JOptionPane.showMessageDialog(null, "Straight Flush! You Win! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
					resetGame();
					break;
				case 250 :
					Player.setChips((int) (totalPlayerChips + betAmount + winnings));
					JOptionPane.showMessageDialog(null, "Royal Flush! Wow! \n\n You gained " + Integer.toString((int) (winnings + betAmount)) + " chips.");
					resetGame();
					break;
					
				}
			}
		});
		holdButton.setBounds(479, 440, 89, 23);
		add(holdButton);
		
		
		startButton = new JButton("Start");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				totalChipDisplay.setText("Total Chips : " + Player.setChips(totalPlayerChips - betAmount));
				totalPlayerChips -= betAmount;
				System.out.println(totalPlayerChips);
				isGameStarted = true;
				startButton.setEnabled(false);
				decreaseBet.setEnabled(false);
				increaseBet.setEnabled(false);
				swapButton.setEnabled(true);
				holdButton.setEnabled(true);
				
				mainDeck.populateDeck();
				mainDeck.shuffle();
				
				
				ImageIcon playerCard1 = new ImageIcon("cards/" + playerDeck.draw(mainDeck) + ".png");
//				ImageIcon playerCard1 = new ImageIcon("cards/" + playerDeck.draw9() + ".png");
				playerCard1 = scaleImage(playerCard1, 131 , 200);		
				playerCardDisplay.setIcon(playerCard1);
								
				ImageIcon playerCard2 = new ImageIcon("cards/" + playerDeck.draw(mainDeck) + ".png");
//				ImageIcon playerCard2 = new ImageIcon("cards/" + playerDeck.draw9() + ".png");
				playerCard2 = scaleImage(playerCard2, 131 , 200);		
				playerCardDisplay2.setIcon(playerCard2);
				
				ImageIcon playerCard3 = new ImageIcon("cards/" + playerDeck.draw(mainDeck) + ".png");
//				ImageIcon playerCard3 = new ImageIcon("cards/" + playerDeck.draw10() + ".png");
				playerCard3 = scaleImage(playerCard3, 131 , 200);		
				playerCardDisplay3.setIcon(playerCard3);
				
				ImageIcon playerCard4 = new ImageIcon("cards/" + playerDeck.draw(mainDeck) + ".png");
//				ImageIcon playerCard4 = new ImageIcon("cards/" + playerDeck.draw10() + ".png");
				playerCard4 = scaleImage(playerCard4, 131 , 200);		
				playerCardDisplay4.setIcon(playerCard4);
				
				ImageIcon playerCard5 = new ImageIcon("cards/" + playerDeck.draw(mainDeck) + ".png");
//				ImageIcon playerCard5 = new ImageIcon("cards/" + playerDeck.drawK() + ".png");
				playerCard5 = scaleImage(playerCard5, 131 , 200);		
				playerCardDisplay5.setIcon(playerCard5);
			}
		});
		startButton.setBounds(731, 92, 89, 23);
		add(startButton);
		
	}
	public void resetGame() {
	startButton.setEnabled(true);
	decreaseBet.setEnabled(true);
	increaseBet.setEnabled(true);
	mainDeck.clearDeck();
	swapDeck.clearDeck();
	playerDeck.clearDeck();
	swapButton.setEnabled(true);
	holdButton.setEnabled(true);
	
	playerCardDisplay.setIcon(backOfCard);
	playerCardDisplay2.setIcon(backOfCard);
	playerCardDisplay3.setIcon(backOfCard);
	playerCardDisplay4.setIcon(backOfCard);
	playerCardDisplay5.setIcon(backOfCard);
	
	swapBox1.setEnabled(true);
	swapBox2.setEnabled(true);
	swapBox3.setEnabled(true);
	swapBox4.setEnabled(true);
	swapBox5.setEnabled(true);
	swapBox1.setSelected(false);
	swapBox2.setSelected(false);
	swapBox3.setSelected(false);
	swapBox4.setSelected(false);
	swapBox5.setSelected(false);
	
	swapsSelected = 0;
	
	winMultiplier = -1;
	winnings = 0;
	betAmount = 1;
	betDisplay.setText("Bet Amount : " + betAmount);
	
	swap1 = false;
	swap2 = false;
	swap3 = false;
	swap4 = false;
	swap5 = false;
	swapped = false;
	
	refreshChips();
	
	

	}
	public void refreshChips() {
		System.out.println("refreshed");
		totalChipDisplay.setText("Total Chips : " + Player.getChips());
		totalPlayerChips = Player.getChips();
	}

	private ImageIcon scaleImage(ImageIcon icon, int w, int h){
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();

        if(icon.getIconWidth() > w)
        {
          nw = w;
          nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }

        if(nh > h)
        {
          nh = h;
          nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }

        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
    }
	
}
