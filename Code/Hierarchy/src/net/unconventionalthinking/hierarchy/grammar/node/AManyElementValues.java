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
public final class AManyElementValues extends PElementValues
{
    private PElementValues _elementValues_;
    private TComma _comma_;
    private PElementValue _elementValue_;

    public AManyElementValues()
    {
        // Constructor
    }

    public AManyElementValues(
        @SuppressWarnings("hiding") PElementValues _elementValues_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PElementValue _elementValue_)
    {
        // Constructor
        setElementValues(_elementValues_);

        setComma(_comma_);

        setElementValue(_elementValue_);

    }

    @Override
    public Object clone()
    {
        return new AManyElementValues(
            cloneNode(this._elementValues_),
            cloneNode(this._comma_),
            cloneNode(this._elementValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAManyElementValues(this);
    }

    public PElementValues getElementValues()
    {
        return this._elementValues_;
    }

    public void setElementValues(PElementValues node)
    {
        if(this._elementValues_ != null)
        {
            this._elementValues_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementValues_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PElementValue getElementValue()
    {
        return this._elementValue_;
    }

    public void setElementValue(PElementValue node)
    {
        if(this._elementValue_ != null)
        {
            this._elementValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementValue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._elementValues_)
            + toString(this._comma_)
            + toString(this._elementValue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._elementValues_ == child)
        {
            this._elementValues_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._elementValue_ == child)
        {
            this._elementValue_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._elementValues_ == oldChild)
        {
            setElementValues((PElementValues) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._elementValue_ == oldChild)
        {
            setElementValue((PElementValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
