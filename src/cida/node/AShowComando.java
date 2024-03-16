/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import java.util.*;
import cida.analysis.*;

@SuppressWarnings("nls")
public final class AShowComando extends PComando
{
    private TShow _show_;
    private TParenteseE _parenteseE_;
    private final LinkedList<PExprVirgula> _exprVirgula_ = new LinkedList<PExprVirgula>();
    private PExpr _expr_;
    private TParenteseD _parenteseD_;
    private TPonto _ponto_;

    public AShowComando()
    {
        // Constructor
    }

    public AShowComando(
        @SuppressWarnings("hiding") TShow _show_,
        @SuppressWarnings("hiding") TParenteseE _parenteseE_,
        @SuppressWarnings("hiding") List<?> _exprVirgula_,
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TParenteseD _parenteseD_,
        @SuppressWarnings("hiding") TPonto _ponto_)
    {
        // Constructor
        setShow(_show_);

        setParenteseE(_parenteseE_);

        setExprVirgula(_exprVirgula_);

        setExpr(_expr_);

        setParenteseD(_parenteseD_);

        setPonto(_ponto_);

    }

    @Override
    public Object clone()
    {
        return new AShowComando(
            cloneNode(this._show_),
            cloneNode(this._parenteseE_),
            cloneList(this._exprVirgula_),
            cloneNode(this._expr_),
            cloneNode(this._parenteseD_),
            cloneNode(this._ponto_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAShowComando(this);
    }

    public TShow getShow()
    {
        return this._show_;
    }

    public void setShow(TShow node)
    {
        if(this._show_ != null)
        {
            this._show_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._show_ = node;
    }

    public TParenteseE getParenteseE()
    {
        return this._parenteseE_;
    }

    public void setParenteseE(TParenteseE node)
    {
        if(this._parenteseE_ != null)
        {
            this._parenteseE_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenteseE_ = node;
    }

    public LinkedList<PExprVirgula> getExprVirgula()
    {
        return this._exprVirgula_;
    }

    public void setExprVirgula(List<?> list)
    {
        for(PExprVirgula e : this._exprVirgula_)
        {
            e.parent(null);
        }
        this._exprVirgula_.clear();

        for(Object obj_e : list)
        {
            PExprVirgula e = (PExprVirgula) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._exprVirgula_.add(e);
        }
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public TParenteseD getParenteseD()
    {
        return this._parenteseD_;
    }

    public void setParenteseD(TParenteseD node)
    {
        if(this._parenteseD_ != null)
        {
            this._parenteseD_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenteseD_ = node;
    }

    public TPonto getPonto()
    {
        return this._ponto_;
    }

    public void setPonto(TPonto node)
    {
        if(this._ponto_ != null)
        {
            this._ponto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ponto_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._show_)
            + toString(this._parenteseE_)
            + toString(this._exprVirgula_)
            + toString(this._expr_)
            + toString(this._parenteseD_)
            + toString(this._ponto_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._show_ == child)
        {
            this._show_ = null;
            return;
        }

        if(this._parenteseE_ == child)
        {
            this._parenteseE_ = null;
            return;
        }

        if(this._exprVirgula_.remove(child))
        {
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._parenteseD_ == child)
        {
            this._parenteseD_ = null;
            return;
        }

        if(this._ponto_ == child)
        {
            this._ponto_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._show_ == oldChild)
        {
            setShow((TShow) newChild);
            return;
        }

        if(this._parenteseE_ == oldChild)
        {
            setParenteseE((TParenteseE) newChild);
            return;
        }

        for(ListIterator<PExprVirgula> i = this._exprVirgula_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExprVirgula) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._parenteseD_ == oldChild)
        {
            setParenteseD((TParenteseD) newChild);
            return;
        }

        if(this._ponto_ == oldChild)
        {
            setPonto((TPonto) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
