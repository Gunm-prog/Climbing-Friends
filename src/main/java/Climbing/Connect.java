package Climbing;
import java.sql.*;

public class Connect {

    public static void main(String[] args) {

        try {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            System.out.println("Driver O.K.");

            String url="jdbc:mysql://localhost:3306/climbingfriends?serverTimezone=UTC" ;
            String user = "root" ;
            String password = "Mishka";

            Connection connection= DriverManager.getConnection(url, user,password );
            System.out.println("Connexion effective!");
            Statement statement = connection.createStatement();

           statement.execute( "insert into User (name, email,pseudo, mdp) values ()");//, ('Gabriel', 'Gab', '2435', '2020-07-01 12:05:03', '2020-07-03 13:07:31', '2020-07-05 04:01:25', '1', '59240', 'Dunkerque', 'Hauts de France')" );
            statement.executeQuery( "insert into User (name, email, pseudo, mdp ) values (name, email, pseudo, password)");
             ResultSet resultSet = statement.executeQuery( "select * from User" );

            while (resultSet.next()){
                System.out.println("id: "+ resultSet.getInt ("id"));
                System.out.println("name: "+resultSet.getString ("name"));
            }
            resultSet.close();
            statement.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
