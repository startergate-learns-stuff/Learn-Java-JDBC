package db.driver;

public class MyMySQLDriver implements DBDriver {

    @Override
    public void getConnect() {
        System.out.println("Connecting to MySQL...");
    }

}
