package accenture;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AEvent3 extends Frame{
	TextField t1;
	Button b1;
	AEvent3(){
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		t1=new TextField("Hello, please press here");
		b1=new Button("CLICK HERE");
		t1.setBounds(100,100,200,30);
		b1.setBounds(150,150,100,20);
		add(t1);
		add(b1);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				t1.setText("Good Morning!!!");
			}
		});
	}

	public static void main(String[] args) {
		new AEvent3();

	}

}
