package visitor;

import visitor.dto.Bar;
import visitor.dto.Baz;
import visitor.dto.Foo;

public interface Visitor {
    void visit(Foo e);
    void visit(Bar e);
    void visit(Baz e);
}
