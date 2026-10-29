import javax.swing.*;
import java.awt.*;

class temp05
{
	public static void main(String v[])
	{
		JFrame f = new JFrame("Student Details:");

		f.setLayout(null);

		Label l1 = new Label("Name: ");
		l1.setBounds(20,30,100,30);
		f.add(l1);

		JTextField t1 = new JTextField();
		t1.setBounds(130,30,150,30);
		f.add(t1);

		Label l2 = new Label("Roll: ");
		l2.setBounds(20,70,100,30);
		f.add(l2);

		JTextField t2 = new JTextField();
		t2.setBounds(130,70,150,30);
		f.add(t2);

		Button b = new Button("Submit");
		b.setBounds(130,120,100,30);
		f.add(b);

		f.setBounds(20,30,35,40);

		f.setVisible(true);
		f.setSize(400,400);
		f.getContentPane().setBackground(Color.black);
	}
}