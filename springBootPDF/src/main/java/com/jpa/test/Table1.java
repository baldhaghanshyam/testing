package com.jpa.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

//import com.itextpdf.text.log.LoggerFactory;
//import com.sun.org.slf4j.internal.Logger;

public class Table1 {

//	final static Logger log =(Logger) LoggerFactory.getLogger(Table1.class);
//	var textContent ="Sapiensplendide noluisse ... mollis verterem alia regione quidam.";
//	
//	String simplepdf = "D:\\areabreak.pdf";
//	WritterProperties wp=new WritterProperties();
//
//}
//
//	String dest = "D:\\areabreak.pdf";
//	PdfWriter writer = new PdfWriter();
//	
//	PdfDocument pdfDoc=new PdfDocument(writer);
//	pdfDoc.addNewPage("q");
//	Document document= new Document(pdfDoc);
//	document.add("ab");
//	document.close();
//	System.out.println("pdf created");
//

	public static ByteArrayInputStream createReport() throws DocumentException {
		String s = "path";
		Document document = new Document();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		PdfWriter.getInstance(document, out);
		document.open();
		document.close();
		return null;

	}

}
