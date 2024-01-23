package accenture;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventsDemo extends JFrame implements MouseListener {
	JLabel l;
	MouseEventsDemo(){
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		l=new JLabel();
		l.setBounds(40,40,100,20);
		add(l);
		addMouseListener(this);
	}

	public static void main(String[] args) {
		new MouseEventsDemo();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		l.setText("Mouse Clicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		l.setText("Mouse Pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		l.setText("Mouse Released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		l.setText("Mouse Entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		l.setText("Mouse Exited");
		
	}
}
