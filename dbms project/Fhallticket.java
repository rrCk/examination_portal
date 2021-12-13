import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fhallticket

{

    Fhallticket(String ename,String eid,String eemail,String ebranch)
    {
        //frame start
        JFrame Fhallticket = new JFrame("HALL-TICKET");
        Fhallticket.setSize(1200,800);
        Fhallticket.getContentPane().setBackground(Color.black);
        Fhallticket.setLayout(null);
        Fhallticket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame end

        //Icons start
        Image icon = Toolkit.getDefaultToolkit().getImage("ic.png");
        Fhallticket.setIconImage(icon);

        ImageIcon logop = new ImageIcon("mul.png");
        JLabel logol1 = new JLabel(logop);
        logol1.setBounds(74,-22,205,205);
        Fhallticket.add(logol1);
        ImageIcon logo = new ImageIcon("mu.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(130,0,947,137);
        Fhallticket.add(logol);

        ImageIcon ht;
        if(ename.equals("Shreya Kuchibhatla"))
        {
            ht = new ImageIcon("sht.png");
        }
        else if(ename.equals("Singam Sai Akash"))
        {
            ht = new ImageIcon("aht.png");
        }
        else
        {
            ht = new ImageIcon("ht.jpg");
        }
        JLabel ht2 = new JLabel(ht);
        ht2.setBounds(360,155,484,420);
        Fhallticket.add(ht2);
        //ICons end

        //Button declaration
        JButton b1 = new JButton("DOWNLOAD");
        b1.setBounds(402,610,150, 40);
        b1.setFont(new Font("MONOSPACED",Font.BOLD,20));

        JButton b2 = new JButton("HOME");
        b2.setBounds(652,610,150, 40);
        b2.setFont(new Font("MONOSPACED",Font.BOLD,20));
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Fhallticket.dispose();
                new Fhome(ename,eid,eemail,ebranch);
            }
        });
 
        Fhallticket.add(b1);
        Fhallticket.add(b2);

        Fhallticket.setVisible(true);

    }

    public static void main( String args[] )
    {
        String n ="";
        new Fhallticket(n,n,n,n);
    }

    

    

    }