package accenture;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingDemo extends Frame 
implements ActionListener {
	TextField t;
	Button b;
	EventHandlingDemo(){
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		t=new TextField();
		b=new Button("PRESS HERE");
		t.setBounds(100,100,200,30);
		b.setBounds(100,150,80,20);
		//Registering for ActionEvent triggered 
		//by Button
		b.addActionListener(this);
		add(t);
		add(b);
	}
	public static void main(String[] args) {
	/*EventHandlingDemo demo=*/new EventHandlingDemo();
	}

	public void actionPerformed(ActionEvent ae) {
		t.setText("Welcome to Event Handling");
	}

}
