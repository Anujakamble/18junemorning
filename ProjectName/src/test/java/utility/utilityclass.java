package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import Base.Baseclass;

public class utilityclass extends Baseclass{
	//public static WebDriver driver;
public void ss() throws IOException, InterruptedException {
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Dest=new File("F:\\New folder\\Automation\\screenshotfolder\\H.jpg");
	FileHandler.copy(source, Dest);
	Thread.sleep(2000);
	driver.close();
    
}
public void excel() throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\USRE\\Documents\\WT1.xlsx");
			Workbook w=WorkbookFactory.create(file);
			Sheet s=w.getSheet("Sheet1");
			Row r=s.getRow(1);
			Cell c=r.getCell(1);
			String data=c.getStringCellValue();
			System.out.println(data);
			
}
}
