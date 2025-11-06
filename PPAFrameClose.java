import javax.swing.*;
class PPAFrameClose 
{
    public static void main(String a[])
    {
        JFrame fobj=new JFrame("ppa");//Frame is inbuilt class in java.seing

        fobj.setSize(300,300);
        fobj.setVisible(true);//shows on screen after running setVisible

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame will close


    }
    
}
