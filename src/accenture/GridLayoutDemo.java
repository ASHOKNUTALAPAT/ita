package accenture;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {
	GridLayoutDemo(){
		/*Button one=new Button("1");
		Button two=new Button("2");
		Button three=new Button("3");
		Button four=new Button("4");
		Button five=new Button("5");
		Button six=new Button("6");
		Button seven=new Button("7");
		Button eight=new Button("8");
		Button nine=new Button("9");
		add(one);add(two);add(three);
		add(four);add(five);add(six);
		add(seven);add(eight);add(nine);*/
		Button b[]=new Button[9];
		for(int i=0;i<9;i++) {
			b[i]=new Button(""+(i+1));
			add(b[i]);
		}
		setLayout(new GridLayout(3,3,10,10));
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutDemo();

	}

}
