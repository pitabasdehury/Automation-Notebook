package DataDrivenTest_DDT;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Class4_DDT_Excel_DataProvider {

    @DataProvider(name = "excelDataProvider")
    public Object[][] getData() throws IOException {    // Making 2-D Object array
        File filePath = new File("D:\\Software\\Book1.xlsx");       // setting file path
        FileInputStream fis = new FileInputStream(filePath);                //  opening excel file
        XSSFWorkbook workbook = new XSSFWorkbook(fis);                      // Accessing workbook
        XSSFSheet sheet = workbook.getSheetAt(0);                     //    Accessing sheet
        int noOfRows = sheet.getLastRowNum();                               //  count no of rows
        int noOfColumns = sheet.getRow(0).getLastCellNum();         //  count no of columns

        Object[][] data = new Object[noOfRows][noOfColumns];
        for (int r=0; r<noOfRows; r++){
            for (int c=0; c<noOfColumns; c++){
                XSSFCell cell = sheet.getRow(r).getCell(c);             //  Access cell and store in cell object
                switch (cell.getCellType()){                            // checking cell data type
                    case STRING -> data[r][c] = cell.getStringCellValue();
                    case NUMERIC -> data[r][c] = cell.getNumericCellValue();
                    case BOOLEAN -> data[r][c] = cell.getBooleanCellValue();

                /*  Also allowed : case STRING -> System.out.print(cell.getStringCellValue());
                                   case NUMERIC -> System.out.print(cell.getNumericCellValue());
                                   case BOOLEAN -> System.out.print(cell.getBooleanCellValue());
                 */

                }
                System.out.print("  ");
            }
            System.out.println("");
        }
        return data;
    }

    @Test(dataProvider = "excelDataProvider")
    public void dataMatrix(String Name, String District, String email, String mobile){   // 1st sheet
        System.out.println(Name+"  "+District+"  "+email+"  "+mobile);
//    public void dataMatrix(String StudentName, String Class){             //  2nd sheet
//        System.out.println(StudentName+"  "+Class);
//    public void dataMatrix(String userName, String password, String browser){     // for 3rd excel sheet
//        System.out.println(userName+"  "+password+"  "+browser);

    }
}

