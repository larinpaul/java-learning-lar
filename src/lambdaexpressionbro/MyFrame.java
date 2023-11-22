package lambdaexpressionbro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	JButton myButton = new JButton("MY BUTTON"); 
	JButton myButton2 = new JButton("MY BUTTON 2");
	
	MyFrame() {

		myButton2.setBounds(100, 200, 200, 100);
		myButton2.addActionListener(
				(e) -> System.out.println("This is the second button")
		);
		
		
		
		
		myButton.setBounds(110, 110, 200, 110);
		
		//// How it was before:
		myButton.addActionListener(new ActionListener() {
			// We add an anonymous inner class here:
			
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("You clicked a button!");
			}
			
		});
		
		
		//// How we can do it now:
		myButton.addActionListener(
			(e) -> System.out.println("YOu clicked a button!")
		);
		
		
		this.add(myButton);
		this.add(myButton2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(null);
		this.setVisible(true);
		
	}
	
}
