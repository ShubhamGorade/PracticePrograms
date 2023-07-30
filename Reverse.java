/*WAP that accepts a number from user and 
prints its reverse using java swings */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Reverse extends JFrame implements ActionListener
{
  JLabel l1,l2;
  JTextField t1,t2;
  JButton b1;
  Reverse()
  {
    Container c=getContentPane();
    Font f1=new Font("Arial Black",Font.BOLD,17);
    c.setLayout(null);
    c.setBackground(Color.red);

    l1=new JLabel("Enter a number :");
    l1.setFont(f1);
    l2=new JLabel("Answer :");
    l2.setFont(f1);
    t1=new JTextField();
    t1.setFont(f1);
    t2=new JTextField();
    t2.setFont(f1);
    b1=new JButton("Reverse");
    b1.setFont(f1);
   
    l1.setBounds(100,100,200,35);
    l2.setBounds(100,200,100,35);
    t1.setBounds(300,100,100,35);
    t1.setForeground(Color.blue);
    t2.setBounds(300,200,100,35);
    t2.setForeground(Color.blue);
    b1.setBounds(170,300,130,35);
    b1.setBackground(Color.orange);

    c.add(l1);
    c.add(l2);
    c.add(t1);
    c.add(t2);
    c.add(b1);
    b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
   int no;
   no=Integer.parseInt(t1.getText());
   int rev=0;
   while(no!=0)
  {
    int rem=no % 10;
    rev=(rev*10)+rem;
    no=no/10;
  }
t2.setText(String.valueOf(rev));
}
public static void main(String args[])
{
  Reverse r1=new Reverse();
  r1.setVisible(true);
  r1.setSize(500,500);
  r1.setTitle("Reverse Number");
  r1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
    