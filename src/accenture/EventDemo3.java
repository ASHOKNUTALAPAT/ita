package accenture;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo3 extends Frame {
	TextField t;
	Button b;
	EventDemo3(){
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		
		t=new TextField();
		t.setBounds(100,100,100,30);
		add(t);
		
		b=new Button("CLICK HERE");
		b.setBounds(100,140,100,30);
		add(b);
		
		//Registering with source for an Event by Listener--in the form of ananymous
		
		b.addActionListener(
				new ActionListener() 
				{
					public void actionPerformed(ActionEvent ae) {
						t.setText("Hello Hai!!!");
					}
				}
		);
	}

	public static void main(String[] args) {
		new EventDemo3();

	}

}

//Event Listener must implement corresponding Listener Interface
/*class Outer2 implements ActionListener{
	EventDemo3 e;
	Outer2(EventDemo3 e){
		this.e=e;
	}
	public void actionPerformed(ActionEvent ae) {
		e.t.setText("Welcome to Java Events!!!");
	
}
}*/
