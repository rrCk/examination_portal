import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fcoursecontent

{
    JLabel ccl;

    Fcoursecontent(String ename,String eid,String eemail,String ebranch)
    {
        //frame start
        JFrame Fcoursecontent = new JFrame("MARKS");
        Fcoursecontent.setSize(1200,800);
        Fcoursecontent.getContentPane().setBackground(Color.black);
        Fcoursecontent.setLayout(null);
        Fcoursecontent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame end

        //Icons start
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\chand\\chandra\\DBMSDATA\\ic.png");
        Fcoursecontent.setIconImage(icon);

        ImageIcon logop = new ImageIcon("C:\\Users\\chand\\chandra\\DBMSDATA\\mul.png");
        JLabel logol1 = new JLabel(logop);
        logol1.setBounds(74,-22,205,205);
        Fcoursecontent.add(logol1);
        ImageIcon logo = new ImageIcon("C:\\Users\\chand\\chandra\\DBMSDATA\\mu.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(130,0,947,137);
        Fcoursecontent.add(logol);

        

        ccl = new JLabel();
        ccl.setBounds(200,190,800,500);
        Fcoursecontent.add(ccl);

        String semester[]={"select semester","semester-1","semester-2","semester-3","semester-4","semester-5","semester-6","semester-7","semester-8"};
        JComboBox cb = new JComboBox(semester);
        cb.setBounds(500, 160, 200, 30);
        Fcoursecontent.add(cb);

        
        cb.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e)
            {
                Dbstudent.op = (String)cb.getSelectedItem();
                Dbstudent.cc(Dbstudent.op.charAt(Dbstudent.op.length()-1));
                
                Fcoursecontent.remove(ccl);
                ccl = new JLabel( new ImageIcon(Dbstudent.cc));
                ccl.setBounds(200,200,800,500);
                Fcoursecontent.add(ccl);
            }
        });

        
        //ICons end

        //Button declaration

        JButton b2 = new JButton("HOME");
        b2.setBounds(525,720,150, 40);
        b2.setFont(new Font("MONOSPACED",Font.BOLD,20));
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Fcoursecontent.dispose();
                new Fhome(ename,eid,eemail,ebranch);
            }
        });
 
        Fcoursecontent.add(b2);  

        Fcoursecontent.setVisible(true);

    }

    public static void main( String args[] )
    {
        String n ="";
        new Fcoursecontent(n,n,n,n);
    }
    

}