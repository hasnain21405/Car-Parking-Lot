import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class About implements ActionListener
{
	JFrame frame;
	JLabel title1, pic, made, Sami, Hussnain, Hasan, Hasnain;
	JButton close;
	Image image = new ImageIcon(this.getClass().getResource("/download.png")).getImage();
	String TempUname,TempPass;
	About(String TempUname, String TempPass)
	{
		this.TempPass=TempPass;this.TempUname=TempUname;
		
		frame = new JFrame("Parking Lot");
		Image i=Toolkit.getDefaultToolkit().getImage("icon.png");
		frame.setIconImage(i);
		
		title1 = new JLabel("About Parking Management System:");
		title1.setBounds(30,30,400,30);
		title1.setFont(new Font(null,Font.BOLD,20));
		title1.setForeground(Color.white);
		pic = new JLabel();
		pic.setBounds(30,40,300,300);
		pic.setIcon(new ImageIcon(image));
		pic.setFocusable(false);
		JTextArea textArea = new JTextArea(
		"This software is built for a small Parking Lot.\n"
		 + "This project develops a computerized system to \nmanage parking usage in a parking garage.\n"
		 + "It is intended to be done by a team of 3-4 \nundergraduate students of BSSE-II during\nan "
		 + "academic semester Fall 2022."
		);
		textArea.setFont(new Font(null, Font.PLAIN, 16));
		textArea.setForeground(Color.white);
		textArea.setBackground(new Color(0x2A3457));
		textArea.setBounds(300,70,350,130);
		textArea.setEditable(false);
		made = new JLabel("Made by:");
		made.setFont(new Font(null, Font.BOLD, 16));
		made.setForeground(Color.white);
		made.setBounds(350,200,80,30);
		Sami = new JLabel("-: Samiullah Waheed          (SP21406)");
		Sami.setFont(new Font(null, Font.PLAIN, 16));
		Sami.setForeground(Color.white);
		Sami.setBounds(350,240,300,20);
		Hussnain = new JLabel("-: Muhammad Hussnain      (SP21373)");
		Hussnain.setFont(new Font(null, Font.PLAIN, 16));
		Hussnain.setForeground(Color.white);
		Hussnain.setBounds(350,270,300,20);
		Hasan = new JLabel("-: Muhammad Hasan Irfan   (SP21374)");
		Hasan.setFont(new Font(null, Font.PLAIN, 16));
		Hasan.setForeground(Color.white);
		Hasan.setBounds(350,300,300,20);
		Hasnain = new JLabel("-: Hasnain Sharif                 (SP21405)");
		Hasnain.setFont(new Font(null, Font.PLAIN, 16));
		Hasnain.setForeground(Color.white);
		Hasnain.setBounds(350,330,300,20);
		close = new JButton("Close");
		close.setBounds(100,350,70,30);
		close.setFocusable(false);
		close.addActionListener(this);
		
		frame.add(title1);
		frame.add(pic);
		frame.add(textArea);
		frame.add(made);
		frame.add(Sami);
		frame.add(Hasan);
		frame.add(Hussnain);
		frame.add(Hasnain);
		frame.add(close);
		
		frame.setSize(700,450);
		frame.getContentPane().setBackground(new Color(0x2A3457));
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==close)
		{
			frame.dispose();
			new DashBoard(TempUname,TempPass);
			

		}
		
	}
}