package accenture;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class AWTDemo1 extends Frame{
	public AWTDemo1() {
		Label l1=new Label("USERNAME:");
		TextField t1=new TextField();
		l1.setBounds(40,40,70,40);
		t1.setBounds(40,100,100,40);
		Button b1=new Button("CLICK ME");
		b1.setBounds(60,160, 70, 40);
		add(l1);
		add(t1);
		add(b1);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		AWTDemo1 awt1=new AWTDemo1();

	}

}
