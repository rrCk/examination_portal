import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;

class Dbstudent
{
    static int login_flag;
    static int forgot_flag;
    static String op;
    static int flag;
    static String attendance;
    static String cc;
    static String tt;

    Dbstudent()
    {   
        Dbstudent.login_flag=0;
        Dbstudent.forgot_flag=0;
        Dbstudent.op="";
        Dbstudent.flag = 0;
        Dbstudent.attendance="";
        Dbstudent.cc="";
        Dbstudent.tt="";

    }
    public static void main(String args[])
    {
        new Dbstudent();
        new Flogin();
    }

    public static void signin(String eid , String epassword)
    {
        DB.check_user(eid,epassword);

        if(DB.id!="")
        {
            Dbstudent.login_flag=0;
            new Fhome();
        }
        else
        {
            Dbstudent.login_flag=1;
            new Flogin();
        }
    }

    public static void signup(String name , String password , String branch , String id , String phno , String email , String currentyear , String currentsem)
    {   
        DB.setdetails(name,password,branch,id,phno,email,currentyear,currentsem);
        new Flogin();
    }

    public static void forgotpassword(String eid,String ephno)
    {
        DB.checkexist(eid,ephno);

        if(DB.id!="")
        {
            Dbstudent.forgot_flag=0;
            new Fforgotpass2();
        }
        else
        {
            Dbstudent.forgot_flag=1;
            new Fforgotpass1();
        }

    }

    public static void changepassword(String password)
    {
        DB.changepass(password);
        new Flogin();

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

    public static void tt(char sem)
    {
        if(sem=='r')
        {
            Dbstudent.tt = "DBMSDATA\\regular.png";
        }
        else if(sem=='1')
        {
            Dbstudent.tt = "DBMSDATA\\supply_1.png";
        }
        else if(sem=='2')
        {
            Dbstudent.tt = "DBMSDATA\\supply_2.png";
        }
        else if(sem=='3')
        {
            Dbstudent.tt = "DBMSDATA\\supply_3.png";
        }
        else if(sem=='4')
        {
            Dbstudent.tt = "DBMSDATA\\supply_4.png";
        }
    }

}