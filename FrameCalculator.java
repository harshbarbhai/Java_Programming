import javax.swing.*;
import java.awt.event.*;

class Calculator1 implements ActionListener
{
    //characteristics
    JFrame fobj;
    JButton bobj1;
    JButton bobj2;
    JButton bobj3;
    JButton bobj4;
    JTextField tobj1;
    JTextField tobj2;
    JLabel firstno, secondno, Resultlabel;

    public Calculator1(String title,int width,int height)
    {
        fobj=new JFrame(title);

        firstno = new JLabel("Number1:");
        firstno.setBounds(50, 50, 100, 30);

        tobj1 = new JTextField();
        tobj1.setBounds(150, 50, 100, 30);

        secondno = new JLabel("Number2:");
        secondno.setBounds(50, 100, 100, 30);

        tobj2 = new JTextField();
        tobj2.setBounds(150, 100, 100, 30);

        bobj1 = new JButton("+");
        bobj1.setBounds(40, 150, 40, 30);

        bobj2 = new JButton("-");
        bobj2.setBounds(100, 150, 40, 30);

        bobj3 = new JButton("*");
        bobj3.setBounds(170, 150, 40, 30);

        bobj4 = new JButton("/");
        bobj4.setBounds(240, 150, 40, 30);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(50, 200, 250, 30);

        fobj.add(firstno);
        fobj.add(tobj1);
        fobj.add(secondno);
        fobj.add(tobj2);
        fobj.add(bobj1);
        fobj.add(bobj2);
        fobj.add(bobj3);
        fobj.add(bobj4);
        fobj.add(Resultlabel);

        bobj1.addActionListener(this);
        bobj2.addActionListener(this);
        bobj3.addActionListener(this);
        bobj4.addActionListener(this);

        fobj.setSize(width, height);
        fobj.setLayout(null);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent aobj)
    {
        try
        {
            int iValue1 = Integer.parseInt(tobj1.getText());
            int iValue2 = Integer.parseInt(tobj2.getText());
            int iResult = 0;

            if(aobj.getSource()==bobj1)
            {
                iResult=iValue1+iValue2;
            }
            else if(aobj.getSource()==bobj2)
            {
                iResult=iValue1-iValue2;
            }
            else if(aobj.getSource()==bobj3)
            {
                iResult=iValue1*iValue2;
            }
            else if(aobj.getSource()==bobj4)
            {
                if (iValue2 == 0)
                    {
                        Resultlabel.setText("Result:Cannot divide by zero");
                        return;
                    }

                iResult=iValue1/iValue2;
            }
            Resultlabel.setText("Result: " + iResult);
        }
        catch (NumberFormatException nobj)
            {
                Resultlabel.setText("Result:Invalid Input! Please enter integers only.");
            }


    }
}
class FrameCalculator
{
    public static void main(String a[])
    {
        Calculator1 cobj=new Calculator1("Calculator",400,300);
    }
}