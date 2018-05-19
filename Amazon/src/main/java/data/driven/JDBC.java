package data.driven;

import base.CommonAPI;
import database.ConnectDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class JDBC extends CommonAPI{
    ConnectDB connectDB = new ConnectDB();

    public List<String> readingfromSql() throws Exception {
        List<String> item = connectDB.readDataBase("searchItem", "item");
            return item;
        }
    }