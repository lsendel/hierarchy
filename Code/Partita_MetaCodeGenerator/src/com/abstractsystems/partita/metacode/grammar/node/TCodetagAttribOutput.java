/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstractsystems.partita.metacode.grammar.node;

import com.abstractsystems.partita.metacode.grammar.analysis.*;

@SuppressWarnings("nls")
public final class TCodetagAttribOutput extends Token
{
    public TCodetagAttribOutput()
    {
        super.setText("@OUTPUT");
    }

    public TCodetagAttribOutput(int line, int pos)
    {
        super.setText("@OUTPUT");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCodetagAttribOutput(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCodetagAttribOutput(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCodetagAttribOutput text.");
    }
}