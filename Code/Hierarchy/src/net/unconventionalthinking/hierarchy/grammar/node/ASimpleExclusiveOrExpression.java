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
public final class ASimpleExclusiveOrExpression extends PExclusiveOrExpression
{
    private PAndExpression _andExpression_;

    public ASimpleExclusiveOrExpression()
    {
        // Constructor
    }

    public ASimpleExclusiveOrExpression(
        @SuppressWarnings("hiding") PAndExpression _andExpression_)
    {
        // Constructor
        setAndExpression(_andExpression_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleExclusiveOrExpression(
            cloneNode(this._andExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleExclusiveOrExpression(this);
    }

    public PAndExpression getAndExpression()
    {
        return this._andExpression_;
    }

    public void setAndExpression(PAndExpression node)
    {
        if(this._andExpression_ != null)
        {
            this._andExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._andExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._andExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._andExpression_ == child)
        {
            this._andExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._andExpression_ == oldChild)
        {
            setAndExpression((PAndExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
