import java.sql.*;
public class conn {
    public conn(){
        try{

            Class.forName(com.mysql.cj.jdbc.Driver);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
