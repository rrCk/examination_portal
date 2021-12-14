import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ftimetable

{
    JLabel ttl;

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
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\chand\\chandra\\DBMSDATA\\ic.png");
        Ftimetable.setIconImage(icon);

        ImageIcon logop = new ImageIcon("C:\\Users\\chand\\chandra\\DBMSDATA\\mul.png");
        JLabel logol1 = new JLabel(logop);
        logol1.setBounds(74,-22,205,205);
        Ftimetable.add(logol1);
        ImageIcon logo = new ImageIcon("C:\\Users\\chand\\chandra\\DBMSDATA\\mu.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(130,0,947,137);
        Ftimetable.add(logol);

 
        ImageIcon tt = new ImageIcon("C:\\Users\\chand\\chandra\\DBMSDATA\\regular.png");
        ttl = new JLabel(tt);
        ttl.setBounds(200,230,800,450);
        Ftimetable.add(ttl);
        //ICons end

        String semester[]={"regular","supply_sem_1","supply_sem_2","supply_sem_3","supply_sem_4"};
        JComboBox cb = new JComboBox(semester);
        cb.setBounds(500, 160, 200, 30);
        Ftimetable.add(cb);

        
        cb.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e)
            {
                Dbstudent.op = (String)cb.getSelectedItem();
                Dbstudent.tt(Dbstudent.op.charAt(Dbstudent.op.length()-1));
                Ftimetable.remove(ttl);
                
                ttl = new JLabel( new ImageIcon(Dbstudent.tt));
                ttl.setBounds(200,230,800,450);
                Ftimetable.add(ttl);
            }
        });

        //Button declaration
        JButton b2 = new JButton("HOME");
        b2.setBounds(525,710,150, 40);
        b2.setFont(new Font("MONOSPACED",Font.BOLD,20));
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Ftimetable.dispose();
                new Fhome(ename,eid,eemail,ebranch);
            }
        });
 
        Ftimetable.add(b2);

        Ftimetable.setVisible(true);

    }

    public static void main( String args[] )
    {
        String n ="";
        new Ftimetable(n,n,n,n);
    }

    

    

    }