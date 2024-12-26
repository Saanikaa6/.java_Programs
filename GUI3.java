import java.awt.*;
import java.awt.event.*;

class GUI3 
{
    public static void main(String Arg[])
    {
        Frame fobj = new Frame("Marvellous PPA");   //frame header
        fobj.setSize(400,400);  //tya frame chi size
        fobj.setVisible(true);  //aplyala frame disnyasathi setVisible
        fobj.addWindowListener(new MarvellousListener());
    }
}

class MarvellousListener extends WindowAdapter
{
    public void windowClosing(WindowEvent obj)
    {
        System.out.println("exit");
    }
}
