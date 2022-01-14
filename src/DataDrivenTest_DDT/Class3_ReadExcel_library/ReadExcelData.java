package DataDrivenTest_DDT.Class3_ReadExcel_library;

public class ReadExcelData {
    public static void main(String[] args) throws Exception {
        ReadExcelFile readExcelFile = new ReadExcelFile("D:\\Software\\Book1.xlsx");
        readExcelFile.getData(1);
    }
}
