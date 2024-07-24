package jdbc_connectivity;
import java.sql.*;



public class mysqlconnect {
    public static void main(String[] args) throws SQLException {
        //creating a connection
        Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root","root","H@llo123");
        Statement s1 = con.createStatement();
        String db = "use jdbcEmployee";
        String val="select * from EmployeeInfo;";
        s1.execute(db);
        ResultSet r1=s1.executeQuery(val);//storing the data in the resultset
        System.out.println("Emp ID\t"+"FName\t"+"LName\t"+"Age\t");
        while(r1.next()){
            int eid= r1.getInt("EmpID");
            String empfn = r1.getString("EmpFirstName");
            String empln = r1.getString("EmpLastName");
            int age= r1.getInt("EmpAge");

            System.out.println(eid+"\t"+empfn+"\t"+empln+"\t"+age+"\t");
        }
        con.close();
    }
}
