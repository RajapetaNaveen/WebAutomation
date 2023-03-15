package utils;
import java.io.File;

import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.apache.pdfbox.pdmodel.PDDocument;

public class PdfExtractLinebyLine {
public static void pdfComparision(int lineNumber) throws Exception {
        
        // Load the PDF file
        PDDocument Actualdocument = PDDocument.load(new File(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\smartrules.pdf"));
        PDDocument Expecteddocument = PDDocument.load(new File(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\smartrules2.pdf"));

        // Instantiate a PDFTextStripper object to extract the text
        PDFTextStripper pdfStripper = new PDFTextStripper();
        
        String ActualpageText = pdfStripper.getText(Actualdocument);
        String ExpectedpageText = pdfStripper.getText(Expecteddocument);
        String[] Actuallines = ActualpageText.split("\\r?\\n");
        String[] Expectedlines = ExpectedpageText.split("\\r?\\n");
        if(lineNumber <= Actuallines.length && lineNumber <= Expectedlines.length)
        {
        Assert.assertEquals(Actuallines[2].equalsIgnoreCase(Expectedlines[2]), true, "PDF Validation Failed"); 
        }
        else
        {
        	Assert.fail("Line number exceeded the content of the given PDF");
        }
	
    }
}





