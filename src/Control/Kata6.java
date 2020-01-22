
package Control;

import Model.DataBase;
import Model.Histogram;
import View.DataBaseHistogramBuilder;
import View.HistogramDisplay;
import java.util.HashMap;

public class Kata6 {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\Users\\nesto\\Desktop\\NetBeansProjects\\Kata6-master\\Sqlite\\kata6.db";
        DataBase database = new DataBase(url);
        database.open();
        database.select();
        HashMap<String,String> dataBaseMap = database.components;
        Histogram histogram = DataBaseHistogramBuilder.build(dataBaseMap);
        HistogramDisplay histogramdisplay = new HistogramDisplay(histogram);
        histogramdisplay.execute();
        database.close();
    }
}

