package dataDriven;

import base.CommonAPI;
import database.ConnectDB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;

public class JDBC extends CommonAPI {

    ConnectDB connectDB = new ConnectDB();
    public List<String> retriveMysqlTableDataAndSearch() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> topics = connectDB.readDataBase("SearchTopic", "topic");
        return topics;
    }
}

