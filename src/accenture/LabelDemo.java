package accenture;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelDemo extends Frame implements ActionListener {
	TextField t;
	Button b;
	Label l;
	LabelDemo(){
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		t=new TextField("www.google.com");
		t.setBounds(100,100,100,30);
		b=new Button("Find IP");
		b.setBounds(120,200,60,20);
		l=new Label();
		l.setBounds(100,150,250,30);
		b.addActionListener(this);
		add(t);
		add(b);
		add(l);
	}

	public static void main(String[] args) {
		new LabelDemo();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String host=t.getText();
		try {
		String ip="IP of "+host+" is "+
		java.net.InetAddress.getByName(host).getHostAddress();
		l.setText(ip);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
