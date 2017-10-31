package party.lovey.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {

    public static void main(String[] args) {
        Sourceable mySource1 = new MySource1();
        Sourceable mySource2 = new MySource2();

        Bridge bridge = new MyBridge();
        bridge.setSource(mySource1);
        bridge.method();

        bridge.setSource(mySource2);
        bridge.method();

    }


}
