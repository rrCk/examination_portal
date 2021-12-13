import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FmarkS

{
    static String Tdata[][]= new String[10][2];
    static int last;
    public void FMarks() 
    {
        //frame start
        JFrame Fmarks = new JFrame("MARKS");
        Fmarks.setSize(1200,800);
        Fmarks.getContentPane().setBackground(Color.black);
        Fmarks.setLayout(null);
        Fmarks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame end

        //Icons start
        Image icon = Toolkit.getDefaultToolkit().getImage("ic.png");
        Fmarks.setIconImage(icon);

        ImageIcon logop = new ImageIcon("mul.png");
        JLabel logol1 = new JLabel(logop);
        logol1.setBounds(74,-22,205,205);
        Fmarks.add(logol1);
        ImageIcon logo = new ImageIcon("mu.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(130,0,947,137);
        Fmarks.add(logol);

 
        /*ImageIcon tt = new ImageIcon("cm.png");
        JLabel ttl = new JLabel(tt);
        ttl.setBounds(330,170,540,500);
        Fmarks.add(ttl);*/
        //ICons end

        String column[]={"SUBJECT","GRADE"}; 

        JTable jt=new JTable(FmarkS.Tdata,column);
        jt.setBounds(400,250,400,300);   
        jt.setVisible(true);
        //jt.setFont("verdana", Font.BOLD , 20);           
        Fmarks.add(jt); 

        String semester[]={"select semester","semester-1","semester-2","semester-3","semester-4","semester-5","semester-6","semester-7","semester-8"};
        JComboBox cb = new JComboBox(semester);
        cb.setBounds(500, 160, 200, 50);
        Fmarks.add(cb);

       
        

        cb.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e)
            {
                Dbstudent.op = (String)cb.getSelectedItem();
                //System.out.println(FmarkS.op.charAt(FmarkS.op.length()-1));
                Dbstudent.marks(Dbstudent.op.charAt(Dbstudent.op.length()-1));
                if(Dbstudent.flag==1)
                JOptionPane.showMessageDialog(Fmarks,"Marks not available contact admin!!");
            }
        });
        //Button declaration

        JButton b2 = new JButton("HOME");
        b2.setBounds(525,600,150, 40);
        b2.setFont(new Font("MONOSPACED",Font.BOLD,20));
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Fmarks.dispose();
                new Fhome(DB.name,DB.id,DB.email,DB.branch);
            }
        });
 
        Fmarks.add(b2);

        Fmarks.setVisible(true);

    }

    public static void main( String args[] )
    {
        FmarkS p = new FmarkS();
        p.FMarks();
    }


    

    
}