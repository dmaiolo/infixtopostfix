package InfixtoPostfixMaiolo;
/**
 * GUI generator class for ExpressionEvaluator
 * 
 * @author (D. Maiolo) 
 * @version (April 2015)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * Default Constructor to generate the GUI objects.
 *  
 * @author David
 *
 */
public class ExpressionGUI extends JFrame{

	JLabel infixExpressionLabel = new JLabel("Enter Infix Expression");// Create a JLabel for "Enter Infix Expression"
	JTextField infixExpressionField = new JTextField();// Create a JTextField for "Enter Infix Expression"
	
	JLabel valueExpressionLabel = new JLabel("Value of Expression");// Create a JLabel for "Value of Expression"
	JTextField valueExpressionField = new JTextField();// Create a JTextField for "Value of Expression"
	
	JButton calculateButton = new JButton("Calculate");// Create a JButton for "Calculate"
	JButton exitButton = new JButton("Exit");// Create a JButton for "Exit". So when you click the Exit button, it will close GUI
	
	JPanel GUIpanel = new JPanel();
	
	/**
	 * Method to place GUI on the Panel
	 */
	public ExpressionGUI()
	{
		
		setSize(800,400);
		GUIpanel.setLayout(new GridLayout(3,2,10,10));
		setResizable(false);

		GUIpanel.add(infixExpressionLabel);
		GUIpanel.add(infixExpressionField);
		GUIpanel.add(valueExpressionLabel);
		GUIpanel.add(valueExpressionField);
		GUIpanel.add(calculateButton);
		GUIpanel.add(exitButton);
		setContentPane(GUIpanel);
		
		/**
		 * Logic for Buttons
		 */
		calculateButton.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						ExpressionEvaluator express = new ExpressionEvaluator();
                       Expression iEval =  new Expression(infixExpressionField.getText());
						
						valueExpressionField.setText(Double.toString(express.evaluate(iEval)));
					}
				}
				);

		exitButton.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{		
						System.exit(EXIT_ON_CLOSE);	
					}
				}
				);
	}
		public static void main(String[] args)
		{
			ExpressionGUI myGUI = new ExpressionGUI();
			myGUI.show();
		}
}
	