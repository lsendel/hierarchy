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
public final class AWildcardUshrNoGt extends PWildcardUshrNoGt
{
    private TQmark _qmark_;
    private PWildcardBoundsUshrNoGt _wildcardBoundsUshrNoGt_;

    public AWildcardUshrNoGt()
    {
        // Constructor
    }

    public AWildcardUshrNoGt(
        @SuppressWarnings("hiding") TQmark _qmark_,
        @SuppressWarnings("hiding") PWildcardBoundsUshrNoGt _wildcardBoundsUshrNoGt_)
    {
        // Constructor
        setQmark(_qmark_);

        setWildcardBoundsUshrNoGt(_wildcardBoundsUshrNoGt_);

    }

    @Override
    public Object clone()
    {
        return new AWildcardUshrNoGt(
            cloneNode(this._qmark_),
            cloneNode(this._wildcardBoundsUshrNoGt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWildcardUshrNoGt(this);
    }

    public TQmark getQmark()
    {
        return this._qmark_;
    }

    public void setQmark(TQmark node)
    {
        if(this._qmark_ != null)
        {
            this._qmark_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._qmark_ = node;
    }

    public PWildcardBoundsUshrNoGt getWildcardBoundsUshrNoGt()
    {
        return this._wildcardBoundsUshrNoGt_;
    }

    public void setWildcardBoundsUshrNoGt(PWildcardBoundsUshrNoGt node)
    {
        if(this._wildcardBoundsUshrNoGt_ != null)
        {
            this._wildcardBoundsUshrNoGt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._wildcardBoundsUshrNoGt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._qmark_)
            + toString(this._wildcardBoundsUshrNoGt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._qmark_ == child)
        {
            this._qmark_ = null;
            return;
        }

        if(this._wildcardBoundsUshrNoGt_ == child)
        {
            this._wildcardBoundsUshrNoGt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._qmark_ == oldChild)
        {
            setQmark((TQmark) newChild);
            return;
        }

        if(this._wildcardBoundsUshrNoGt_ == oldChild)
        {
            setWildcardBoundsUshrNoGt((PWildcardBoundsUshrNoGt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
