import java.awt.*;
import java.awt.event.*;

class GUI2 
{
    public static void main(String Arg[])
    {
        Frame fobj = new Frame("Marvellous PPA");   //frame header
        fobj.setSize(400,400);  //tya frame chi size
        fobj.setVisible(true);  //aplyala frame disnyasathi setVisible
        fobj.addWindowListener(new MarvellousListener());
    }
}

class MarvellousListener implements WindowListener
{
    public void windowDeactivated(WindowEvent obj)
    {}
    public void windowActivated(WindowEvent obj)
    {}
    public void windowDeiconified(WindowEvent obj)
    {}
    public void windowIconified(WindowEvent obj)
    {}
    public void windowClosed(WindowEvent obj)
    {}
    public void windowClosing(WindowEvent obj)
    {
        System.out.println(0);
    }
    public void windowOpened(WindowEvent obj)
    {}
}
