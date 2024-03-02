/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class TTipoSymbol extends Token
{
    public TTipoSymbol()
    {
        super.setText("symbol");
    }

    public TTipoSymbol(int line, int pos)
    {
        super.setText("symbol");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTipoSymbol(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTipoSymbol(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTipoSymbol text.");
    }
}
