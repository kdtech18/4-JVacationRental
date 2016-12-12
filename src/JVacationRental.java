/* JVacationRental.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   12/12/2016
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JVacationRental extends JFrame implements ActionListener
	{
		JPanel mainPnl = new JPanel();
		JPanel eastPnl = new JPanel();
		JPanel centerPnl = new JPanel();
		JPanel westPnl = new JPanel();
		JPanel southPnl = new JPanel();
		
		int totalRent = 0;
		JLabel totalPrice = new JLabel("Your total rent per week is: " + totalRent);
		
		BorderLayout mainLayout = new BorderLayout();
		
	
	public JVacationRental()
		{
			super("Lambert's Vacation Rentals");
			
		}
	
	public void actionPerformed(ActionEvent e)
		{
			
		}
	
	public static void main(String[] args)
		{
		
		}// end main method
	
	}
