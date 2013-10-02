/* Copyright 2012, 2013 Unconventional Thinking
 *
 * This file is part of Hierarchy.
 *
 * Hierarchy is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License 
 * as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * Hierarchy is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied 
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Hierarchy.  
 * If not, see <http://www.gnu.org/licenses/>.
 */

/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.unconventionalthinking.hierarchy.grammar.node;

import net.unconventionalthinking.hierarchy.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AMpSymbolCreationWChildPluses extends PSymbolCreationWChildPluses
{
    private TDot _dot_;
    private TPlus _plus_;
    private PSymbolOptions _symbolOptions_;

    public AMpSymbolCreationWChildPluses()
    {
        // Constructor
    }

    public AMpSymbolCreationWChildPluses(
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") TPlus _plus_,
        @SuppressWarnings("hiding") PSymbolOptions _symbolOptions_)
    {
        // Constructor
        setDot(_dot_);

        setPlus(_plus_);

        setSymbolOptions(_symbolOptions_);

    }

    @Override
    public Object clone()
    {
        return new AMpSymbolCreationWChildPluses(
            cloneNode(this._dot_),
            cloneNode(this._plus_),
            cloneNode(this._symbolOptions_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMpSymbolCreationWChildPluses(this);
    }

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    public TPlus getPlus()
    {
        return this._plus_;
    }

    public void setPlus(TPlus node)
    {
        if(this._plus_ != null)
        {
            this._plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plus_ = node;
    }

    public PSymbolOptions getSymbolOptions()
    {
        return this._symbolOptions_;
    }

    public void setSymbolOptions(PSymbolOptions node)
    {
        if(this._symbolOptions_ != null)
        {
            this._symbolOptions_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._symbolOptions_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._dot_)
            + toString(this._plus_)
            + toString(this._symbolOptions_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._plus_ == child)
        {
            this._plus_ = null;
            return;
        }

        if(this._symbolOptions_ == child)
        {
            this._symbolOptions_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(this._symbolOptions_ == oldChild)
        {
            setSymbolOptions((PSymbolOptions) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}