import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class blackJack extends JPanel {
	
	private int betAmount = 2;
	private deck mainDeck = new deck();
	private deck playerDeck = new deck();
	private deck dealerDeck = new deck();
	private JLabel totalChipDisplay;
	private int actionCounter = 1;
	private JButton hitButton;
	private JButton stayButton;
	private JButton increaseBet;
	private JButton decreaseBet;
	private JButton startButton;
	private JLabel dealerCardDisplay;
	private JLabel dealerCardDisplay2;
	private JLabel dealerCardDisplay3;
	private JLabel dealerCardDisplay4;
	private JLabel dealerCardDisplay5;
	private JLabel dealerCardDisplay6;
	private JLabel playerCardDisplay;
	private JLabel playerCardDisplay2;
	private JLabel playerCardDisplay3;
	private JLabel playerCardDisplay4;
	private JLabel playerCardDisplay5;
	private JLabel playerCardDisplay6;
	private JLabel playerValue;
	private JLabel dealerValue;
	private boolean isGameStarted = false;
	private int totalPlayerChips;
	private JLabel betDisplay;


	/**
	 * Create the panel.
	 */
	public blackJack() {
		totalPlayerChips = Player.getChips();
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel BJNamePlate = new JLabel("Blackjack");
		BJNamePlate.setFont(new Font("Dialog", Font.PLAIN, 32));
		BJNamePlate.setBounds(410, 6, 149, 75);
		add(BJNamePlate);
		
		Panel cardDisplayPanel = new Panel();
//		panel.setBackground(new Color(7, 99, 36));
		cardDisplayPanel.setBounds(10, 117, 140, 210);
		add(cardDisplayPanel);
		cardDisplayPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		dealerCardDisplay = new JLabel();
		cardDisplayPanel.add(dealerCardDisplay);
		dealerCardDisplay.setForeground(Color.WHITE);
		dealerCardDisplay.setBackground(Color.WHITE);
		
		Panel cardDisplayPanel2 = new Panel();
		cardDisplayPanel2.setBounds(172, 117, 140, 210);
		add(cardDisplayPanel2);
		cardDisplayPanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		
		dealerCardDisplay2 = new JLabel();
		dealerCardDisplay2.setForeground(Color.WHITE);
		dealerCardDisplay2.setBackground(Color.WHITE);
		cardDisplayPanel2.add(dealerCardDisplay2);
		
		JLabel lblNewLabel = new JLabel("Dealer");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(24, 79, 110, 25);
		add(lblNewLabel);
		
		JLabel lblPlayer = new JLabel("Player");
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPlayer.setBounds(24, 350, 110, 25);
		add(lblPlayer);
		
		Panel cardDisplayPanel3 = new Panel();
		cardDisplayPanel3.setBounds(10, 389, 140, 210);
		add(cardDisplayPanel3);
		cardDisplayPanel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		playerCardDisplay = new JLabel();
		playerCardDisplay.setForeground(Color.WHITE);
		playerCardDisplay.setBackground(Color.WHITE);
		cardDisplayPanel3.add(playerCardDisplay);
		
		Panel cardDisplayPanel4 = new Panel();
		cardDisplayPanel4.setBounds(172, 389, 140, 210);
		add(cardDisplayPanel4);
		cardDisplayPanel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Panel cardDisplayPanel5 = new Panel();
		cardDisplayPanel5.setBounds(334, 117, 140, 210);
		add(cardDisplayPanel5);
		cardDisplayPanel5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		dealerCardDisplay3 = new JLabel();
		dealerCardDisplay3.setForeground(Color.WHITE);
		dealerCardDisplay3.setBackground(Color.WHITE);
		cardDisplayPanel5.add(dealerCardDisplay3);
		
		Panel cardDisplayPanel6 = new Panel();
		cardDisplayPanel6.setBounds(487, 117, 140, 210);
		add(cardDisplayPanel6);
		cardDisplayPanel6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		dealerCardDisplay4 = new JLabel();
		dealerCardDisplay4.setForeground(Color.WHITE);
		dealerCardDisplay4.setBackground(Color.WHITE);
		cardDisplayPanel6.add(dealerCardDisplay4);
		
		Panel cardDisplayPanel7 = new Panel();
		cardDisplayPanel7.setBounds(640, 117, 140, 210);
		add(cardDisplayPanel7);
		cardDisplayPanel7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		dealerCardDisplay5 = new JLabel();
		dealerCardDisplay5.setForeground(Color.WHITE);
		dealerCardDisplay5.setBackground(Color.WHITE);
		cardDisplayPanel7.add(dealerCardDisplay5);
		
		Panel cardDisplayPanel8 = new Panel();
		cardDisplayPanel8.setBounds(796, 117, 140, 210);
		add(cardDisplayPanel8);
		cardDisplayPanel8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		dealerCardDisplay6 = new JLabel();
		dealerCardDisplay6.setForeground(Color.WHITE);
		dealerCardDisplay6.setBackground(Color.WHITE);
		cardDisplayPanel8.add(dealerCardDisplay6);
		
		Panel cardDisplayPanel9 = new Panel();
		cardDisplayPanel9.setBounds(334, 389, 140, 210);
		add(cardDisplayPanel9);
		cardDisplayPanel9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		playerCardDisplay3 = new JLabel();
		playerCardDisplay3.setForeground(Color.WHITE);
		playerCardDisplay3.setBackground(Color.WHITE);
		cardDisplayPanel9.add(playerCardDisplay3);
		
		Panel cardDisplayPanel10 = new Panel();
		cardDisplayPanel10.setBounds(487, 389, 140, 210);
		add(cardDisplayPanel10);
		cardDisplayPanel10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		playerCardDisplay4 = new JLabel();
		playerCardDisplay4.setForeground(Color.WHITE);
		playerCardDisplay4.setBackground(Color.WHITE);
		cardDisplayPanel10.add(playerCardDisplay4);
		
		Panel cardDisplayPanel11 = new Panel();
		cardDisplayPanel11.setBounds(640, 389, 140, 210);
		add(cardDisplayPanel11);
		cardDisplayPanel11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		playerCardDisplay5 = new JLabel();
		playerCardDisplay5.setForeground(Color.WHITE);
		playerCardDisplay5.setBackground(Color.WHITE);
		cardDisplayPanel11.add(playerCardDisplay5);
		
		Panel cardDisplayPanel12 = new Panel();
		cardDisplayPanel12.setBounds(796, 389, 140, 210);
		add(cardDisplayPanel12);
		cardDisplayPanel12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		playerCardDisplay6 = new JLabel();
		playerCardDisplay6.setForeground(Color.WHITE);
		playerCardDisplay6.setBackground(Color.WHITE);
		cardDisplayPanel12.add(playerCardDisplay6);
		
		playerCardDisplay2 = new JLabel();
		playerCardDisplay2.setForeground(Color.WHITE);
		playerCardDisplay2.setBackground(Color.WHITE);
		cardDisplayPanel4.add(playerCardDisplay2);
		
		betDisplay = new JLabel("Bet Amount : 2");
		betDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		betDisplay.setBounds(705, 56, 140, 25);
		add(betDisplay);
		
		increaseBet = new JButton("+");
		increaseBet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(betAmount < 20) {
					betAmount += 2;
					betDisplay.setText("Bet Amount : " + betAmount);
				}
			}
		});
		increaseBet.setBounds(651, 56, 46, 23);
		add(increaseBet);
		
		decreaseBet = new JButton("-");
		decreaseBet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(betAmount > 2) {
					betAmount -= 2;
					betDisplay.setText("Bet Amount : " + betAmount);
				}
			}
		});
		decreaseBet.setBounds(855, 56, 46, 23);
		add(decreaseBet);
		
		dealerValue = new JLabel("Points : ?");
		dealerValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dealerValue.setBounds(172, 85, 140, 21);
		add(dealerValue);
		
		playerValue = new JLabel("Points : 0");
		playerValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		playerValue.setBounds(172, 356, 140, 21);
		add(playerValue);
		
		hitButton = new JButton("Hit");
		
		stayButton = new JButton("Stay");
		
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
				hitButton.setEnabled(true);
				stayButton.setEnabled(true);
				
				mainDeck.populateDeck();
				mainDeck.shuffle();
				
				ImageIcon dealerCard1 = new ImageIcon("cards/anotherback.png");
				dealerCard1 = scaleImage(dealerCard1, 131 , 200);		
				dealerCardDisplay.setIcon(dealerCard1);
						
				ImageIcon dealerCard2 = new ImageIcon("cards/" + dealerDeck.draw(mainDeck)+".png");
				dealerCard2 = scaleImage(dealerCard2, 131 , 200);		
				dealerCardDisplay2.setIcon(dealerCard2);
				
				ImageIcon playerCard1 = new ImageIcon("cards/" + playerDeck.draw(mainDeck) + ".png");
