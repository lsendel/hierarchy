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
public final class AMpStdDescriptorHeadStd extends PDescriptorHeadStd
{
    private PMatrixElementName _matrixElementName_;
    private PDescriptorLabel _descriptorLabel_;

    public AMpStdDescriptorHeadStd()
    {
        // Constructor
    }

    public AMpStdDescriptorHeadStd(
        @SuppressWarnings("hiding") PMatrixElementName _matrixElementName_,
        @SuppressWarnings("hiding") PDescriptorLabel _descriptorLabel_)
    {
        // Constructor
        setMatrixElementName(_matrixElementName_);

        setDescriptorLabel(_descriptorLabel_);

    }

    @Override
    public Object clone()
    {
        return new AMpStdDescriptorHeadStd(
            cloneNode(this._matrixElementName_),
            cloneNode(this._descriptorLabel_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMpStdDescriptorHeadStd(this);
    }

    public PMatrixElementName getMatrixElementName()
    {
        return this._matrixElementName_;
    }

    public void setMatrixElementName(PMatrixElementName node)
    {
        if(this._matrixElementName_ != null)
        {
            this._matrixElementName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._matrixElementName_ = node;
    }

    public PDescriptorLabel getDescriptorLabel()
    {
        return this._descriptorLabel_;
    }

    public void setDescriptorLabel(PDescriptorLabel node)
    {
        if(this._descriptorLabel_ != null)
        {
            this._descriptorLabel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._descriptorLabel_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._matrixElementName_)
            + toString(this._descriptorLabel_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._matrixElementName_ == child)
        {
            this._matrixElementName_ = null;
            return;
        }

        if(this._descriptorLabel_ == child)
        {
            this._descriptorLabel_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._matrixElementName_ == oldChild)
        {
            setMatrixElementName((PMatrixElementName) newChild);
            return;
        }

        if(this._descriptorLabel_ == oldChild)
        {
            setDescriptorLabel((PDescriptorLabel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
