package accenture;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Example2 extends Frame {
	Label l;
	TextField t;
	Button b;
	Example2(){
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		l=new Label("USERNAME");
		l.setBounds(100,100,80,30);
		add(l);
		t=new TextField();
		t.setBounds(100,140,100,20);
		add(t);
		b=new Button("CLICK ME");
		b.setBounds(100,170,80,20);
		add(b);
	}

	public static void main(String[] args) {
		/*Example2 ex2=*/new Example2();

	}

}
