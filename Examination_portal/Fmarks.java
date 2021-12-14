import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.table.DefaultTableCellRenderer;

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
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\chand\\chandra\\DBMSDATA\\ic.png");
        Fmarks.setIconImage(icon);

        ImageIcon logop = new ImageIcon("C:\\Users\\chand\\chandra\\DBMSDATA\\mul.png");
        JLabel logol1 = new JLabel(logop);
        logol1.setBounds(74,-22,205,205);
        Fmarks.add(logol1);
        ImageIcon logo = new ImageIcon("C:\\Users\\chand\\chandra\\DBMSDATA\\mu.png");
        JLabel logol = new JLabel(logo);
        logol.setBounds(130,0,947,137);
        Fmarks.add(logol);
        //Icons end.

 
        //JLabel,table combobox start.
        String column[]={"SUBJECT","GRADE"};
        
        JLabel sub = new JLabel("SUBJECT",JLabel.CENTER);
        JLabel gra = new JLabel("GRADE",JLabel.CENTER);

        Font f1 = new Font("sans.seriff",Font.BOLD,20);
        sub.setFont(f1);
        gra.setFont(f1);
        sub.setBounds(400,270,200,30);
        gra.setBounds(600,270,200,30);
        sub.setForeground(Color.white);
        gra.setForeground(Color.white);
        Fmarks.add(sub);
        Fmarks.add(gra);

        JLabel gpa = new JLabel("GPA",JLabel.CENTER);
        JLabel tot = new JLabel("",JLabel.CENTER);
        gpa.setFont(f1);
        tot.setFont(f1);
        gpa.setBounds(400,630,200,30);
        tot.setBounds(600,630,200,30);
        gpa.setForeground(Color.white);
        tot.setForeground(Color.white);
        Fmarks.add(gpa);
        Fmarks.add(tot);


        JTable jt=new JTable(FmarkS.Tdata,column);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jt.setRowHeight(jt.getRowHeight() + 18);
        jt.setBounds(400,320,400,300);   
        jt.setVisible(true);
        jt.setFont(new Font("verdana", Font.BOLD , 20));           
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
                else
                {
                    jt.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
                    jt.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                    float avg=0;
                    int j;
                    for( j=0 ; (j<=FmarkS.last);j++)
                    {
                        avg = avg + Float.parseFloat(FmarkS.Tdata[j][1]);
                    }
                    avg=avg/(FmarkS.last+1);
                    String s = Float. toString(avg);
                    tot.setText(s);
                }
            }
        });
        //end of dropdowns.

        //Button declaration
        JButton b2 = new JButton("HOME");
        b2.setBounds(525,700,150, 40);
        b2.setFont(new Font("MONOSPACED",Font.BOLD,20));
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Fmarks.dispose();
                new Fhome();
            }
        });
 
        Fmarks.add(b2);
        //Button ending.

        Fmarks.setVisible(true);

    }

    public static void main( String args[] )
    {
        FmarkS p = new FmarkS();
        p.FMarks();
    }


    

    
}