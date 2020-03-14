package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class WriteToExcel 
  {
	File file;
	String filepath="";
	FileOutputStream fos; // Write
	XSSFWorkbook xwb;
	XSSFSheet xsh;
	XSSFRow xrow;
	XSSFCell xcell;
	String data,sheetname = "WriteToExcel.xlsx";
	
  @Test
  public void f()
  {
	  xsh=xwb.createSheet("mydata");
	  xrow=xsh.createRow(0);
	  xcell=xrow.createCell(0);
	  xcell.setCellValue("My Cell");
  }
  @BeforeTest
  public void beforeTest() throws IOException 
  {
	  file = new File(filepath+"\\"+sheetname);
	  fos=new FileOutputStream(file);
	  xwb=new XSSFWorkbook();
  }

  @AfterTest
  public void afterTest() throws IOException 
  {
	  xwb.write(fos);
	  xwb.close();
	  fos.close();
	  System.out.println("Successfully Updated");
  }

}
