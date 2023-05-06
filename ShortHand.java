import java.awt.*;
import java.awt.event.*;

class ShortHand
{
    public static void main(String Arg[])
    {
        Frame fobj = new Frame("Marvellous");
        fobj.setSize(500,500);
        fobj.setVisible(true);

        Button bobj = new Button("OK");
        fobj.add(bobj);
        
        //Annonymous inner class
        bobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj)
            {
                System.out.println("Button Pressed");
            }
        });
    }
}