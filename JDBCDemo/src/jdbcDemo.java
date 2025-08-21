import java.sql.*;          //step 1 - import package

public class jdbcDemo {
    public static void main(String[] args) throws Exception {


        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "aps2001";
        String sql = "Select sname from student where sid = 1";

        //step 2 load and register driver      (Optional Step)
        Class.forName("org.postgresql.Driver");

        //step 3 create connection
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("connection ho gya");


        //step 4 create statement
        Statement st = con.createStatement();

        // step 5 execute statement
        ResultSet rs = st.executeQuery(sql);
        System.out.println(rs.next());

        //step 6 close connection
        con.close();


    }
}
