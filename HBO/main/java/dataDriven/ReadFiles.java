package dataDriven;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class ReadFiles extends CommonAPI {
    static DataReader dr = new DataReader();
    public static String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir") + "/data/file.xls";
        String[] data = dr.fileReader2(path, 0);
        return data;
    }
}
