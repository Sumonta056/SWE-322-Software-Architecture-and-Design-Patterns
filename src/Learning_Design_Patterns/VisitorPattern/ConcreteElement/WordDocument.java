package Learning_Design_Patterns.VisitorPattern.ConcreteElement;

import Learning_Design_Patterns.VisitorPattern.Element.Document;
import Learning_Design_Patterns.VisitorPattern.Visitor.DocumentVisitor;

// ConcreteElement
public class WordDocument implements Document {
    private String title;

    public WordDocument(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    // Other methods and attributes specific to Word documents
}
