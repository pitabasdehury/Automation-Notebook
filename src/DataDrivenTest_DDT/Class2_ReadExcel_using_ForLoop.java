package DataDrivenTest_DDT;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class Class2_ReadExcel_using_ForLoop {
    public static void main(String[] args) throws Exception {

        File filePath = new File("D:\\Software\\Book1.xlsx");
        FileInputStream fis = new FileInputStream(filePath);
        XSSFWorkbook workBook = new XSSFWorkbook(fis);
        XSSFSheet excelSheet = workBook.getSheetAt(0);

        int noOfRows = excelSheet.getLastRowNum();      //  count last row number
        int noOfColumns = excelSheet.getRow(1).getLastCellNum();        /* - .getRow(1) : Accessing 1st row
                                                                                   - .getLastCellNum()     : count no of columns
                                                                                   and storing in variable
                                                                                */


        for (int r=0; r<noOfRows; r++){
            for (int c=0; c<noOfColumns; c++){
                XSSFCell cellValue = excelSheet.getRow(r).getCell(c);       // .getCell(1) : Accessing first cell data
                switch (cellValue.getCellType()){                           // .getCellType() : returns data type of cell data
                    case STRING: System.out.print(cellValue.getStringCellValue()); break;
                    case NUMERIC: System.out.print(cellValue.getNumericCellValue()); break;
                    case BOOLEAN: System.out.print(cellValue.getBooleanCellValue()); break;
                }
                System.out.print("  ");
            }
            System.out.println("");
        }
        workBook.close();
    }
}
