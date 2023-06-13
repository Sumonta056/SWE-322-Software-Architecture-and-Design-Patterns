package Learning_Design_Patterns.VisitorPattern.Visitor;

import Learning_Design_Patterns.VisitorPattern.ConcreteElement.PdfDocument;
import Learning_Design_Patterns.VisitorPattern.ConcreteElement.PlainTextDocument;
import Learning_Design_Patterns.VisitorPattern.ConcreteElement.WordDocument;

// Visitor interface
public interface DocumentVisitor {
    void visit(PdfDocument document);
    void visit(WordDocument document);
    void visit(PlainTextDocument document);
}

