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
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class poker extends JPanel {
	private int betAmount = 2;
	private JLabel totalChipDisplay;
	private JButton increaseBet;
	private JButton decreaseBet;
	private JLabel playerCardDisplay;
	private JLabel betDisplay;
	private int totalPlayerChips;
	private int swapsSelected;
	private JCheckBox swapBox1;
	private JCheckBox swapBox2;
	private JCheckBox swapBox3;
	private JCheckBox swapBox4;
	private JCheckBox swapBox5;

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
		
		ImageIcon backOfCard = new ImageIcon("cards/anotherback.png");
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
		
		JLabel playerCardDisplay2 = new JLabel();
		playerCardDisplay2.setForeground(Color.WHITE);
		playerCardDisplay2.setBackground(Color.WHITE);
		cardDisplayPanel2.add(playerCardDisplay2);
		
		Panel cardDisplayPanel3 = new Panel();
		cardDisplayPanel3.setBounds(406, 138, 140, 210);
		add(cardDisplayPanel3);
		cardDisplayPanel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel playerCardDisplay3 = new JLabel();
		playerCardDisplay3.setForeground(Color.WHITE);
		playerCardDisplay3.setBackground(Color.WHITE);
		cardDisplayPanel3.add(playerCardDisplay3);
		
		Panel cardDisplayPanel4 = new Panel();
		cardDisplayPanel4.setBounds(599, 138, 140, 210);
		add(cardDisplayPanel4);
		cardDisplayPanel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel playerCardDisplay4 = new JLabel();
		playerCardDisplay4.setForeground(Color.WHITE);
		playerCardDisplay4.setBackground(Color.WHITE);
		cardDisplayPanel4.add(playerCardDisplay4);
		
		Panel cardDisplayPanel5 = new Panel();
		cardDisplayPanel5.setBounds(778, 138, 140, 210);
		add(cardDisplayPanel5);
		cardDisplayPanel5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel playerCardDisplay5 = new JLabel();
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
				}else {
					swapsSelected--;
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
				}else {
					swapsSelected--;
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
				}else {
					swapsSelected--;
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
				}else {
					swapsSelected--;
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
				}else {
					swapsSelected--;
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
		
		JButton swapButton = new JButton("Swap");
		swapButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		swapButton.setBounds(437, 398, 89, 23);
		add(swapButton);
		
		JButton startButton = new JButton("Start");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		startButton.setBounds(731, 92, 89, 23);
		add(startButton);
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
