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
public final class AWildcard extends PWildcard
{
    private TQmark _qmark_;
    private PWildcardBounds _wildcardBounds_;

    public AWildcard()
    {
        // Constructor
    }

    public AWildcard(
        @SuppressWarnings("hiding") TQmark _qmark_,
        @SuppressWarnings("hiding") PWildcardBounds _wildcardBounds_)
    {
        // Constructor
        setQmark(_qmark_);

        setWildcardBounds(_wildcardBounds_);

    }

    @Override
    public Object clone()
    {
        return new AWildcard(
            cloneNode(this._qmark_),
            cloneNode(this._wildcardBounds_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWildcard(this);
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

    public PWildcardBounds getWildcardBounds()
    {
        return this._wildcardBounds_;
    }

    public void setWildcardBounds(PWildcardBounds node)
    {
        if(this._wildcardBounds_ != null)
        {
            this._wildcardBounds_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._wildcardBounds_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._qmark_)
            + toString(this._wildcardBounds_);
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

        if(this._wildcardBounds_ == child)
        {
            this._wildcardBounds_ = null;
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

        if(this._wildcardBounds_ == oldChild)
        {
            setWildcardBounds((PWildcardBounds) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
