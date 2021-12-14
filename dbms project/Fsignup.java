import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Fsignup
{
    @SuppressWarnings("unchecked")
    Fsignup()
    {
        //frame start
        JFrame Fsignup = new JFrame("Sign Up");
        Fsignup.setSize(1200,800);
        Fsignup.getContentPane().setBackground(Color.black);
        Fsignup.setLayout(null);
        
        Fsignup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame end
        
        //Icons start
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\chand\\chandra\\DBMSDATA\\ic.png");
        Fsignup.setIconImage(icon);
        
        ImageIcon logop = new ImageIcon("C:\\Users\\chand\\chandra\\DBMSDATA\\mul.png");
        JLabel logol1 = new JLabel(logop);
        logol1.setBounds(74,-22,205,205);
        Fsignup.add(logol1);
        
        ImageIcon logo = new ImageIcon("C:\\Users\\chand\\chandra\\DBMSDATA\\mu.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(130,0,947,137);
        Fsignup.add(logol);
        //ICons end
        
       

        
        //Labels start.
        JLabel signup = new JLabel("Sign up");
        signup.setForeground(Color.white);
        signup.setFont(new Font("Verdana", Font.PLAIN, 50));
        signup.setBounds(100, 268, 220, 100);
        Fsignup.add(signup);
        
        JLabel fname = new JLabel("First Name :");
        fname.setForeground(Color.white);
        fname.setFont(new Font("Verdana", Font.PLAIN, 20));
        fname.setBounds(420, 200, 220, 50);
        Fsignup.add(fname);
        
        JLabel mname = new JLabel("Middle Name :");
        mname.setForeground(Color.white);
        mname.setFont(new Font("Verdana", Font.PLAIN, 20));
        mname.setBounds(420, 230, 220, 50);
        Fsignup.add(mname);
        
        JLabel lname = new JLabel("Last Name :");
        lname.setForeground(Color.white);
        lname.setFont(new Font("Verdana", Font.PLAIN, 20));
        lname.setBounds(420, 260, 220, 50);
        Fsignup.add(lname);
        
        JLabel rollno = new JLabel("Hallticket no. :");
        rollno.setForeground(Color.white);
        rollno.setFont(new Font("Verdana", Font.PLAIN, 20));
        rollno.setBounds(420, 290, 220, 50);
        Fsignup.add(rollno);
        
        JLabel branch = new JLabel("Branch :");
        branch.setForeground(Color.white);
        branch.setFont(new Font("Verdana", Font.PLAIN, 20));
        branch.setBounds(420, 320, 220, 50);
        Fsignup.add(branch);
        
        JLabel pass1 = new JLabel("Password :");
        pass1.setForeground(Color.white);
        pass1.setFont(new Font("Verdana", Font.PLAIN, 20));
        pass1.setBounds(420, 350, 220, 50);
        Fsignup.add(pass1);
        
        JLabel pass2 = new JLabel("Re-enter Password :");
        pass2.setForeground(Color.white);
        pass2.setFont(new Font("Verdana", Font.PLAIN, 20));
        pass2.setBounds(420, 380, 220, 50);
        Fsignup.add(pass2);
        
        JLabel phoneno = new JLabel("Phone no. :");
        phoneno.setForeground(Color.white);
        phoneno.setFont(new Font("Verdana", Font.PLAIN, 20));
        phoneno.setBounds(420, 410, 220, 50);
        Fsignup.add(phoneno);
        
        JLabel emailid = new JLabel("Email-id :");
        emailid.setForeground(Color.white);
        emailid.setFont(new Font("Verdana", Font.PLAIN, 20));
        emailid.setBounds(420, 440, 220, 50);
        Fsignup.add(emailid);
        
        JLabel curryear = new JLabel("Current year :");
        curryear.setForeground(Color.white);
        curryear.setFont(new Font("Verdana", Font.PLAIN, 20));
        curryear.setBounds(420, 470, 220, 50);
        Fsignup.add(curryear);
        //labels end
        
        //Start radio button
        JRadioButton sem1 = new JRadioButton("Sem 1");
        sem1.setForeground(Color.white);
        sem1.setOpaque(false);
        sem1.setBounds(640, 535, 100, 50);
        

        JRadioButton sem2 = new JRadioButton("Sem 2");
        sem2.setForeground(Color.white);
        sem2.setOpaque(false);
        sem2.setBounds(640, 565, 100, 50);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(sem1);
        bg.add(sem2);
        Fsignup.add(sem1);
        Fsignup.add(sem2);
        //End radio button.
        
        //Start textfeilds.
        JTextField fnamet = new JTextField(); 
        fnamet.setBounds(640, 210, 200, 20);
        Fsignup.add(fnamet);
        
        JTextField mnamet = new JTextField(); 
        mnamet.setBounds(640, 240, 200, 20);
        Fsignup.add(mnamet);
        
        JTextField lnamet = new JTextField(); 
        lnamet.setBounds(640, 270, 200, 20);
        Fsignup.add(lnamet);
        
        JTextField rollnot = new JTextField(); 
        rollnot.setBounds(640, 300, 200, 20);
        Fsignup.add(rollnot);
        
        
        String branches[]={"CSE","EEE","Civil","Mech"};
        JComboBox cb = new JComboBox(branches);
        cb.setBounds(640, 330, 200, 20);
        Fsignup.add(cb);
        
        JPasswordField pass1t = new JPasswordField(); 
        pass1t.setEchoChar('*');
        pass1t.setBounds(640, 360, 200, 20);
        Fsignup.add(pass1t);
        
        JTextField pass2t = new JTextField(); 
        pass2t.setBounds(640, 390, 200, 20);
        Fsignup.add(pass2t);
        
        JTextField phone = new JTextField(); 
        phone.setBounds(640, 420, 200, 20);
        Fsignup.add(phone);
        
        JTextField email = new JTextField(); 
        email.setBounds(640, 450, 200, 20);
        Fsignup.add(email);
        
        JTextField curryeart = new JTextField(); 
        curryeart.setBounds(640, 480, 200, 20);
        Fsignup.add(curryeart);
        //End textfeilds.

        //Button declaration
        JButton b1 = new JButton("Submit");
        b1.setBounds(670,650,140, 40);
        b1.setFont(new Font("MONOSPACED",Font.BOLD,20));
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String finame = fnamet.getText();
                String miname = mnamet.getText();
                String laname = lnamet.getText();
                String hano = rollnot.getText();
                String bran = (String) cb.getSelectedItem(); 
                String passw1 = String.valueOf(pass1t.getPassword());
                String passw2 =pass2t.getText();
                String pno = phone.getText();
                String emai = email.getText();
                String cuye = curryeart.getText();

                String semt ="";

                if(sem1.isSelected())
                {
                    semt = "1";
                }
                else if(sem2.isSelected())
                {
                    semt = "2";
                }

 
                String fmlname = finame+" "+miname+" "+laname;

                
                 
                if(fmlname.equals(""))
                {
                    JOptionPane.showMessageDialog(Fsignup,"You did not enter name please check!!");
                }
                else if(!passw1.equals(passw2))
                {
                    JOptionPane.showMessageDialog(Fsignup,"Entered passwords do not match please check!!");
                }
                else if(pno.length()!=10)
                {
                    JOptionPane.showMessageDialog(Fsignup,"Entered phone number is less!!");
                }
                else
                {
                    Fsignup.dispose();
                    Dbstudent.signup(fmlname,passw1,bran,hano,pno,emai,cuye,semt);
                    //new Flogin();
                }
 
            }
        });
        Fsignup.add(b1);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(460,650,140,40);
        cancel.setFont(new Font("MONOSPACED",Font.BOLD,20));
        cancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                Fsignup.dispose();
                new Flogin();
            }
        });
        Fsignup.add(cancel);
        

        Fsignup.setVisible(true);
    }

    public static void main( String args[] )
    {
        new Fsignup();
    }


}
