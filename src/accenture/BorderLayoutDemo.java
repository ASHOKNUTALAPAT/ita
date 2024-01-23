package accenture;

import java.awt.BorderLayout;
import java.awt.Button;
import javax.swing.JFrame;
public class BorderLayoutDemo extends JFrame {
	BorderLayoutDemo(){
		Button north=new Button("North");
		Button south=new Button("South");
		Button east=new Button("East");
		Button west=new Button("West");
		Button center=new Button("Center");
		setLayout(new BorderLayout(15,20));
		add(north,BorderLayout.NORTH);
		add(south,BorderLayout.SOUTH);
		add(east,BorderLayout.EAST);
		add(west,BorderLayout.WEST);
		add(center,BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutDemo();
	}

}
