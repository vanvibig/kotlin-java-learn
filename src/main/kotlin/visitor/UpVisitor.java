package visitor;

import visitor.dto.Bar;
import visitor.dto.Baz;
import visitor.dto.Foo;

public class UpVisitor implements Visitor {

    @Override
    public void visit(Foo e) {
        print(e);
    }

    @Override
    public void visit(Bar e) {
        print(e);
    }

    @Override
    public void visit(Baz e) {
        print(e);
    }

    private void print(Element e) {
        System.out.println("Up " + e.getName());
    }
}
