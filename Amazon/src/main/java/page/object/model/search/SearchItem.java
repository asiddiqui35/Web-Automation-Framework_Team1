package page.object.model.search;

import base.CommonAPI;
import utility.DataReade;

import java.io.IOException;

public class SearchItem extends CommonAPI{

    DataReader dr = new DataReader();
    public String[] getDataFromFile() throws IOException {
        String path = System.getProperty("user.dir")+"data/file.exls";
        String [] data = dr.fileReader(path)
        return data;
    }

    public String[] getDataFromExcelFile() throws IOException{
        String path = System.getProperty("user.dir")+"data/file1.xls";
        String [] data = dr.fileReader(path);
        return data;
    }
}
