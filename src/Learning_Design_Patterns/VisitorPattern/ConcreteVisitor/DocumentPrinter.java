package Learning_Design_Patterns.VisitorPattern.ConcreteVisitor;

import Learning_Design_Patterns.VisitorPattern.ConcreteElement.PdfDocument;
import Learning_Design_Patterns.VisitorPattern.ConcreteElement.PlainTextDocument;
import Learning_Design_Patterns.VisitorPattern.ConcreteElement.WordDocument;
import Learning_Design_Patterns.VisitorPattern.Visitor.DocumentVisitor;

// ConcreteVisitor
public class DocumentPrinter implements DocumentVisitor {
    @Override
    public void visit(PdfDocument document) {
        System.out.println("Printing PDF document: " + document.getTitle());
        // Print PDF-specific details
    }

    @Override
    public void visit(WordDocument document) {
        System.out.println("Printing Word document: " + document.getTitle());
        // Print Word-specific details
    }

    @Override
    public void visit(PlainTextDocument document) {
        System.out.println("Printing Plain Text document: " + document.getTitle());
        // Print Plain Text-specific details
    }
}