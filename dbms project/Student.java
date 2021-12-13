import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

class Student 
{
    String name;
    String password;
    String branch;
    String id;
    String phno;
    String email;
    String currentyear;
    String currentsem;

    static Student s[] = new Student[10];
    static int last;

    Student()
    {
        this.name = "";
        this.password = "";
        this.branch = "";
        this.id = "";
        this.phno = "";
        this.email = "";
        this.currentyear = "";
        this.currentsem ="";

    }
    Student(String name , String password , String branch , String id , String phno , String email , String currentyear , String currentsem)
    {
        this.name = name;
        this.password = password;
        this.branch = branch;
        this.id = id;
        this.phno = phno;
        this.email = email;
        this.currentyear = currentyear;
        this.currentsem = currentsem;
        last++;
    }

    public static void main(String args[])
    {
        
        Student l = new Student();
        last = 0;

        s[last] = new Student("R R Chandra Krishna","password","CSE","19XJ1A0555","9866033466","raja19555@mechyd.ac.in","2nd Year","2nd Sem");
        s[last] = new Student("Singam Sai Akash","password","CSE","19XJ1A0570","8790379033","singam570@mechyd.ac.in","2nd Year","2nd Sem");
        s[last] = new Student("Shreya Kuchibhatla","password","CSE","19XJ1A0509","8897585102","shreya509@mechyd.ac.in","2nd Year","2nd Sem");

        new Flogin();



    }

    public static void signin(String eid , String epassword)
    {
        int i;
        for(i=0;i<last;i++)
        {
            if(eid.equals(s[i].id))
            {
                if(epassword.equals(s[i].password))
                {
                    new Fhome(s[i].name,s[i].id,s[i].email,s[i].branch);
                    break;
                }
            }   
        }

        if(i==last)
        {
            new Flogin();
        }

    
    }

    public static void signup(String name , String password , String branch , String id , String phno , String email , String currentyear , String currentsem)
    {
        s[last] = new Student(name,password,branch,id,phno,email,currentyear,currentsem);
        new Flogin();
    }

    public static void forgotpassword(String eid,String ephno)
    {
        int i;
        for(i=0;i<last;i++)
        {
            if(s[i].id.equals(eid))
            {
                if(s[i].phno.equals(ephno))
                {
                    new Fforgotpass2(eid);
                    break;
                }
            }
        }
        if(i==last)
        {
            new Fforgotpass1();
        }

    }

    public static void changepassword(String eid,String epassword)
    {
        int i;
        for(i=0;i<last;i++)
        {
            if(s[i].id.equals(eid))
            {
                break;
            }
        }

        s[i].password = epassword;
        new Flogin();
        
    }

    
}
