import db.driver.*;

public class JDBC01 {
    public static void main(String[] args) {
        DBDriver driver = new MyOracleDriver();

        driver.getConnect();

        driver = new MyMySQLDriver();
    }
}
