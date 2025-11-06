import javax.swing.*;
class PPAFrameComponentsPosition 
{
    public static void main(String a[])
    {
        JFrame fobj=new JFrame("ppa");//title
        JButton bobj=new JButton("OK");//add button

        bobj.setBounds(100,100,150,50);//set button size

        fobj.add(bobj);

        fobj.setSize(400,300);//set frame size

        fobj.setLayout(null);//will set button size and on clicking outside button there will be no effect
        fobj.setVisible(true);//shows on screen after running setVisible

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame will close


    }
    
}
