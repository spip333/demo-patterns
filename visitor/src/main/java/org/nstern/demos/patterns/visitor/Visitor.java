package org.nstern.demos.patterns.visitor;

public interface Visitor {

    void visit(XmlElement xe);

    void visit(JsonElement je);
}
