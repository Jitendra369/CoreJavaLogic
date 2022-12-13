package co.school;

import java.sql.*;

public class Data {
    public static void main(String[] args){
        System.out.println("This is connection ");
        makeConnection();
    }

    private static void makeConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");

            String query ="select * from SignUpUsers";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs =  statement.executeQuery();
            if (rs != null){
                while (rs.next()){
                    System.out.println(rs.getString(1));
                    System.out.println(rs.getString(2));
                    System.out.println(rs.getString(3));
                    System.out.println(rs.getString(4));

                }
                System.out.println("getting data");
            }else{
                System.out.println();
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
