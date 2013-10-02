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
public final class AEnumBody extends PEnumBody
{
    private TLBrc _lBrc_;
    private PEnumConstants _enumConstants_;
    private TComma _comma_;
    private PEnumBodyDeclarations _enumBodyDeclarations_;
    private TRBrc _rBrc_;

    public AEnumBody()
    {
        // Constructor
    }

    public AEnumBody(
        @SuppressWarnings("hiding") TLBrc _lBrc_,
        @SuppressWarnings("hiding") PEnumConstants _enumConstants_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PEnumBodyDeclarations _enumBodyDeclarations_,
        @SuppressWarnings("hiding") TRBrc _rBrc_)
    {
        // Constructor
        setLBrc(_lBrc_);

        setEnumConstants(_enumConstants_);

        setComma(_comma_);

        setEnumBodyDeclarations(_enumBodyDeclarations_);

        setRBrc(_rBrc_);

    }

    @Override
    public Object clone()
    {
        return new AEnumBody(
            cloneNode(this._lBrc_),
            cloneNode(this._enumConstants_),
            cloneNode(this._comma_),
            cloneNode(this._enumBodyDeclarations_),
            cloneNode(this._rBrc_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnumBody(this);
    }

    public TLBrc getLBrc()
    {
        return this._lBrc_;
    }

    public void setLBrc(TLBrc node)
    {
        if(this._lBrc_ != null)
        {
            this._lBrc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBrc_ = node;
    }

    public PEnumConstants getEnumConstants()
    {
        return this._enumConstants_;
    }

    public void setEnumConstants(PEnumConstants node)
    {
        if(this._enumConstants_ != null)
        {
            this._enumConstants_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enumConstants_ = node;
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

    public PEnumBodyDeclarations getEnumBodyDeclarations()
    {
        return this._enumBodyDeclarations_;
    }

    public void setEnumBodyDeclarations(PEnumBodyDeclarations node)
    {
        if(this._enumBodyDeclarations_ != null)
        {
            this._enumBodyDeclarations_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enumBodyDeclarations_ = node;
    }

    public TRBrc getRBrc()
    {
        return this._rBrc_;
    }

    public void setRBrc(TRBrc node)
    {
        if(this._rBrc_ != null)
        {
            this._rBrc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBrc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lBrc_)
            + toString(this._enumConstants_)
            + toString(this._comma_)
            + toString(this._enumBodyDeclarations_)
            + toString(this._rBrc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lBrc_ == child)
        {
            this._lBrc_ = null;
            return;
        }

        if(this._enumConstants_ == child)
        {
            this._enumConstants_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._enumBodyDeclarations_ == child)
        {
            this._enumBodyDeclarations_ = null;
            return;
        }

        if(this._rBrc_ == child)
        {
            this._rBrc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lBrc_ == oldChild)
        {
            setLBrc((TLBrc) newChild);
            return;
        }

        if(this._enumConstants_ == oldChild)
        {
            setEnumConstants((PEnumConstants) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._enumBodyDeclarations_ == oldChild)
        {
            setEnumBodyDeclarations((PEnumBodyDeclarations) newChild);
            return;
        }

        if(this._rBrc_ == oldChild)
        {
            setRBrc((TRBrc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}