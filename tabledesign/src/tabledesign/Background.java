package tabledesign;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class Background {
	public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
		String path = "D:\\nested.pdf";
		PdfWriter write = new PdfWriter(path);
		PdfDocument pdf = new PdfDocument(write);
		Document document = new Document(pdf);
		float[] pointColumWidth = { 300f, 300f };
		Table table = new Table(pointColumWidth);

		Cell cell1 = new Cell();
		cell1.add("Tutorial List");
		cell1.setTextAlignment(TextAlignment.LEFT);
		table.addCell(cell1);

		List list1 = new List();
		ListItem item1 = new ListItem("JavaFx");
		ListItem item2 = new ListItem("Python");
		ListItem item3 = new ListItem("Mysql");
		list1.add(item1);
		list1.add(item2);
		list1.add(item3);

		Cell cell2 = new Cell();
		cell2.add(list1);
		cell1.setTextAlignment(TextAlignment.LEFT);
		table.addCell(cell2);

		Cell cell3=new Cell();
		cell3.add("Database");
		table.addCell(cell3);
		
		List list2=new List();
		ListItem item4 = new ListItem("Z  JavaFx");
		ListItem item5 = new ListItem("X  Python");
		ListItem item6 = new ListItem("Y  Mysql");
		list2.add(item4);
		list2.add(item5);
		list2.add(item6);
		
		Cell cell4=new Cell();
		cell4.add(list2);
		table.addCell(cell4);
		
		
		
		
		document.add(table);

		document.close();
		System.out.println("complate");

	}
}
