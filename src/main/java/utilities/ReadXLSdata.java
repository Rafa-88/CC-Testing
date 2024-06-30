package utilities;

import org.apache.poi.ss.usermodel.*;
import org.jetbrains.annotations.NotNull;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

public class ReadXLSdata {

//    public static void main(String[] args) throws IOException {
//        ReadXLSdata read = new ReadXLSdata();
//        read.getData("login");
//    }

    @DataProvider(name ="xlsdemo")
    public String[][] getData(@NotNull Method m) throws IOException {

        String excelSheetName = m.getName();
        File f = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\TestData\\testdata.xlsx");
        FileInputStream fis = new FileInputStream(f);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheetName = wb.getSheet(excelSheetName);

        int totalRows = sheetName.getLastRowNum();
        System.out.println(totalRows);
        Row rowCells = sheetName.getRow(0);
        int totalCols = rowCells.getLastCellNum();
        System.out.println(totalCols);

        DataFormatter format = new DataFormatter();

        String[][] testData = new String[totalRows][totalCols];
        for(int i=1; i<=totalRows;i++) {
            for(int j=0; j<totalCols;j++) {
                testData[i-1][j]=format.formatCellValue(sheetName.getRow(i).getCell(j));
                System.out.println(testData[i-1][j]);
            }
        }
        return testData;
    }

}
