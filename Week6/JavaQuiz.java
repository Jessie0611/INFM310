import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JavaQuiz
{
	JPanel myPanel;

	JavaQuiz()
	{
		// Create JLabels
		JLabel labelQuestion = new JLabel("Do you like GUI programming?");
		JLabel labelYes= new JLabel("Click here to vote Yes.");
		JLabel labelNo = new JLabel("Click here to vote No.");

		// Create a final JButton here named buttonYes with appropriate text. 
		JButton buttonYes = new JButton("Yes");

		buttonYes.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				// Set the JPanel background color to yellow. 

				
			}
		});

		// Create a final JButton here named buttonNo with appropriate text. 
		JButton buttonNo = new JButton("No");


		buttonNo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				// Set the JPanel background color to red. 

			}
		});
		
		// Create a JPanel named myPanel.
		

		myPanel.add(labelQuestion);		

		myPanel.add(labelYes);
		myPanel.add(buttonYes);
		
		myPanel.add(labelNo);
		myPanel.add(buttonNo);
		
	}
	public static void main(String args[])
	{
		JavaQuiz quiz = new JavaQuiz();
		JFrame frame = new JFrame("Java Quiz");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setContentPane(quiz.myPanel);
		frame.pack();
		frame.setVisible(true);
	}
}