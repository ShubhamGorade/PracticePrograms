/*WAP that accepts two strings from user in two textfields 
and prints the result by comparing both strings using java swing*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CompareString extends JFrame implements ActionListener
{
   JLabel l1,l2,l3;
   JTextField t1,t2;
   JButton b1;
   CompareString()
   {
    Container c = getContentPane();
    c.setLayout(null);
    c.setBackground(Color.orange);
    Font f1=new Font("Times New Roman",Font.BOLD,20);
    c.setFont(f1);
    
    l1=new JLabel("String1 :");
    l1.setFont(f1);
    l2=new JLabel("String2 :");
    l2.setFont(f1);
    l3=new JLabel();
    l3.setForeground(Color.RED);
    Font f2 = new Font("Algerian",Font.BOLD,20);
    l3.setFont(f2);
    t1=new JTextField();
    t2=new JTextField();
    b1=new JButton("Compare");
    b1.setBackground(Color.blue);
    
    l1.setBounds(100,100,130,40);
    l2.setBounds(100,200,130,40);
    l3.setBounds(290,300,350,40);
    t1.setBounds(300,100,100,40);
    t2.setBounds(300,200,100,40);
    b1.setBounds(170,300,100,40);

    c.add(l1);
    c.add(l2);
    c.add(l3);
    c.add(t1);
    c.add(t2);
    c.add(b1);
    b1.addActionListener(this);
}
 public void actionPerformed(ActionEvent e)
{
    String str1=t1.getText();
    String str2=t2.getText();
    if(str1.equals(str2))
    {
      l3.setText("Both Strings are equal !!");
    }
    else
    {
       l3.setText("Both strings are not equal !!");
    }
}
public static void main(String args[])
{
  CompareString n1=new CompareString();
  n1.setVisible(true);
  n1.setSize(700,600);
  n1.setTitle("String Comparison");
  n1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}

