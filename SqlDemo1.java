import java.sql.*;

public class SqlDemo1 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
           
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Sreeram@2004");
            // use the connection to execute SQL statements
           
            Statement stm=conn.createStatement();
           
            String sql="select * from student";
            ResultSet res=stm.executeQuery(sql);
            String columnLabel1="ID",columnLabel2="Name";
            while(res.next())
            {
                System.out.print(res.getString(columnLabel1));
                System.out.print(res.getString(columnLabel2));
                System.out.println(" ");
            }
           
    // Altering the table
     String sql1 = "ALTER TABLE student ADD COLUMN address VARCHAR(255)";
     stm.executeUpdate(sql1);
     
    // Execute a query to delete a column
         System.out.println("Deleting address column from table...");

         String sql2 = "ALTER TABLE STUDENT DROP COLUMN address";
         stm.executeUpdate(sql2);

         System.out.println("Column deleted from table...");
       
      // Prepare the SQL statement
        String sql3 = "INSERT INTO student (student_id,student_name)VALUES (?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql3);

        // Set the parameter values
        stmt.setInt(1, 9);
        stmt.setString(2,"Aanshu");
             


        // Execute the SQL statement
        int rows=stmt.executeUpdate();
        System.out.println(rows+ " row(s) inserted.");
       
       

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}