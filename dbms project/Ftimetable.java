import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ftimetable

{

    Ftimetable(String ename,String eid,String eemail,String ebranch)
    {
        //frame start
        JFrame Ftimetable = new JFrame("TIME-TABLE");
        Ftimetable.setSize(1200,800);
        Ftimetable.getContentPane().setBackground(Color.black);
        Ftimetable.setLayout(null);
        Ftimetable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame end

        //Icons start
        Image icon = Toolkit.getDefaultToolkit().getImage("ic.png");
        Ftimetable.setIconImage(icon);

        ImageIcon logop = new ImageIcon("mul.png");
        JLabel logol1 = new JLabel(logop);
        logol1.setBounds(74,-22,205,205);
        Ftimetable.add(logol1);
        ImageIcon logo = new ImageIcon("mu.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(130,0,947,137);
        Ftimetable.add(logol);

 
        ImageIcon tt = new ImageIcon("tt.png");
        JLabel ttl = new JLabel(tt);
        ttl.setBounds(250,170,737,500);
        Ftimetable.add(ttl);
        //ICons end

        //Button declaration
        JButton b1 = new JButton("DOWNLOAD");
        b1.setBounds(402,710,150, 40);
        b1.setFont(new Font("MONOSPACED",Font.BOLD,20));

        JButton b2 = new JButton("HOME");
        b2.setBounds(652,710,150, 40);
        b2.setFont(new Font("MONOSPACED",Font.BOLD,20));
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Ftimetable.dispose();
                new Fhome(ename,eid,eemail,ebranch);
            }
        });
 
        Ftimetable.add(b1);
        Ftimetable.add(b2);

        Ftimetable.setVisible(true);

    }

    public static void main( String args[] )
    {
        String n ="";
        new Ftimetable(n,n,n,n);
    }

    

    

    }