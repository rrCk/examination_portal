import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Fhome
{

    Fhome()
    {
        //Frame settings.
        JFrame Fhome = new JFrame("Home Page");
        Fhome.setSize(1200,800);
        Fhome.setLayout(null);
        
        Fhome.getContentPane().setBackground(Color.BLACK);
        //Frame ending.

        Image icon = Toolkit.getDefaultToolkit().getImage("DBMSDATA\\ic.png");
        Fhome.setIconImage(icon);

 
        JLabel title = new JLabel("EXAMINATION PORTAL");
        title.setFont(new Font("Serif", Font.BOLD, 50));
        title.setBounds(300,20,800,50);
        title.setForeground(Color.WHITE);
        Fhome.add(title);

 
        JLabel title2 = new JLabel("HOME PAGE");
        title2.setFont(new Font("Serif", Font.BOLD, 35));
        title2.setBounds(500,90,400,30);
        title2.setForeground(Color.WHITE);
        Fhome.add(title2);

        //Logo label.
        ImageIcon logo = new ImageIcon("DBMSDATA\\logo.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(40,130,312,157);
        Fhome.add(logol);
        //Label end.

        //Labels start.
        JLabel id = new JLabel("ID - " + DB.id);
        JLabel name = new JLabel("NAME - "+DB.name);
        JLabel branch = new JLabel("BRANCH - "+DB.branch);
        JLabel email= new JLabel("EMAIL - "+DB.email);

        Font  f2  = new Font(Font.MONOSPACED,Font.BOLD, 25);
        id.setBounds(40,350,600,30);
        id.setFont(f2);
        id.setForeground(Color.WHITE);
        Fhome.add(id);

        name.setBounds(40,400,600,30);
        name.setFont(f2);
        name.setForeground(Color.WHITE);
        Fhome.add(name);

        branch.setBounds(40,450,600,30);
        branch.setFont(f2);
        branch.setForeground(Color.WHITE);
        Fhome.add(branch);

        email.setBounds(40,500,600,40);
        email.setFont(f2);
        email.setForeground(Color.WHITE);
        Fhome.add(email);
        //Labels end.

        //Jbuttons
        JButton tt = new JButton("TIME-TABLE");
        JButton att = new JButton("ATTENDANCE");
        JButton ma = new JButton("MARKS");
        JButton cc = new JButton("COURSE-CONTENT");
        JButton ht = new JButton("HALL-TICKET");
        JButton lo = new JButton("LOGOUT");

        tt.setBounds(725,175,400,70);
        tt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Fhome.dispose();
                new Ftimetable();
            }
        });
        
        att.setBounds(725,275,400,70);
        att.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(DB.fresh==0)
                {
                    JOptionPane.showMessageDialog(Fhome,"new user attendance not available please contact admin");
                }
                else
                {
                    Fhome.dispose();
                    new Fattendance();

                }
            }
        });

        ht.setBounds(725,375,400,70);
        ht.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Fhome.dispose();
                new Fhallticket();
            }
        });

        ma.setBounds(725,475,400,70);
        ma.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                if(DB.fresh==0)
                {
                    JOptionPane.showMessageDialog(Fhome,"new user marks not available please contact admin");
                }
                else
                {
                    Fhome.dispose();
                    FmarkS l = new FmarkS();
                    l.FMarks();

                }
                
            }
        });
        
        cc.setBounds(725,575,400,70);
        cc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Fhome.dispose();
                new Fcoursecontent();
            }
        });

        lo.setBounds(450,675,200,50);
        lo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Fhome.dispose();
                new Dbstudent();
                new Flogin();
            }
        });

        tt.setFont(f2);
        att.setFont(f2);
        ht.setFont(f2);
        ma.setFont(f2);
        cc.setFont(f2);
        lo.setFont(f2); 

        Fhome.add(tt);
        Fhome.add(att);
        Fhome.add(ht);
        Fhome.add(ma);
        Fhome.add(cc);
        Fhome.add(lo);
        //Buttons ending.

        Fhome.setVisible(true);
        Fhome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String args[])
    {
        new Fhome();
    }

}