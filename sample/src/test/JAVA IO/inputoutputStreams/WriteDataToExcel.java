package inputoutputStreams;
import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
  
	public class WriteDataToExcel {

		// any exceptions need to be caught
		public static void main(String[] args) throws Exception
		{
			// workbook object
			XSSFWorkbook workbook = new XSSFWorkbook();

			// spreadsheet object
			XSSFSheet spreadsheet
				= workbook.createSheet(" Student Data ");

			// creating a row object
			XSSFRow row;

			// This data needs to be written (Object[])
			Map<String, Object[]> studentinfo
				= new TreeMap<String, Object[]>();

			studentinfo.put(
				"1",
				new Object[] { "Roll No", "NAME", "Year" });

			studentinfo.put("2", new Object[] { "128", "Venkat",
												"4th year" });

			studentinfo.put(
				"3",
				new Object[] { "129", "ACE", "4th year" });

			studentinfo.put("4", new Object[] { "130", "Rakesh",
												"4th year" });

			studentinfo.put("5", new Object[] { "131", "Roshan",
												"4th year" });

			studentinfo.put("6", new Object[] { "132", "Gopi",
												"4th year" });

			Set<String> keyid = studentinfo.keySet();

			int rowid = 0;

			// writing the data into the sheets...

			for (String key : keyid) {

				row = spreadsheet.createRow(rowid++);
				Object[] objectArr = studentinfo.get(key);
				int cellid = 0;

				for (Object obj : objectArr) {
					Cell cell = row.createCell(cellid++);
					cell.setCellValue((String)obj);
				}
			}

			// .xlsx is the format for Excel Sheets...
			// writing the workbook into the file...
			FileOutputStream out = new FileOutputStream(
				new File("C:/savedexcel/GFGsheet.xlsx"));

			workbook.write(out);
			out.close();
		}
	}


