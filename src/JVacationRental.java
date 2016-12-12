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
		
		JButton parkSide = new JButton("Parkside: +$600/w");
		JButton poolSide = new JButton("Poolside: +$750/w");
		JButton lakeSide = new JButton("Lakeside: +$825/w");
		
		JButton oneBed = new JButton("One Bedroom");
		JButton twoBed = new JButton("Two Bedroom (+$75)");
		JButton threeBed = new JButton("Three Bedroom (+$150)");
		
		JButton noMeal = new JButton("No Meal Plan");
		JButton withMeals = new JButton("With Meal Plan (+$200)");
		
		ButtonGroup location = new ButtonGroup();
		ButtonGroup beds = new ButtonGroup();
		ButtonGroup meals = new ButtonGroup();
		
	
	public JVacationRental()
		{
			super("Lambert's Vacation Rentals");
			setSize(450, 450);
			setVisible(true);
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			southPnl.add(totalPrice, BorderLayout.CENTER);
		
			location.add(parkSide);
			location.add(poolSide);
			location.add(lakeSide);
			
			beds.add(oneBed);
			beds.add(twoBed);
			beds.add(threeBed);
			
			meals.add(noMeal);
			meals.add(withMeals);
			
			mainPnl.add(eastPnl, BorderLayout.EAST);
			mainPnl.add(centerPnl,  BorderLayout.CENTER);
			mainPnl.add(westPnl, BorderLayout.WEST);
			mainPnl.add(southPnl, BorderLayout.SOUTH);
			
			mainPnl.setLayout(mainLayout);
			
			add(mainPnl);
			
			validate();
		}
	
	public void actionPerformed(ActionEvent e)
		{
			
		}
	
	public static void main(String[] args)
		{
			JVacationRental gui = new JVacationRental();
			
		}// end main method
	
	}
