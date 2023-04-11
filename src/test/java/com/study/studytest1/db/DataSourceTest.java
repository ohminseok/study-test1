package com.study.studytest1.db;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.assertj.core.api.Fail.fail;

public class DataSourceTest {

    static {
        try {
            Class.forName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection() {

        try(Connection con =
                    DriverManager.getConnection(
                            "jdbc:log4jdbc:mariadb://localhost:3306/test?autoReconnect=true",
                            "test2",
                            "test19930702")){
            System.out.println(con);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }
}
