package Learning_Design_Patterns.VisitorPattern;

import Learning_Design_Patterns.VisitorPattern.ConcreteElement.PdfDocument;
import Learning_Design_Patterns.VisitorPattern.ConcreteElement.PlainTextDocument;
import Learning_Design_Patterns.VisitorPattern.ConcreteElement.WordDocument;
import Learning_Design_Patterns.VisitorPattern.ConcreteVisitor.DocumentPrinter;
import Learning_Design_Patterns.VisitorPattern.Element.Document;
import Learning_Design_Patterns.VisitorPattern.Visitor.DocumentVisitor;

public class Client {

    public static void main(String[] args) {
        Document pdfDocument = new PdfDocument("Sample.pdf");
        Document wordDocument = new WordDocument("Sample.docx");
        Document plainTextDocument = new PlainTextDocument("Sample.txt");

        DocumentVisitor documentPrinter = new DocumentPrinter();

        pdfDocument.accept(documentPrinter); // Output: Printing PDF document: Sample.pdf
        wordDocument.accept(documentPrinter); // Output: Printing Word document: Sample.docx
        plainTextDocument.accept(documentPrinter); // Output: Printing Plain Text document: Sample.txt
    }
}
