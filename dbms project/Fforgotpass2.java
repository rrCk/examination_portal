import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fforgotpass2
{
    Fforgotpass2(String eid)
    {
        //Frame setting.
        JFrame Fforgotpass2 = new JFrame("Forgot password page");
        Fforgotpass2.setSize(1200,800);
        Fforgotpass2.getContentPane().setBackground(Color.black);
        Fforgotpass2.setLayout(null);
        //Frame ending.
        

        //Icons start
        Image icon = Toolkit.getDefaultToolkit().getImage("ic.png");
        Fforgotpass2.setIconImage(icon);
        
        ImageIcon logop = new ImageIcon("mul.png");
        JLabel logol1 = new JLabel(logop);
        logol1.setBounds(74,-22,205,205);
        Fforgotpass2.add(logol1);
        
        ImageIcon logo = new ImageIcon("mu.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(130,0,947,137);
        Fforgotpass2.add(logol);
        //ICons end

       
        JLabel title = new JLabel("ENTER NEW PASSWORD!");
        title.setFont(new Font("Serif", Font.BOLD , 30));
        title.setForeground(Color.white);
        title.setBounds(400,250,400,40);
        Fforgotpass2.add(title);

        JLabel pass = new JLabel("Password",JLabel.LEFT);
        JLabel newpass = new JLabel("Verify Password",JLabel.LEFT);
        
        Font  f  = new Font(Font.MONOSPACED,  Font.BOLD, 25);

        pass.setBounds(350, 400, 250,25);
        pass.setFont(f);
        pass.setForeground(Color.white);
        pass.setOpaque(true);
        pass.setBackground(Color.black);
        Fforgotpass2.add(pass);

        newpass.setBounds(350, 450, 250,25);
        newpass.setFont(f);
        newpass.setForeground(Color.white);
        newpass.setOpaque(true);
        newpass.setBackground(Color.black);
        Fforgotpass2.add(newpass);

        JPasswordField pt = new JPasswordField();
        JTextField npt = new JTextField();
        pt.setEchoChar('*');

        pt.setBounds(650, 400, 200, 25);
        npt.setBounds(650, 450, 200, 25);

        Fforgotpass2.add(pt);
        Fforgotpass2.add(npt);

        JButton con = new JButton("Continue");
        con.setBounds(700,560,100,30);
        con.setBackground(Color.yellow);
        con.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e )
            {
                String p = String.valueOf(pt.getPassword());
                String vp = npt.getText();

                if(p.equals(vp))
                {
                    Fforgotpass2.dispose();
                    Dbstudent.changepassword(eid,p);
                }
                else
                {
                    Fforgotpass2.dispose();
                    Dbstudent.errorpass(eid);
                }               

            }
        });

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(425,560,100,30);
        cancel.setBackground(Color.yellow);
        cancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                Fforgotpass2.dispose();
                new Flogin();
            }
        });

        Fforgotpass2.add(con);
        Fforgotpass2.add(cancel);

        Fforgotpass2.setVisible(true);
        Fforgotpass2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void Feforgotpass2(String eid)
    {
        //Frame setting.
        JFrame Feforgotpass2 = new JFrame("Forgot password page");
        Feforgotpass2.setSize(1200,800);
        Feforgotpass2.getContentPane().setBackground(Color.black);
        Feforgotpass2.setLayout(null);
        //Frame ending.
        

        //Icons start
        Image icon = Toolkit.getDefaultToolkit().getImage("ic.png");
        Feforgotpass2.setIconImage(icon);
        
        ImageIcon logop = new ImageIcon("mul.png");
        JLabel logol1 = new JLabel(logop);
        logol1.setBounds(74,-22,205,205);
        Feforgotpass2.add(logol1);
        
        ImageIcon logo = new ImageIcon("mu.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(130,0,947,137);
        Feforgotpass2.add(logol);
        //ICons end

       
        JLabel title = new JLabel("ENTER NEW PASSWORD!");
        title.setFont(new Font("Serif", Font.BOLD , 30));
        title.setForeground(Color.white);
        title.setBounds(400,250,400,40);
        Feforgotpass2.add(title);

        JLabel pass = new JLabel("Password",JLabel.LEFT);
        JLabel newpass = new JLabel("Verify Password",JLabel.LEFT);
        JLabel emsg = new JLabel("Entered details does not match!!!");

        Font  f  = new Font(Font.MONOSPACED,  Font.BOLD, 25);
        Font  fer = new Font(Font.SANS_SERIF, Font.PLAIN, 15);

        pass.setBounds(350, 400, 250,25);
        pass.setFont(f);
        pass.setForeground(Color.white);
        pass.setOpaque(true);
        pass.setBackground(Color.black);
        Feforgotpass2.add(pass);

        newpass.setBounds(350, 450, 250,25);
        newpass.setFont(f);
        newpass.setForeground(Color.white);
        newpass.setOpaque(true);
        newpass.setBackground(Color.black);
        Feforgotpass2.add(newpass);

        emsg.setBounds(350,500,300,15);
        emsg.setFont(fer);
        emsg.setForeground(Color.RED);
        Feforgotpass2.add(emsg);

        JPasswordField pt = new JPasswordField();
        JTextField npt = new JTextField();
        pt.setEchoChar('*');

        pt.setBounds(650, 400, 200, 25);
        npt.setBounds(650, 450, 200, 25);

        Feforgotpass2.add(pt);
        Feforgotpass2.add(npt);

        JButton con = new JButton("Continue");
        con.setBounds(700,560,100,30);
        con.setBackground(Color.yellow);
        con.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e )
            {
                String p = String.valueOf(pt.getPassword());
                String vp = npt.getText();

                if(p.equals(vp))
                {
                    Feforgotpass2.dispose();
                    Dbstudent.changepassword(eid,p);

                }

                

            }
        });

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(425,560,100,30);
        cancel.setBackground(Color.yellow);
        cancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                Feforgotpass2.dispose();
                new Flogin();
            }
        });

        Feforgotpass2.add(con);
        Feforgotpass2.add(cancel);

        Feforgotpass2.setVisible(true);
        Feforgotpass2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String s[])
    {
        String t="";
        new Fforgotpass2(t);
    }
}

