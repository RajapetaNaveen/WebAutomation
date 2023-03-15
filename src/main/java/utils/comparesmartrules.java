package utils;



import java.io.File;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;


public class comparesmartrules {


	public static void readpdf() throws Throwable {
	

		ArrayList<String> text_mismatch = new ArrayList<String>();

		try {
			PDDocument documentEx = null;
			PDDocument documentAc = null;
			documentAc= PDDocument.load(new File(System.getProperty("user.dir") +"/src/main/java/resources/smartrules.pdf"));
			documentEx = PDDocument.load(new File(System.getProperty("user.dir") +"/src/main/java/resources/smartrules2.pdf"));
			documentAc.getClass();
			documentEx.getClass();
			if (!documentAc.isEncrypted() && !documentEx.isEncrypted()) {
				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);
				PDFTextStripper Tstripper = new PDFTextStripper();
				String stActual = Tstripper.getText(documentAc);
				String stExpected = Tstripper.getText(documentEx);
				String[] LineBreak = stActual.split("\\r?\\n");

				for (int i = 0; i < LineBreak.length; i++) {
					if (LineBreak[i] != null) {
						String[] WordBreak = LineBreak[i].split(" ");
						for (int j = 0; j < WordBreak.length; j++) {
							if (!stExpected.contains(WordBreak[j])) {
								text_mismatch.add(WordBreak[j]);
								System.out.println("This Word is not available ==>" + WordBreak[j]);
							} else {
								/// System.out.println("This Word is available");
							}
						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
