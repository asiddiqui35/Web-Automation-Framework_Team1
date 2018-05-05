package TestKeyWord;

import datadriven.JDBC;
import org.testng.annotations.Test;

public class TestJDBC extends JDBC {
    @Test
    public void chekConnetion() throws Exception {
        readingMysqlTable();
    }
}


