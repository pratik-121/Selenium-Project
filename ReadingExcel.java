package TestNG;

import org.testng.annotations.Test;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ReadingExcel {
	
	File file;
	FileInputStream fis;
	String filepath="Z:\\Read_Excel.xlsx";
	
	XSSFWorkbook xwb;
	XSSFSheet xsh;
	XSSFRow xr;
	XSSFCell xc;
	
	int rCount, cCount, row, cell;
	//String For Sheet name;
	
	String data;
	
  @Test
  public void f() 
  {
	  rCount = xsh.getPhysicalNumberOfRows(); //4
	  cCount = xsh.getRow(0).getPhysicalNumberOfCells(); //3
	  
	  for(row=0;row<rCount;row++)
	  {
		  xr=xsh.getRow(row); //Row
		  System.out.println("\n");
		  
		  for (cell=0;cell<cCount;cell++)
		  {
			  xc=xr.getCell(cell);
			  data=xc.getStringCellValue();
			  System.out.println(""+data);
		  }
	  }
  }
@BeforeTest
  public void beforeTest() throws IOException 
  {
	  file=new File(filepath);
	  fis=new FileInputStream(file); // Read Mode
	  xwb=new XSSFWorkbook(fis); // 0
	  xsh = xwb.getSheetAt(0);
  }

  @AfterTest
  public void afterTest() throws IOException 
  {
	  System.out.println("\n Read And Printed Successfully \n");
	  fis.close();
	  xwb.close();
  }

}
