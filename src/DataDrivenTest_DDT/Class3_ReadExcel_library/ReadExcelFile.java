package DataDrivenTest_DDT.Class3_ReadExcel_library;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFile {
    XSSFWorkbook workBook;;

    public ReadExcelFile(String filePath) {

        try{
            File src = new File(filePath);
            FileInputStream fis = new FileInputStream(src);
            workBook = new XSSFWorkbook(fis);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void getData(int sheetIndex) throws IOException {
        XSSFSheet excelSheet = workBook.getSheetAt(sheetIndex);
        int noOfRows = excelSheet.getLastRowNum();
        int noOfColumns = excelSheet.getRow(1).getLastCellNum();

        for (int r=0; r<noOfRows; r++){
            for (int c=0; c<noOfColumns; c++){
                XSSFCell cellValue = excelSheet.getRow(r).getCell(c);
                switch (cellValue.getCellType()){
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
