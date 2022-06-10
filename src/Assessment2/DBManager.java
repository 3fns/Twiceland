/*
 * The programs are designed for PDC paper
 */
package Assessment2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public final class DBManager {

    private static final String USER_NAME = "once"; //your DB username
    private static final String PASSWORD = "ONCE"; //your DB password
    private static final String URL = "jdbc:derby:database/TwicelandDB;create=true";  //url of the DB host

    Connection conn;

    public DBManager() {
        establishConnection();
    }
    
    public Connection getConnection() {
        return this.conn;
    }

    //Establish connection
    public void establishConnection() {
        //Establish a connection to Database
        if (this.conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                Statement statement = conn.createStatement();

                String tableName = "characterTable";
            
                if(!checkTableExisting(tableName)) {
                    statement.executeUpdate("CREATE TABLE " +tableName+" (ID INT GENERATED ALWAYS AS IDENTITY, STATUS BOOLEAN DEFAULT true, NAME VARCHAR(255), LEVEL INT DEFAULT 1,"
                            + "TWICESTONES INT DEFAULT 1500, STRENGTH INT DEFAULT 15, VITALITY INT DEFAULT 100, INTELLIGENCE INT DEFAULT 15,"
                            + "HIGHESTSTAGE INT DEFAULT 1, ATTRIBUTESINCREASED INT DEFAULT 0)");
                }
                
                tableName = "monsterTable";
                
                if(!checkTableExisting(tableName)) {
                    statement.executeUpdate("CREATE TABLE " +tableName+" (MONSTERTYPE VARCHAR(255), MONSTEREXP INT, "
                            + "STRENGTH INT, VITALITY INT, INTELLIGENCE INT)");                    
                    statement.execute("INSERT INTO monsterTable VALUES ('Skeleton', 50, 6, 10, 10),"
                            + "('Undead', 75, 7, 15, 2),"
                            + "('Golem', 200, 12, 50, 4),"
                            + "('Vampire', 100, 15, 20, 27),"
                            + "('Slime', 25, 3, 10, 8)");
                    
                }

                statement.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }                        
    }

    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public ResultSet queryDB(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultSet;
    }

    public void updateDB(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private boolean checkTableExisting(String newTableName) {
        boolean flag = false;
        
        try {
            String[] types = {"TABLE"};
            DatabaseMetaData dbmd = conn.getMetaData();
            
            ResultSet rsDBMeta = dbmd.getTables(null, null, null, null);
            
            while (rsDBMeta.next()) {
                String tableName = rsDBMeta.getString("TABLE_NAME");
                
                if(tableName.compareToIgnoreCase(newTableName) == 0) {
                    flag = true;
                }
            }
            
            if(rsDBMeta != null) {
                rsDBMeta.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return flag;
    }

    public HashMap<String, Integer> getMonsterType(String monsterType, int level)
    {
        ResultSet rs = queryDB("Select * from monsterTable WHERE MONSTERTYPE = '" + monsterType + "'");        
        
       
        HashMap<String, Integer> monsterStats = new HashMap<String, Integer>();
        
        try {        
        while (rs.next()) {              
            monsterStats.put("Strength", rs.getInt("STRENGTH") + ((level - 1) * 2));
            monsterStats.put("Vitality", rs.getInt("VITALITY") + ((level - 1) * 2));
            monsterStats.put("Intelligence", rs.getInt("INTELLIGENCE") + ((level - 1) * 2));                      
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }   
        
        return monsterStats;
    }
}
