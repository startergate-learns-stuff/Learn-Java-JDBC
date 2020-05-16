package db.driver;

public class MyOracleDriver implements DBDriver {

    @Override
    public void getConnect() {
        System.out.println("Connecting to Oracle...");
    }
}
