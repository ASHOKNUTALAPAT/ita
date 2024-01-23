package accenture;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AEvent extends Frame implements ActionListener {
	TextField tf; 
	Button b;
	AEvent(){
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		tf=new TextField("Hello");
		tf.setBounds(100,100,100,30);
		b=new Button("Click Here");
		b.setBounds(120,150,60,20);
		b.addActionListener(this);
		add(tf);
		add(b);
		
	}


	public static void main(String[] args) {
		new AEvent();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText("Welcome");
		
	}

}
