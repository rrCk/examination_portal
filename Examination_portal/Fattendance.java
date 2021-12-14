
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


class Fattendance
{
    static int random_int;
    Fattendance()
    {
        
        //frame start
        JFrame Fattendance = new JFrame("Attendance");
        Fattendance.setSize(1200,800);
        Fattendance.getContentPane().setBackground(Color.black);
        Fattendance.setLayout(null);
        
        
        Fattendance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame end
        
        //Icons start
        Image icon = Toolkit.getDefaultToolkit().getImage("DBMSDATA\\ic.png");
        Fattendance.setIconImage(icon);
        
        ImageIcon logop = new ImageIcon("DBMSDATA\\mul.png");
        JLabel logol1 = new JLabel(logop);
        logol1.setBounds(74,-22,205,205);
        Fattendance.add(logol1);
        
        ImageIcon logo = new ImageIcon("DBMSDATA\\mu.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(130,0,947,137);
        Fattendance.add(logol);
        //Icons End.
        
        //JLabels start.
        JLabel heading = new JLabel("Attendance:");
        heading.setForeground(Color.white);
        heading.setFont(new Font("Verdana", Font.PLAIN, 50));
        heading.setBounds(400, 200, 400, 150);
        Fattendance.add(heading);
        
        JLabel num = new JLabel();
        num.setText(" ");
        num.setForeground(Color.white);
        num.setFont(new Font("Verdana", Font.BOLD, 50));
        num.setBounds(550,320, 200, 150);
        Fattendance.add(num);
        //JLabels end.


        
        //JCombobox start.
        String semester[]={"select semester","semester-1","semester-2","semester-3","semester-4","semester-5","semester-6","semester-7","semester-8"};
        JComboBox cb = new JComboBox(semester);
        cb.setBounds(500, 160, 200, 50);
        Fattendance.add(cb);

        
        cb.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e)
            {
                Dbstudent.op = (String)cb.getSelectedItem();
                Dbstudent.attendance(Dbstudent.op.charAt(Dbstudent.op.length()-1));
                if(Dbstudent.flag==1)
                {
                    num.setText(" ");
                    JOptionPane.showMessageDialog(Fattendance,"Attendance not available contact admin!!");
                }
                else
                num.setText(" " + Dbstudent.attendance + "%");
                
            }
        });
        //JCombobox end.

        //Jbuttons start
        JButton b2 = new JButton("HOME");
        b2.setBounds(525,650,150, 40);
        b2.setFont(new Font("MONOSPACED",Font.BOLD,20));
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Fattendance.dispose();
                new Fhome();
            }
        });
        Fattendance.add(b2);
        //Jbuttons end.
        Fattendance.setVisible(true);
        
    }
    
    public static void main( String args[] )
    {
        new Fattendance();
    }
}
