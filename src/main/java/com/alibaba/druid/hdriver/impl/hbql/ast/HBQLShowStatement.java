package com.alibaba.druid.hdriver.impl.hbql.ast;

import com.alibaba.druid.hdriver.impl.hbql.visitor.HBQLVisitor;

public class HBQLShowStatement extends HBQLStatementImpl {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public void accept0(HBQLVisitor visitor) {
        visitor.visit(this);
        visitor.endVisit(this);
    }
}
