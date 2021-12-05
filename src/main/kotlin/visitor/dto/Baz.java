package visitor.dto;

import visitor.Element;
import visitor.Visitor;

public class Baz implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return "Baz";
    }
}
