import java.io.*;
import java.util.*;
import java.sql.*;

class DB
{
    static String name="";
    static String password="";
    static String branch="";
    static String id="";
    static String phno="";
    static String email="";
    static String year="";
    static String semester="";

    DB()
    {
        DB.name = "";
        DB.password = "";
        DB.branch = "";
        DB.id = "";
        DB.phno = "";
        DB.email = "";
        DB.year = "";
        DB.semester = "";

    }



    public static void main(String args[])
    {  
        new DB();
    }  

    public static void check_user(String eid, String epassword)
    {
        new DB();
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info","root","password");    
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from data WHERE id ='"+eid+"' and password = '"+epassword+"'"); 

            while(rs.next())
            {
                //System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3));
                DB.id = rs.getString(1);
                DB.password = rs.getString(2);
                DB.phno = rs.getString(3);
                DB.getdetails();
            }
            con.close(); 
           
                
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }

    }

    public static void getdetails()
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","password");    
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from student WHERE id='"+DB.id+"'"); 
             
            while(rs.next())
            {
                //System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
                DB.name = rs.getString(2);
                DB.email = rs.getString(3);
                DB.branch = rs.getString(4);
                DB.semester = rs.getString(5);

            }
            con.close(); 
           
                
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }

        if(DB.semester=="1"||DB.semester=="2")
        {
            DB.year = "1";
        }
        else if(DB.semester=="3"||DB.semester=="4")
        {
            DB.year = "2";
        }
        else if(DB.semester=="5"||DB.semester=="6")
        {
            DB.year = "3";
        }
        else 
        {
            DB.year = "4";
        }

    }

    public static void setdetails(String name , String password , String branch , String id , String phno , String email , String currentyear , String currentsem)
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info","root","password");    
            Statement stmt=con.createStatement();  
            String query = " insert into data (id, password, phone)"+" values ('"+id+"','"+password+"','"+phno+"')" ;

            stmt.executeUpdate(query);
             
            con.close(); 
           
                
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }

        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","password");    
            Statement stmt=con.createStatement();  
            String sem="";
            if(currentyear=="1"&&currentsem=="1")
            {
                sem = "1";
            }
            else if(currentyear=="1"&&currentsem=="2")
            {
                sem = "2";
            }
            else if(currentyear=="2"&&currentsem=="1")
            {
                sem = "3";
            }
            else if(currentyear=="2"&&currentsem=="2")
            {
                sem = "4";
            }
            else if(currentyear=="3"&&currentsem=="1")
            {
                sem = "5";
            }
            else if(currentyear=="3"&&currentsem=="2")
            {
                sem = "6";
            }
            else if(currentyear=="4"&&currentsem=="1")
            {
                sem = "7";
            }
            else if(currentyear=="4"&&currentsem=="2")
            {
                sem = "8";
            }

            if(branch.equals("CSE"))
            {
                branch = "COMPUTER_SCIENCE";
            }
            else if(branch.equals("EEE"))
            {
                branch = "ELECTRICAL";
            }
            else if(branch.equals("Mech"))
            {
                branch = "MECHANICAL";
            }
            else if(branch.equals("Civil"))
            {
                branch = "CIVIL";
            }

            String query = " insert into student (id, name, email,branch,semester)"+" values ('"+id+"','"+name+"','"+email+"','"+branch+"','5')" ;

            stmt.executeUpdate(query);
             
            con.close(); 
           
                
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }

        new Flogin();

    }

    public static void checkexist(String id,String phno)
    {
        new DB();

        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info","root","password");    
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from data WHERE id ='"+id+"' and phone = '"+phno+"'"); 

            while(rs.next())
            {
                //System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3));
                DB.id = rs.getString(1);
                DB.password = rs.getString(2);
                DB.phno = rs.getString(3);
            }
            con.close(); 
           
                
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }

    }

    public static void changepass(String id,String password)
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info","root","password");    
            Statement stmt=con.createStatement();  
            String query = " UPDATE data set password ='"+password+"' WHERE id ='"+id+"'" ;

            stmt.executeUpdate(query);
             
            con.close(); 
           
                
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        } 
    }

    public static void getAttendance(char sem)
    {
        if(Character.getNumericValue(sem)>5)
        {
            Dbstudent.flag = 1;
            Dbstudent.attendance="";
        }
        else
        {
            try 
            {
                Class.forName("com.mysql.cj.jdbc.Driver");  
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","password");    
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery("select * from attendance WHERE id='"+DB.id+"'"); 
                Dbstudent.flag=0;
                while(rs.next())
                {
                    //System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
                    Dbstudent.attendance = rs.getString(Character.getNumericValue(sem)+1);
                    //System.out.println(Dbstudent.attendance);

                }
                con.close(); 
            
                    
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }

        }
        
    }

    public static void getMarks(char sem)
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","password");    
            Statement stmt=con.createStatement(); 
            String q =""; 
            String s = Character.toString(sem);
            if(Integer.parseInt(s)>=Integer.parseInt(DB.semester))
            {
                Dbstudent.flag=1;
                for(int i=0;i<=FmarkS.last+1;i++)
                {
                    FmarkS.Tdata[i][0]="";
                    FmarkS.Tdata[i][1]="";
                }
                FmarkS.last=0;
            }
            else
            {
                Dbstudent.flag=0;
            }
            if(DB.branch.equals("CIVIL"))
            {
                q = "ce";
            }
            else if(DB.branch.equals("ELECTRICAL"))
            {
                q = "ee";
            }
            else if(DB.branch.equals("MECHANICAL"))
            {
                q = "me";
            }
            else if(DB.branch.equals("COMPUTER_SCIENCE"))
            {
                q = "cs";
            }
            if(Dbstudent.flag==0)
            {
                //System.out.println("entered\n");
                String query =  "Select * from "+q+"_"+sem+" where id ='"+DB.id+"';";
                //System.out.println(query);
                ResultSet rs=stmt.executeQuery(query); 

                ResultSetMetaData metadata = rs.getMetaData();
                int columnCount = metadata.getColumnCount();
                while(rs.next())
                {

                    int i=0;

                    for(i=2;i<=columnCount;i++)
                    {
                        //System.out.print(rs.getString(i)+" ");
                        String columnName = metadata.getColumnName(i);
                        //System.out.println(columnName+" "+rs.getString(i)+" ");

                        FmarkS.Tdata[i-2][0] = columnName;
                        FmarkS.Tdata[i-2][1] = rs.getString(i);
                        FmarkS.last = i-2;
                    }

                    for(i=FmarkS.last+1;i<=9;i++)
                    {
                        FmarkS.Tdata[i][0]="";
                        FmarkS.Tdata[i][1]="";
                    }
                }
             
            }

            con.close(); 
        }
        catch (Exception e) 
        {
            System.out.println(e);
        } 
           

    }

    public static void getcc(char sem)
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","password");    
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from course_content WHERE branch='"+DB.branch+"'"); 
            while(rs.next())
            {

                Dbstudent.cc = rs.getString(Character.getNumericValue(sem)+1);
                
            }
            con.close(); 
            
                    
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }


} 



