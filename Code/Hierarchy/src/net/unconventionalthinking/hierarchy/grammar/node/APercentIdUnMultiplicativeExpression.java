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

import java.util.*;
import net.unconventionalthinking.hierarchy.grammar.analysis.*;

@SuppressWarnings("nls")
public final class APercentIdUnMultiplicativeExpression extends PMultiplicativeExpression
{
    private TIdentifier _identifier_;
    private final LinkedList<PAdditionalIdentifier> _additionalIdentifiers_ = new LinkedList<PAdditionalIdentifier>();
    private TPercent _percent_;
    private PUnaryExpression _unaryExpression_;

    public APercentIdUnMultiplicativeExpression()
    {
        // Constructor
    }

    public APercentIdUnMultiplicativeExpression(
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") List<PAdditionalIdentifier> _additionalIdentifiers_,
        @SuppressWarnings("hiding") TPercent _percent_,
        @SuppressWarnings("hiding") PUnaryExpression _unaryExpression_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setAdditionalIdentifiers(_additionalIdentifiers_);

        setPercent(_percent_);

        setUnaryExpression(_unaryExpression_);

    }

    @Override
    public Object clone()
    {
        return new APercentIdUnMultiplicativeExpression(
            cloneNode(this._identifier_),
            cloneList(this._additionalIdentifiers_),
            cloneNode(this._percent_),
            cloneNode(this._unaryExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPercentIdUnMultiplicativeExpression(this);
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public LinkedList<PAdditionalIdentifier> getAdditionalIdentifiers()
    {
        return this._additionalIdentifiers_;
    }

    public void setAdditionalIdentifiers(List<PAdditionalIdentifier> list)
    {
        this._additionalIdentifiers_.clear();
        this._additionalIdentifiers_.addAll(list);
        for(PAdditionalIdentifier e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public TPercent getPercent()
    {
        return this._percent_;
    }

    public void setPercent(TPercent node)
    {
        if(this._percent_ != null)
        {
            this._percent_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._percent_ = node;
    }

    public PUnaryExpression getUnaryExpression()
    {
        return this._unaryExpression_;
    }

    public void setUnaryExpression(PUnaryExpression node)
    {
        if(this._unaryExpression_ != null)
        {
            this._unaryExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unaryExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifier_)
            + toString(this._additionalIdentifiers_)
            + toString(this._percent_)
            + toString(this._unaryExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._additionalIdentifiers_.remove(child))
        {
            return;
        }

        if(this._percent_ == child)
        {
            this._percent_ = null;
            return;
        }

        if(this._unaryExpression_ == child)
        {
            this._unaryExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator<PAdditionalIdentifier> i = this._additionalIdentifiers_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAdditionalIdentifier) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._percent_ == oldChild)
        {
            setPercent((TPercent) newChild);
            return;
        }

        if(this._unaryExpression_ == oldChild)
        {
            setUnaryExpression((PUnaryExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
