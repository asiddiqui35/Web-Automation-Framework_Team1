package keyWordDriven;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class ExcelFile extends CommonAPI{
        DataReader dr = new DataReader();
        public String[] getDataFromExcelFile() throws IOException {
            String path = System.getProperty("user.dir")+"data/file1.xls";
            String [] data = dr.fileReader2(path,0);
            return data;
        }

        public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
            String path = System.getProperty("user.dir")+"data/file1.xls";
            String [] data = dr.fileReader2(path,0);
            return data;
        }
    }
