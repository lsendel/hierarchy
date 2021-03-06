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
public final class AMpBacktiksSymbolchildOptions extends PSymbolchildOptions
{
    private TDot _dot_;
    private TMpSymbolLiteralBacktiks _mpSymbolLiteralBacktiks_;

    public AMpBacktiksSymbolchildOptions()
    {
        // Constructor
    }

    public AMpBacktiksSymbolchildOptions(
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") TMpSymbolLiteralBacktiks _mpSymbolLiteralBacktiks_)
    {
        // Constructor
        setDot(_dot_);

        setMpSymbolLiteralBacktiks(_mpSymbolLiteralBacktiks_);

    }

    @Override
    public Object clone()
    {
        return new AMpBacktiksSymbolchildOptions(
            cloneNode(this._dot_),
            cloneNode(this._mpSymbolLiteralBacktiks_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMpBacktiksSymbolchildOptions(this);
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

    public TMpSymbolLiteralBacktiks getMpSymbolLiteralBacktiks()
    {
        return this._mpSymbolLiteralBacktiks_;
    }

    public void setMpSymbolLiteralBacktiks(TMpSymbolLiteralBacktiks node)
    {
        if(this._mpSymbolLiteralBacktiks_ != null)
        {
            this._mpSymbolLiteralBacktiks_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mpSymbolLiteralBacktiks_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._dot_)
            + toString(this._mpSymbolLiteralBacktiks_);
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

        if(this._mpSymbolLiteralBacktiks_ == child)
        {
            this._mpSymbolLiteralBacktiks_ = null;
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

        if(this._mpSymbolLiteralBacktiks_ == oldChild)
        {
            setMpSymbolLiteralBacktiks((TMpSymbolLiteralBacktiks) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