//				ImageIcon playerCard1 = new ImageIcon("cards/" + playerDeck.drawAce() + ".png");
				playerCard1 = scaleImage(playerCard1, 131 , 200);		
				playerCardDisplay.setIcon(playerCard1);
				
				ImageIcon playerCard2 = new ImageIcon("cards/" + playerDeck.draw(mainDeck) + ".png");
//				ImageIcon playerCard2 = new ImageIcon("cards/" + playerDeck.draw10() + ".png");
				playerCard2 = scaleImage(playerCard2, 131 , 200);		
				playerCardDisplay2.setIcon(playerCard2);
				
				if(playerDeck.containsAce() > 0) {
					int upperValue = playerDeck.calculateValue();
					int lowerValue = upperValue - 10*playerDeck.containsAce();
					if(upperValue == 21) {
						playerValue.setText("Points : Blackjack!");
						Player.setChips((int) (totalPlayerChips+(betAmount*1.5)));
						JOptionPane.showMessageDialog(null, "Blackjack! You Win! \n\n You gained " + Integer.toString((int) (betAmount*1.5)) + " chips.");
						resetGame();
					}else{
						playerValue.setText("Points : " + upperValue + " or " + lowerValue);
					}
					
				}else { 
					playerValue.setText("Points : " + playerDeck.calculateValue());
				}
				
			}
		});
		startButton.setBounds(731, 86, 89, 23);
		add(startButton);
		
		hitButton.setEnabled(false);
		hitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon newPlayerCard = new ImageIcon("cards/" + playerDeck.draw(mainDeck) + ".png");
				newPlayerCard = scaleImage(newPlayerCard, 131 , 200);		
				
				switch(actionCounter) {
					case 1:
						playerCardDisplay3.setIcon(newPlayerCard);
						actionCounter++;
						break;
					case 2:
						playerCardDisplay4.setIcon(newPlayerCard);
						actionCounter++;
						break;
					case 3:
						playerCardDisplay5.setIcon(newPlayerCard);
						actionCounter++;
						break;
					default:
						playerCardDisplay6.setIcon(newPlayerCard);
						actionCounter++;
						break;
						
						
				}
				if(playerDeck.containsAce() > 0) {
					int upperValue = playerDeck.calculateValue();
					int lowerValue = upperValue - 10*playerDeck.containsAce();
					if(lowerValue > 21) {
						  playerValue.setText("Points : " + lowerValue);
						  JFrame f=new JFrame();  
						  JOptionPane.showMessageDialog(f,"Bust :( \nPress Ok to start another.","Game Over",JOptionPane.WARNING_MESSAGE);  
						  resetGame();
					}else if(upperValue > 21) { 
						playerValue.setText("Points : " + lowerValue);
					}else{
						playerValue.setText("Points : " + upperValue + " or " + lowerValue);
					}
					
				}else {
					if(playerDeck.calculateValue() > 21) {
						playerValue.setText("Points : " + playerDeck.calculateValue());
						JFrame f=new JFrame();  
						JOptionPane.showMessageDialog(f,"Bust :( \nPress Ok to start another.","Game Over",JOptionPane.WARNING_MESSAGE);  
						resetGame();
					}else {
						playerValue.setText("Points : " + playerDeck.calculateValue());
					}

				}
			}
		});
		hitButton.setBounds(37, 623, 89, 23);
		add(hitButton);
		
		stayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dealerActionCounter = 1;
				boolean gameInProgress = true;
				
				while(gameInProgress) {
				ImageIcon newPlayerCard = new ImageIcon("cards/" + playerDeck.draw(mainDeck) + ".png");
				newPlayerCard = scaleImage(newPlayerCard, 131 , 200);		
				
				switch(dealerActionCounter) {
					case 1:
						dealerCardDisplay.setIcon(newPlayerCard);
						dealerActionCounter++;
						break;
					case 2:
						dealerCardDisplay3.setIcon(newPlayerCard);
						dealerActionCounter++;
						break;
					case 3:
						dealerCardDisplay4.setIcon(newPlayerCard);
						dealerActionCounter++;
						break;
					case 4:
						dealerCardDisplay5.setIcon(newPlayerCard);
						dealerActionCounter++;
						break;
					default:
						dealerCardDisplay6.setIcon(newPlayerCard);
						dealerActionCounter++;
						break;
						
						
				}
				}
			}
		});
		stayButton.setEnabled(false);
		stayButton.setBounds(198, 623, 89, 23);
		add(stayButton);
		
		totalChipDisplay = new JLabel("Total Chips : " + totalPlayerChips);
		totalChipDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		totalChipDisplay.setBounds(651, 11, 169, 25);
		add(totalChipDisplay);
		
		JLabel output = new JLabel("");
		output.setFont(new Font("Tahoma", Font.PLAIN, 46));
		output.setBounds(410, 329, 486, 50);
		add(output);
		
		
	
		
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
	
	public void refreshChips() {
		System.out.println("refreshed");
		totalChipDisplay.setText("Total Chips : " + Player.getChips());
		totalPlayerChips = Player.getChips();
	}
	
	public void resetGame() {
		startButton.setEnabled(true);
		decreaseBet.setEnabled(true);
		increaseBet.setEnabled(true);
		hitButton.setEnabled(false);
		stayButton.setEnabled(false);
		
		mainDeck.clearDeck();
		mainDeck.populateDeck();
		mainDeck.shuffle();
		
		playerDeck.clearDeck();
		dealerDeck.clearDeck();
		
		dealerCardDisplay.setIcon(null);
		dealerCardDisplay2.setIcon(null);
		dealerCardDisplay3.setIcon(null);
		dealerCardDisplay4.setIcon(null);
		dealerCardDisplay5.setIcon(null);
		dealerCardDisplay6.setIcon(null);
		
		playerCardDisplay.setIcon(null);
		playerCardDisplay2.setIcon(null);
		playerCardDisplay3.setIcon(null);
		playerCardDisplay4.setIcon(null);
		playerCardDisplay5.setIcon(null);
		playerCardDisplay6.setIcon(null);
		
		playerValue.setText("Points : 0");
		dealerValue.setText("Points : ?");
		
		actionCounter = 1;
		refreshChips(); 
		
		isGameStarted = false;
		
		betAmount = 2;
		betDisplay.setText("Bet Amount : 2");
	}
	
	public boolean getIsGameStarted() {
		return isGameStarted;
	}
}

