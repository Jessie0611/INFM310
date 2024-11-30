import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JavaQuiz
{
	JPanel myPanel;

	JavaQuiz()
	{
		// Create JLabels
		JLabel labelQuestion = new JLabel("Do you like GUI programming? Vote Yes or No.");
		JLabel labelYes= new JLabel("Click here to vote Yes.");
		JLabel labelNo = new JLabel("Click here to vote No.");

		// Create a final JButton here named buttonYes with appropriate text. 
		JButton buttonYes = new JButton("Yes");
		
		buttonYes.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// Set the JPanel background color to yellow. 
				myPanel.setBackground(Color.yellow);
			}
		});

		// Create a final JButton here named buttonNo with appropriate text. 
		JButton buttonNo = new JButton("No");

		buttonNo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// Set the JPanel background color to red. 
				myPanel.setBackground(Color.red);
			}
		});
		// Create a JPanel named myPanel.
		myPanel = new JPanel();
		myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));
		myPanel.setAlignmentX(Component.CENTER_ALIGNMENT);// CENTER panel
		
		labelQuestion.setAlignmentX(Component.CENTER_ALIGNMENT);// center question
		myPanel.add(labelQuestion);

		labelYes.setAlignmentX(Component.CENTER_ALIGNMENT);  //center label
        buttonYes.setAlignmentX(Component.CENTER_ALIGNMENT); //center button
		myPanel.add(Box.createVerticalStrut(20));// Add a vertical strut between question and Yes/No labels
		myPanel.add(labelYes);
		myPanel.add(buttonYes);
		
		labelNo.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonNo.setAlignmentX(Component.CENTER_ALIGNMENT); 
		myPanel.add(Box.createVerticalStrut(10));//add vert strut between yes / no
		
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
		frame.setLocationRelativeTo(null);  // Center the window on the screen
		frame.setVisible(true);
	}
}