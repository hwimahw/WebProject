package ru.nsd.islandcount;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataDao implements Dao<Data> {

    public List<Data> getData(int id) {
        Connection connection =  ConnectionFactory.getConnection();
        List<Data> dataList = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE id=" + id);
            while(rs.next())
            {
                Data data = new Data();
                data.setId( rs.getInt("id") );
                data.setN( rs.getInt("n") );
                data.setMatrix(rs.getString("matrix") );
                data.setResult(rs.getInt("result") );
                dataList.add(data);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
