package accenture;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo extends Frame implements ActionListener {
	TextField t;
	Button b;
	EventDemo(){
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		t=new TextField();
		t.setBounds(100,100,100,30);
		add(t);
		b=new Button("PRESS HERE");
		b.setBounds(100,150,100,30);
		add(b);
		//Register for events with source by listener
		b.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new EventDemo();
	}
	//Handling Event
	public void actionPerformed(ActionEvent e) {
		t.setText("Welcome to Events");
	}

}
