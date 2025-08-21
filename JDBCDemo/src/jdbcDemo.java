import java.sql.*;          //step 1 - import package

public class jdbcDemo {
    public static void main(String[] args) throws Exception {


        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "aps2001";
//        String sql = "Select sname from student where sid = 1";
        String sql = "select * from student";

        //step 2 load and register driver      (Optional Step)
        Class.forName("org.postgresql.Driver");

        //step 3 create connection
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("connection ho gya");


        //step 4 create statement
        Statement st = con.createStatement();

        // step 5 execute statement
        ResultSet rs = st.executeQuery(sql);

//        rs.next();                               move pointer to first row
//        String name = rs.getString("sname");          and will print the name
//        System.out.println(name);
//
//        System.out.println(rs.next());    ture or false

        //to print the all data
        while(rs.next()){
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.println(rs.getInt(3) + " ");
        }

        //step 6 close connection
        con.close();


    }
}
