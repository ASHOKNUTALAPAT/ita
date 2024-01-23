package accenture;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcDemo extends Frame implements ActionListener {
	TextField val1,val2,res;
	Button plus,minus,clear;
	CalcDemo(){
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		
		val1=new TextField();
		val1.setBounds(50,50,30,30);
		add(val1);
		
		val2=new TextField();
		val2.setBounds(50,90,30,30);
		add(val2);
		
		res=new TextField();
		res.setBounds(50,130,30,30);
		add(res);
		
		plus=new Button("+");
		plus.setBounds(40,170,20,20);
		add(plus);
		
		minus=new Button("-");
		minus.setBounds(70,170,20,20);
		add(minus);
		
		clear=new Button("C");
		clear.setBounds(100,170,20,20);
		add(clear);
		
		plus.addActionListener(this);
		minus.addActionListener(this);
		clear.addActionListener(this);
	}

	public static void main(String[] args) {
		new CalcDemo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int n1,n2,r;
		n1=Integer.parseInt(val1.getText());
		n2=Integer.parseInt(val2.getText());
		if(e.getSource()==plus)
			res.setText(""+(n1+n2));
		else if(e.getSource()==minus)
			res.setText(""+(n1-n2));
		else {
			val1.setText("");
			val2.setText("");
			res.setText("");
		}
	}

}
