/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AExprNegativoFator extends PFator
{
    private PExprNegativo _exprNegativo_;

    public AExprNegativoFator()
    {
        // Constructor
    }

    public AExprNegativoFator(
        @SuppressWarnings("hiding") PExprNegativo _exprNegativo_)
    {
        // Constructor
        setExprNegativo(_exprNegativo_);

    }

    @Override
    public Object clone()
    {
        return new AExprNegativoFator(
            cloneNode(this._exprNegativo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExprNegativoFator(this);
    }

    public PExprNegativo getExprNegativo()
    {
        return this._exprNegativo_;
    }

    public void setExprNegativo(PExprNegativo node)
    {
        if(this._exprNegativo_ != null)
        {
            this._exprNegativo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exprNegativo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exprNegativo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exprNegativo_ == child)
        {
            this._exprNegativo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exprNegativo_ == oldChild)
        {
            setExprNegativo((PExprNegativo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
