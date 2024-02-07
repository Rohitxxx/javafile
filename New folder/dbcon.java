import java.sql.*;
public class dbcon{
    public static void main(String args[]){
        //loading the driver class
        try{
        Class.forName("com.mysql.jdbc.Driver");
        //creating connection object
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/osmlaptop","root","password");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from customer");
        while(rs.next()){
            System.out.println(rs.getString("name"));
        }
    // }catch(Exception e){
    //     System.out.println(e);
    // }
    }catch(ClassNotFoundException e){
        System.out.println(e);
    }
    catch(SQLException e){
        System.out.println(e);
    }
    finally{
        System.out.println("program  continues...");
    }
    }
}