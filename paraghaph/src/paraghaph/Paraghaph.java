package paraghaph;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;

public class Paraghaph {
	public static void main(String[] args) throws FileNotFoundException {
		String path = "D:\\paragraph.pdf";
		PdfWriter writer = new PdfWriter(path);
		PdfDocument pdf = new PdfDocument(writer);
		Document doc = new Document(pdf);
//		String para2="Tutorials Point originated from the idea that there exists \r\n"
//				+ "      a class of readers who respond better to online content and prefer to learn \r\n"
//				+ "      new skills at their own pace from the comforts of their drawing rooms.";
//
//		String para1 = "Tutorials Point originated from the idea that there exists  a class of readers who respond better to online content and prefer to learn new skills at their own pace from the comforts of their drawing rooms.";
//		String para1="it's all are ttorial list";
//		Paragraph paragraph1=new Paragraph(para1);
//		List list=new List();
//		list.add("Java FX");
//		list.add("Java");
//		list.add("apache tool tika");
//		list.add("Java RMI");
//		
//		doc.add(paragraph1);
//		doc.add(list);

		float[] pointColumnWidths = { 150F, 150F, 150F,150f };
		Table table = new Table(pointColumnWidths);
		table.addCell(new Cell().add("name"));
		table.addCell(new Cell().add("Id"));
		table.addCell(new Cell().add("Designation"));
		table.addCell(new Cell().add("status"));
		table.addCell(new Cell().add("neeraj"));
		table.addCell(new Cell().add("1001"));
		table.addCell(new Cell().add("programmar"));
		table.addCell(new Cell().add("yas"));
		table.addCell(new Cell().add("x"));
		table.addCell(new Cell().add("y"));
		table.addCell(new Cell().add(""));
		table.addCell(new Cell().add("y"));
		doc.add(table);
		doc.close();
		System.out.println("done");
	}

}
