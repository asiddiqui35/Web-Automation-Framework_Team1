package dataDriven;

import base.CommonAPI;
import reporting.TestLogger;
import utility.DataReader;

import java.io.IOException;

public class ReadFiles extends CommonAPI {
    static DataReader dr = new DataReader();
    public String[] getDataFromExcelFile() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String path = System.getProperty("user.dir") + "/data/file.xls";
        String[] data = dr.fileReader2(path, 0);
        return data;
    }
}
