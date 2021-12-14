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
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\chand\\chandra\\DBMSDATA\\ic.png");
        Fhallticket.setIconImage(icon);

        ImageIcon logop = new ImageIcon("C:\\Users\\chand\\chandra\\DBMSDATA\\mul.png");
        JLabel logol1 = new JLabel(logop);
        logol1.setBounds(74,-22,205,205);
        Fhallticket.add(logol1);
        ImageIcon logo = new ImageIcon("C:\\Users\\chand\\chandra\\DBMSDATA\\mu.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(130,0,947,137);
        Fhallticket.add(logol);

        JLabel text = new JLabel("Download,fill and get it signed!!");
        text.setBounds(475,180,250,20);
        text.setFont(new Font("verdana",Font.PLAIN,15));
        text.setForeground(Color.yellow);
        Fhallticket.add(text);
        ImageIcon ht = new ImageIcon("C:\\Users\\chand\\chandra\\DBMSDATA\\hallticket.png");
        JLabel ht2 = new JLabel(ht);
        ht2.setBounds(200,210,800,450);
        Fhallticket.add(ht2);
        //ICons end

        //Button declaration
        JButton b1 = new JButton("DOWNLOAD");
        b1.setBounds(402,680,150, 40);
        b1.setFont(new Font("MONOSPACED",Font.BOLD,20));

        JButton b2 = new JButton("HOME");
        b2.setBounds(652,680,150, 40);
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