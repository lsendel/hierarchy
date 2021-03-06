/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstractsystems.partita.metacode.grammar.node;

import com.abstractsystems.partita.metacode.grammar.analysis.*;

@SuppressWarnings("nls")
public final class ACodetagMctCodechunkOptions extends PMctCodechunkOptions
{
    private PMctCodetagOptions _mctCodetagOptions_;

    public ACodetagMctCodechunkOptions()
    {
        // Constructor
    }

    public ACodetagMctCodechunkOptions(
        @SuppressWarnings("hiding") PMctCodetagOptions _mctCodetagOptions_)
    {
        // Constructor
        setMctCodetagOptions(_mctCodetagOptions_);

    }

    @Override
    public Object clone()
    {
        return new ACodetagMctCodechunkOptions(
            cloneNode(this._mctCodetagOptions_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACodetagMctCodechunkOptions(this);
    }

    public PMctCodetagOptions getMctCodetagOptions()
    {
        return this._mctCodetagOptions_;
    }

    public void setMctCodetagOptions(PMctCodetagOptions node)
    {
        if(this._mctCodetagOptions_ != null)
        {
            this._mctCodetagOptions_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mctCodetagOptions_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._mctCodetagOptions_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._mctCodetagOptions_ == child)
        {
            this._mctCodetagOptions_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._mctCodetagOptions_ == oldChild)
        {
            setMctCodetagOptions((PMctCodetagOptions) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
