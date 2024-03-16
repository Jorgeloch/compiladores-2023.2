/* This file was generated by SableCC (http://www.sablecc.org/). */

package cida.node;

import cida.analysis.*;

@SuppressWarnings("nls")
public final class AAnswerTermo extends PTermo
{
    private PAnswer _answer_;

    public AAnswerTermo()
    {
        // Constructor
    }

    public AAnswerTermo(
        @SuppressWarnings("hiding") PAnswer _answer_)
    {
        // Constructor
        setAnswer(_answer_);

    }

    @Override
    public Object clone()
    {
        return new AAnswerTermo(
            cloneNode(this._answer_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAnswerTermo(this);
    }

    public PAnswer getAnswer()
    {
        return this._answer_;
    }

    public void setAnswer(PAnswer node)
    {
        if(this._answer_ != null)
        {
            this._answer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._answer_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._answer_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._answer_ == child)
        {
            this._answer_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._answer_ == oldChild)
        {
            setAnswer((PAnswer) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
