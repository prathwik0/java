package swings2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class A extends JFrame implements ItemListener
{
	public JLabel l1, l2;
	public JRadioButton r1, r2, r3;
	public ButtonGroup bg;
	public JPanel p, p1;
	public A()
	{
		setLayout(new GridLayout(2,1));
		setSize(800, 400);
		p = new JPanel(new FlowLayout());
		p1 = new JPanel(new FlowLayout());
		l1 = new JLabel();
		Font f = new Font("Verdana", Font.BOLD, 60);
		l1.sotFont(f);
		
