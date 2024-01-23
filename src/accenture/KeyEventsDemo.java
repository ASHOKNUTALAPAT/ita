package accenture;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
public class KeyEventsDemo extends JFrame 
							implements KeyListener {
	JTextArea t;
	JLabel l;
	KeyEventsDemo(){
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		l=new JLabel();
		l.setBounds(40,40,100,20);
		add(l);
		t=new JTextArea();
		t.setBounds(40,80,200,200);
		add(t);
		t.addKeyListener(this);
	}
	public static void main(String[] args) {
		new KeyEventsDemo();
	}
	public void keyTyped(KeyEvent e) {
		l.setText("Key Typed");	
	}
	public void keyPressed(KeyEvent e) {
		l.setText("Key Pressed");	
	}
	
	public void keyReleased(KeyEvent e) {
		l.setText("Key Released");
		
	}

}
