package com.automation.tests.day25_excel_io;

import com.automation.utilities.ExcelUtil;
import org.apache.poi.ss.usermodel.*;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Map;

public class ReadDataFromExcel {

    @Test
    public void readExcelFileTest()throws Exception{
File file=new File("VytrackTestUsers.xlsx");
        //we need to get a file as an object
        Workbook workbook= WorkbookFactory.create(file);
        //object that represents exel file
        Sheet workSheet=workbook.getSheet("QA1-short");
        //get 1st row
        Row firstRow=workSheet.getRow(0);
        //get 1st cell
        Cell firstCell=firstRow.getCell(0);
        //get string value
        String value=firstCell.getStringCellValue();
        String secondCellValue=firstRow.getCell(1).getStringCellValue();
        String thirdCellValue=firstRow.getCell(2).getStringCellValue();

        System.out.println(value);
        System.out.println(secondCellValue);
        System.out.println(thirdCellValue);
        System.out.println("===================");

        //get number of cell in the firstRow
        int lastCell=firstRow.getLastCellNum();
        for (int i=0; i<lastCell;i++){
            System.out.print(firstRow.getCell(i)+" | ");
        }
        System.out.println();
        //last row is 16th! ==>index is 15
        //index of last row==>15
        int numberOfRows=workSheet.getLastRowNum();
        //returns how many rows at all
        int numberOfRows2=workSheet.getPhysicalNumberOfRows();

        System.out.println("index Of last Row : "+numberOfRows);
        System.out.println("Physical NumberOf Rows: "+numberOfRows2);

        System.out.println("==== Print whole spread sheet=====");

        for (int row=0; row<workSheet.getPhysicalNumberOfRows(); row++){
            for (int cell=0; cell<workSheet.getRow(row).getLastCellNum(); cell++){

                String cellValue= workSheet.getRow(row).getCell(cell).getStringCellValue();
                System.out.print(cellValue+" | ");
            }
            System.out.println();

        }



    }

    @Test
    public void excelUtilityTest() {
        String path = "VytrackTestUsers.xlsx";
        String spreadSheet = "QA1-all";
        ExcelUtil excelUtil = new ExcelUtil(path, spreadSheet);
        //https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
//        excelUtil.getDataList().forEach(System.out::println);

        for (Map<String, String> record : excelUtil.getDataList()) {
            System.out.println(record);
        }
    }

    @Test
    public void getColumnNamesTest() {
        String path = "VytrackTestUsers.xlsx";
        String spreadSheet = "QA1-short";
        ExcelUtil excelUtil = new ExcelUtil(path, spreadSheet);

        System.out.println(excelUtil.getColumnsNames());
    }
}