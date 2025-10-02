import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {

    private static final string URL ="jdbc:mysql://127.0.0.1/sms_db";
    private static final string USER ="root";
    private static final string PASS ="";

    private DBConnection(){}

    public static Connection getConnection(){

        return DriverManager.getConnection(URL,USER,PASS);

    }


}