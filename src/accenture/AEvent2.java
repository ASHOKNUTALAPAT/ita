package accenture;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AEvent2 extends Frame{
	TextField t1;
	Button b1;
	AEvent2(){
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		t1=new TextField("Hello, Please press below button");
		b1=new Button("CLICK HERE");
		t1.setBounds(100,100,200,30);
		b1.setBounds(100,150,100,20);
		add(t1);
		add(b1);
		Outer out=new Outer(this);
		b1.addActionListener(out);
	}

	public static void main(String[] args) {
		new AEvent2();

	}
}
class Outer implements ActionListener{
	AEvent2 ae;
	Outer(AEvent2 ae){
		this.ae=ae;
	}
	public void actionPerformed(ActionEvent e) {
		ae.t1.setText("Good Morning");
	}
}
