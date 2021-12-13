import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Flogin 
{
    Flogin()
    {
        //Frame settings.
        JFrame Flogin = new JFrame("Login Page");
        Flogin.setSize(1200,800);
        Flogin.setLayout(null);
        Flogin.getContentPane().setBackground(Color.BLACK);
        Flogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Frame ending.

        Image icon = Toolkit.getDefaultToolkit().getImage("ic.png");
        Flogin.setIconImage(icon);
    
        JLabel title = new JLabel("EXAMINATION PORTAL");
        title.setFont(new Font("MONOSPACED", Font.BOLD, 50));
        title.setBounds(330,70,540,50);
        title.setForeground(Color.WHITE);
        Flogin.add(title);
        
        //Logo label.
        ImageIcon logo = new ImageIcon("logo.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(743,200,312,157);
        Flogin.add(logol);

        ImageIcon logo2 = new ImageIcon("col.jpg");
        JLabel logo12 = new JLabel(logo2);
        logo12.setBounds(100,200,400,410);
        Flogin.add(logo12);

        //Label end.
       
        //Labels start.
        JLabel id = new JLabel("ID");
        JLabel password = new JLabel("PASSWORD");
        Font  f2  = new Font(Font.SANS_SERIF,  Font.BOLD|Font.ITALIC, 20);
        
        id.setBounds(743,400,40,20);
        id.setFont(f2);
        id.setForeground(Color.WHITE);
        Flogin.add(id);

        password.setBounds(743,430,160,20);
        password.setFont(f2);
        password.setForeground(Color.WHITE);
        Flogin.add(password);
        //Labels end.


        //Text feilds start.
        JTextField idt = new JTextField();
        JPasswordField pt = new JPasswordField(10);
        pt.setEchoChar('*');
        idt.setBounds(900, 400, 157, 20);
        pt.setBounds(900, 430, 157, 20);

        Flogin.add(idt);
        Flogin.add(pt);
        //Textfeilds end.

        //Jbuttons
        JButton Fp = new JButton("Forgot Password");
        JButton Su = new JButton("Sign Up");
        JButton Si = new JButton("Sign In");

        Fp.setBounds(743,520,150,30);
        Fp.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
            Flogin.dispose();
            new Fforgotpass1();
        }
        });


        Su.setBounds(850,580,100,30);
        Su.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Flogin.dispose();
                new Fsignup();
            }
        });

        Si.setBounds(957,520,100,30);
        Si.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String id = idt.getText();
                String password = String.valueOf(pt.getPassword());

                Flogin.dispose();
                Dbstudent.signin(id, password);
                
                
                
            }
        });

        Flogin.add(Fp);
        Flogin.add(Si);
        Flogin.add(Su);
        //Buttons ending.
 
        Flogin.setVisible(true);
        Flogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void Felogin()
    {
        //Frame settings.
        JFrame Felogin = new JFrame("Login Page");
        Felogin.setSize(1200,800);
        Felogin.setLayout(null);
        Felogin.getContentPane().setBackground(Color.BLACK);
        Felogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Frame ending.

        Image icon = Toolkit.getDefaultToolkit().getImage("ic.png");
        Felogin.setIconImage(icon);
    
        JLabel title = new JLabel("EXAMINATION PORTAL");
        title.setFont(new Font("MONOSPACED", Font.BOLD, 50));
        title.setBounds(330,70,540,50);
        title.setForeground(Color.WHITE);
        Felogin.add(title);
        
        //Logo label.
        ImageIcon logo = new ImageIcon("logo.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(743,200,312,157);
        Felogin.add(logol);

        ImageIcon logo2 = new ImageIcon("col.jpg");
        JLabel logo12 = new JLabel(logo2);
        logo12.setBounds(100,200,400,410);
        Felogin.add(logo12);

        //Label end.
       
        //Labels start.
        JLabel id = new JLabel("ID");
        JLabel password = new JLabel("PASSWORD");
        JLabel emsg = new JLabel("Incorrect ID or PASSWORD please check!!!");
        Font  f2  = new Font(Font.SANS_SERIF,  Font.BOLD|Font.ITALIC, 20);
        Font  fer = new Font(Font.SANS_SERIF, Font.PLAIN, 15);
        
        id.setBounds(743,400,40,20);
        id.setFont(f2);
        id.setForeground(Color.WHITE);
        Felogin.add(id);

        password.setBounds(743,430,160,20);
        password.setFont(f2);
        password.setForeground(Color.WHITE);
        Felogin.add(password);

        emsg.setBounds(743,480,300,15);
        emsg.setFont(fer);
        emsg.setForeground(Color.RED);
        Felogin.add(emsg);
        //Labels end.


        //Text feilds start.
        JTextField idt = new JTextField();
        JPasswordField pt = new JPasswordField(10);
        pt.setEchoChar('*');
        idt.setBounds(900, 400, 157, 20);
        pt.setBounds(900, 430, 157, 20);

        Felogin.add(idt);
        Felogin.add(pt);
        //Textfeilds end.

        //Jbuttons
        JButton Fp = new JButton("Forgot Password");
        JButton Su = new JButton("Sign Up");
        JButton Si = new JButton("Sign In");

        Fp.setBounds(743,520,150,30);
        Fp.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
            Felogin.dispose();
            new Fforgotpass1();
        }
        });


        Su.setBounds(850,580,100,30);
        Su.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Felogin.dispose();
                new Fsignup();
            }
        });

        Si.setBounds(957,520,100,30);
        Si.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String id = idt.getText();
                String password = String.valueOf(pt.getPassword());

                Felogin.dispose();
                Dbstudent.signin(id, password);
                
                
                
            }
        });

        Felogin.add(Fp);
        Felogin.add(Si);
        Felogin.add(Su);
        //Buttons ending.
 
        Felogin.setVisible(true);
        Felogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String s[])
    {
        new Flogin();
    }
    

    

}