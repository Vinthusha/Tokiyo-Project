package com.test.qa.testdata;

import utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class PlantData extends ExcelDataConfig {

    private static final Logger LOGGER = Logger.getLogger(PlantData.class);

    public PlantData() {
        super("src\\test\\resources\\ExcelSheet\\plantdetails.xlsx");
    }
    @DataProvider (name = "plantdataprovider")
    public Object[][] plantdataprovider() {

        int rows = getRowCount("plantdata");
        int col = getColumnCount("plantdata");


        LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("plantdata", i, j);
            }
        }
        return data;
    }

}
