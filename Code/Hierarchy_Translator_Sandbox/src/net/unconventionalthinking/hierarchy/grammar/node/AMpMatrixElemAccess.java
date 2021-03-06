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
public final class AMpMatrixElemAccess extends PMatrixElemAccess
{
    private PMatrixElemAccessOperatorOptions _matrixElemAccessOperatorOptions_;
    private PElementNameSpecifierOptions _elementNameSpecifierOptions_;
    private PMatrixElemMultipleAccessOptions _matrixElemMultipleAccessOptions_;

    public AMpMatrixElemAccess()
    {
        // Constructor
    }

    public AMpMatrixElemAccess(
        @SuppressWarnings("hiding") PMatrixElemAccessOperatorOptions _matrixElemAccessOperatorOptions_,
        @SuppressWarnings("hiding") PElementNameSpecifierOptions _elementNameSpecifierOptions_,
        @SuppressWarnings("hiding") PMatrixElemMultipleAccessOptions _matrixElemMultipleAccessOptions_)
    {
        // Constructor
        setMatrixElemAccessOperatorOptions(_matrixElemAccessOperatorOptions_);

        setElementNameSpecifierOptions(_elementNameSpecifierOptions_);

        setMatrixElemMultipleAccessOptions(_matrixElemMultipleAccessOptions_);

    }

    @Override
    public Object clone()
    {
        return new AMpMatrixElemAccess(
            cloneNode(this._matrixElemAccessOperatorOptions_),
            cloneNode(this._elementNameSpecifierOptions_),
            cloneNode(this._matrixElemMultipleAccessOptions_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMpMatrixElemAccess(this);
    }

    public PMatrixElemAccessOperatorOptions getMatrixElemAccessOperatorOptions()
    {
        return this._matrixElemAccessOperatorOptions_;
    }

    public void setMatrixElemAccessOperatorOptions(PMatrixElemAccessOperatorOptions node)
    {
        if(this._matrixElemAccessOperatorOptions_ != null)
        {
            this._matrixElemAccessOperatorOptions_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._matrixElemAccessOperatorOptions_ = node;
    }

    public PElementNameSpecifierOptions getElementNameSpecifierOptions()
    {
        return this._elementNameSpecifierOptions_;
    }

    public void setElementNameSpecifierOptions(PElementNameSpecifierOptions node)
    {
        if(this._elementNameSpecifierOptions_ != null)
        {
            this._elementNameSpecifierOptions_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementNameSpecifierOptions_ = node;
    }

    public PMatrixElemMultipleAccessOptions getMatrixElemMultipleAccessOptions()
    {
        return this._matrixElemMultipleAccessOptions_;
    }

    public void setMatrixElemMultipleAccessOptions(PMatrixElemMultipleAccessOptions node)
    {
        if(this._matrixElemMultipleAccessOptions_ != null)
        {
            this._matrixElemMultipleAccessOptions_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._matrixElemMultipleAccessOptions_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._matrixElemAccessOperatorOptions_)
            + toString(this._elementNameSpecifierOptions_)
            + toString(this._matrixElemMultipleAccessOptions_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._matrixElemAccessOperatorOptions_ == child)
        {
            this._matrixElemAccessOperatorOptions_ = null;
            return;
        }

        if(this._elementNameSpecifierOptions_ == child)
        {
            this._elementNameSpecifierOptions_ = null;
            return;
        }

        if(this._matrixElemMultipleAccessOptions_ == child)
        {
            this._matrixElemMultipleAccessOptions_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._matrixElemAccessOperatorOptions_ == oldChild)
        {
            setMatrixElemAccessOperatorOptions((PMatrixElemAccessOperatorOptions) newChild);
            return;
        }

        if(this._elementNameSpecifierOptions_ == oldChild)
        {
            setElementNameSpecifierOptions((PElementNameSpecifierOptions) newChild);
            return;
        }

        if(this._matrixElemMultipleAccessOptions_ == oldChild)
        {
            setMatrixElemMultipleAccessOptions((PMatrixElemMultipleAccessOptions) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
