package Learning_Design_Patterns.VisitorPattern.Element;

import Learning_Design_Patterns.VisitorPattern.Visitor.DocumentVisitor;

// Element interface
public interface Document {
    void accept(DocumentVisitor visitor);
}
