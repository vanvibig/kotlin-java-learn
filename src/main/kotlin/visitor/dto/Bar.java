package visitor.dto;

import visitor.Element;
import visitor.Visitor;

public class Bar implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return "Bar";
    }
}
