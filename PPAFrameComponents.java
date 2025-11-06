import javax.swing.*;
class PPAFrameComponents 
{
    public static void main(String a[])
    {
        JFrame fobj=new JFrame("ppa");

        JButton bobj=new JButton("OK");//add button

        fobj.add(bobj);

        fobj.setSize(300,300);
        fobj.setVisible(true);//shows on screen after running setVisible

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame will close


    }
    
}
