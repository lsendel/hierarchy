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
public final class AMjMatrixTypesExpressionCastExpression extends PCastExpression
{
    private TLPar _lPar_;
    private PMpMatrixTypes _mpMatrixTypes_;
    private final LinkedList<PDim> _dims_ = new LinkedList<PDim>();
    private TRPar _rPar_;
    private PUnaryExpression _unaryExpression_;

    public AMjMatrixTypesExpressionCastExpression()
    {
        // Constructor
    }

    public AMjMatrixTypesExpressionCastExpression(
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PMpMatrixTypes _mpMatrixTypes_,
        @SuppressWarnings("hiding") List<PDim> _dims_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") PUnaryExpression _unaryExpression_)
    {
        // Constructor
        setLPar(_lPar_);

        setMpMatrixTypes(_mpMatrixTypes_);

        setDims(_dims_);

        setRPar(_rPar_);

        setUnaryExpression(_unaryExpression_);

    }

    @Override
    public Object clone()
    {
        return new AMjMatrixTypesExpressionCastExpression(
            cloneNode(this._lPar_),
            cloneNode(this._mpMatrixTypes_),
            cloneList(this._dims_),
            cloneNode(this._rPar_),
            cloneNode(this._unaryExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMjMatrixTypesExpressionCastExpression(this);
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public PMpMatrixTypes getMpMatrixTypes()
    {
        return this._mpMatrixTypes_;
    }

    public void setMpMatrixTypes(PMpMatrixTypes node)
    {
        if(this._mpMatrixTypes_ != null)
        {
            this._mpMatrixTypes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mpMatrixTypes_ = node;
    }

    public LinkedList<PDim> getDims()
    {
        return this._dims_;
    }

    public void setDims(List<PDim> list)
    {
        this._dims_.clear();
        this._dims_.addAll(list);
        for(PDim e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
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
            + toString(this._lPar_)
            + toString(this._mpMatrixTypes_)
            + toString(this._dims_)
            + toString(this._rPar_)
            + toString(this._unaryExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._mpMatrixTypes_ == child)
        {
            this._mpMatrixTypes_ = null;
            return;
        }

        if(this._dims_.remove(child))
        {
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
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
        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._mpMatrixTypes_ == oldChild)
        {
            setMpMatrixTypes((PMpMatrixTypes) newChild);
            return;
        }

        for(ListIterator<PDim> i = this._dims_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDim) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
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