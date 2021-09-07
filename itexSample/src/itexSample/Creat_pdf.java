package itexSample;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;

public class Creat_pdf {
	public static void main(String[] args) throws FileNotFoundException{

		String dest = "D:\\areabreak.pdf";
		PdfWriter writer = new PdfWriter(dest);
		
		PdfDocument pdfDoc=new PdfDocument(writer);
		pdfDoc.addNewPage();
		Document document= new Document(pdfDoc);
		AreaBreak ab=new  AreaBreak();
		document.add(ab);
		document.close();
		System.out.println("pdf created");
		
	}
}
