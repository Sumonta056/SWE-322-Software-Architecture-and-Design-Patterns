package Learning_Design_Patterns.VisitorPattern.ConcreteElement;

import Learning_Design_Patterns.VisitorPattern.Visitor.DocumentVisitor;

import Learning_Design_Patterns.VisitorPattern.Element.Document;


// ConcreteElement
public class PdfDocument implements Document {
    private String title;

    public PdfDocument(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    // Other methods and attributes specific to PDF documents
}