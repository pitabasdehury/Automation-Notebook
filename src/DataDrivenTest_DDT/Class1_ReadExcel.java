package DataDrivenTest_DDT;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;

public class Class1_ReadExcel {
    public static void main(String[] args) throws Exception {

        File filePath = new File("D:\\Software\\Book1.xlsx");   /*  Also allowed --> String filePath = "D:\\Software\\Book1.xlsx"
                                                                            * creating object of File class and giving parameter as path of the excel file
                                                                            * It specify the path where our excel sheet is located
                                                                         */
        FileInputStream fis = new FileInputStream(filePath);             // opening excel file
        XSSFWorkbook workBook = new XSSFWorkbook(fis);                  // load complete workbook of the excel file and storing in object reference
        XSSFSheet excelSheet = workBook.getSheetAt(0);             /*   HSSF instead of XSSF if you are dealing with .xls excel file
                                                                             * XSSFSheet excelSheet = workBook.getSheet("contact"); --> load excel sheet by sheet name
                                                                             * XSSFSheet excelSheet = workBook.getSheetAt(0); --> load first excel sheet by index
                                                                             * and then storing in object reference
                                                                         */
       // same with below : String cell1Value = excelSheet.getRow(0).getCell(0).getStringCellValue();
        XSSFRow row1 = excelSheet.getRow(0);                    //  Accessing first row
        XSSFCell cell1 = row1.getCell(0);                       //  Accessing first cell
        String cell1Value = cell1.getStringCellValue();                //   Getting value of cell1 as string type and storing it in a string variable
        System.out.print(cell1Value);                                //   printing first cell data
        System.out.print(" ");

        String cell2Value = excelSheet.getRow(0).getCell(1).getStringCellValue();   // Accessing value of 2nd cell
        System.out.print(cell2Value);
        System.out.print(" ");

        String cell3Value = excelSheet.getRow(0).getCell(2).getStringCellValue();   // Accessing value of 3rd cell
        System.out.println(cell3Value);

        workBook.close();                                           //  To close excel workbook. It is optional

    }
}
