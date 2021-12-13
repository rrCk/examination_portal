import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;

class Dbstudent
{
    static String op="";
    static int flag = 0;
    static String attendance="";
    static String cc="";

    public static void main(String args[])
    {
        new Flogin();
    }

    public static void signin(String eid , String epassword)
    {
        DB.check_user(eid,epassword);

        //System.out.println(DB.password+" "+epassword);

        if(DB.id!="")
        {
            new Fhome(DB.name,DB.id,DB.email,DB.branch);
        }
        else
        {
            Flogin.Felogin();
        }
    }

    public static void signup(String name , String password , String branch , String id , String phno , String email , String currentyear , String currentsem)
    {
        
        DB.setdetails(name,password,branch,id,phno,email,currentyear,currentsem);
    }

    public static void forgotpassword(String eid,String ephno)
    {
        DB.checkexist(eid,ephno);

        if(DB.id!="")
        {
            new Fforgotpass2(DB.id);
        }
        else
        {
            Fforgotpass1.Feforgotpass1();
        }

    }

    public static void changepassword(String eid,String password)
    {
        DB.changepass(eid,password);
        new Flogin();

    }

    public static void errorpass(String id)
    {
        Fforgotpass2.Feforgotpass2(id);
    }

    public static void attendance(char sem)
    {
        DB.getAttendance(sem);
    }
    public static void marks(char sem)
    {
        DB.getMarks(sem);
    }
    public static void cc(char sem)
    {
        DB.getcc(sem);
    }


}