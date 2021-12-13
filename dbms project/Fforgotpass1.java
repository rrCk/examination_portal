import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fforgotpass1 
{

    Fforgotpass1()
    {
        JFrame Fforgotpass1 = new JFrame("Reset Password");
        Fforgotpass1.setSize(1200,800);
        Fforgotpass1.getContentPane().setBackground(Color.black);
        Fforgotpass1.setLayout(null);

        //Icons start
        Image icon = Toolkit.getDefaultToolkit().getImage("ic.png");
        Fforgotpass1.setIconImage(icon);
        
        ImageIcon logop = new ImageIcon("mul.png");
        JLabel logol1 = new JLabel(logop);
        logol1.setBounds(74,-22,205,205);
        Fforgotpass1.add(logol1);
        
        ImageIcon logo = new ImageIcon("mu.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(130,0,947,137);
        Fforgotpass1.add(logol);
        //ICons end
        
        //Labels start
        JLabel title = new JLabel("FORGOT PASSWORD?");
        title.setFont(new Font("MONOSPACED", Font.BOLD , 40));
        title.setForeground(Color.white);
        title.setBounds(400,250,400,100);
        Fforgotpass1.add(title);

        JLabel id = new JLabel("Hallticket no :", JLabel.LEFT);
        JLabel phno = new JLabel("Phone Number :",JLabel.LEFT);
        
        Font  f  = new Font(Font.MONOSPACED,  Font.BOLD, 25);

        id.setBounds(350, 400, 250,30);
        id.setFont(f);
        id.setForeground(Color.white);
        Fforgotpass1.add(id);

        phno.setBounds(350,500,250,30);
        phno.setFont(f);
        phno.setForeground(Color.white);
        Fforgotpass1.add(phno);
        //Labels end.

        //Textfields start.
        JTextField idt = new JTextField();
        JTextField pht = new JTextField();

        idt.setBounds(650, 400, 200, 30);
        pht.setBounds(650,500,200,30);

        Fforgotpass1.add(idt);
        Fforgotpass1.add(pht);
        //Textfield end.

        //Buttons start.
        JButton cont = new JButton("Continue");
        cont.setBounds(700,600,100,30);
        cont.setBackground(Color.CYAN);
        cont.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String id = idt.getText();
                String phno = pht.getText();
                Fforgotpass1.dispose();
                Dbstudent.forgotpassword(id, phno);
            }
        });

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(375,600,100,30);
        cancel.setBackground(Color.cyan);
        cancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                Fforgotpass1.dispose();
                new Flogin();
            }
        });
        //Buttons end.


        Fforgotpass1.add(cont);
        Fforgotpass1.add(cancel);

        Fforgotpass1.setVisible(true);
        Fforgotpass1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void Feforgotpass1()
    {
        JFrame Feforgotpass1 = new JFrame("Reset Password");
        Feforgotpass1.setSize(1200,800);
        Feforgotpass1.getContentPane().setBackground(Color.black);
        Feforgotpass1.setLayout(null);

        //Icons start
        Image icon = Toolkit.getDefaultToolkit().getImage("ic.png");
        Feforgotpass1.setIconImage(icon);
        
        ImageIcon logop = new ImageIcon("mul.png");
        JLabel logol1 = new JLabel(logop);
        logol1.setBounds(74,-22,205,205);
        Feforgotpass1.add(logol1);
        
        ImageIcon logo = new ImageIcon("mu.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(130,0,947,137);
        Feforgotpass1.add(logol);
        //ICons end
        
        //Labels start
        JLabel title = new JLabel("FORGOT PASSWORD?");
        title.setFont(new Font("MONOSPACED", Font.BOLD , 40));
        title.setForeground(Color.white);
        title.setBounds(400,250,400,100);
        Feforgotpass1.add(title);

        JLabel id = new JLabel("Hallticket no :", JLabel.LEFT);
        JLabel phno = new JLabel("Phone Number :",JLabel.LEFT);
        JLabel emsg = new JLabel("Entered details does not match!!!");
        
        Font  f  = new Font(Font.MONOSPACED,  Font.BOLD, 25);
        Font  fer = new Font(Font.SANS_SERIF, Font.PLAIN, 15);

        id.setBounds(350, 400, 250,30);
        id.setFont(f);
        id.setForeground(Color.white);
        Feforgotpass1.add(id);

        phno.setBounds(350,500,250,30);
        phno.setFont(f);
        phno.setForeground(Color.white);
        Feforgotpass1.add(phno);

        emsg.setBounds(350,560,300,15);
        emsg.setFont(fer);
        emsg.setForeground(Color.RED);
        Feforgotpass1.add(emsg);
        //Labels end.

        //Textfields start.
        JTextField idt = new JTextField();
        JTextField pht = new JTextField();

        idt.setBounds(650, 400, 200, 30);
        pht.setBounds(650,500,200,30);

        Feforgotpass1.add(idt);
        Feforgotpass1.add(pht);
        //Textfield end.

        //Buttons start.
        JButton cont = new JButton("Continue");
        cont.setBounds(700,600,100,30);
        cont.setBackground(Color.CYAN);
        cont.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String id = idt.getText();
                String phno = pht.getText();
                Feforgotpass1.dispose();
                Dbstudent.forgotpassword(id, phno);
            }
        });

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(375,600,100,30);
        cancel.setBackground(Color.cyan);
        cancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                Feforgotpass1.dispose();
                new Flogin();
            }
        });
        //Buttons end.


        Feforgotpass1.add(cont);
        Feforgotpass1.add(cancel);

        Feforgotpass1.setVisible(true);
        Feforgotpass1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String s[])
    {
        new Fforgotpass1();
    }
    
}
