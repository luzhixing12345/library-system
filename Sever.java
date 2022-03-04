import org.postgresql.copy.CopyManager; 
import org.postgresql.core.BaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Sever {
    // 数据库连接路径
    private static final String driver = "org.postgresql.Driver";
    private static final  String url = "jdbc:postgresql://119.3.178.237:5432/postgres";
    //URL指向要访问的数据库名
    private static final  String user = "lzx";
    //MySQL配置时的用户名
    private static final String password = "07-hsluzx";
    //MySQL配置时的密码
    private static Connection con = null;
    // 静态代码块（将加载驱动、连接数据库放入静态块中）
    static{
        try {
            Class.forName(driver); // 加载驱动程序
            System.out.println("try to connect");
            con = DriverManager.getConnection(url, user, password); // 获取数据库的连接
            System.out.println("connection ok");
        }
        catch (SQLException ex) {
            while (ex != null) {
                ex = ex.getNextException();
            }
        }
        catch (Exception ce) {
            ce.printStackTrace();
        }
    }
    // 对外提供一个方法来获取数据库连接

    public static Connection getConnection(){
        return con;
    }
}
