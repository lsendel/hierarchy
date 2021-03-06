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
public final class AMpMatrixImportDeclaration extends PMatrixImportDeclaration
{
    private TImport _import_;
    private TMpMatrixKeyword _mpMatrixKeyword_;
    private PMatrixElementName _matrixElementName_;
    private TSemi _semi_;

    public AMpMatrixImportDeclaration()
    {
        // Constructor
    }

    public AMpMatrixImportDeclaration(
        @SuppressWarnings("hiding") TImport _import_,
        @SuppressWarnings("hiding") TMpMatrixKeyword _mpMatrixKeyword_,
        @SuppressWarnings("hiding") PMatrixElementName _matrixElementName_,
        @SuppressWarnings("hiding") TSemi _semi_)
    {
        // Constructor
        setImport(_import_);

        setMpMatrixKeyword(_mpMatrixKeyword_);

        setMatrixElementName(_matrixElementName_);

        setSemi(_semi_);

    }

    @Override
    public Object clone()
    {
        return new AMpMatrixImportDeclaration(
            cloneNode(this._import_),
            cloneNode(this._mpMatrixKeyword_),
            cloneNode(this._matrixElementName_),
            cloneNode(this._semi_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMpMatrixImportDeclaration(this);
    }

    public TImport getImport()
    {
        return this._import_;
    }

    public void setImport(TImport node)
    {
        if(this._import_ != null)
        {
            this._import_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._import_ = node;
    }

    public TMpMatrixKeyword getMpMatrixKeyword()
    {
        return this._mpMatrixKeyword_;
    }

    public void setMpMatrixKeyword(TMpMatrixKeyword node)
    {
        if(this._mpMatrixKeyword_ != null)
        {
            this._mpMatrixKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mpMatrixKeyword_ = node;
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

    public TSemi getSemi()
    {
        return this._semi_;
    }

    public void setSemi(TSemi node)
    {
        if(this._semi_ != null)
        {
            this._semi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semi_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._import_)
            + toString(this._mpMatrixKeyword_)
            + toString(this._matrixElementName_)
            + toString(this._semi_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._import_ == child)
        {
            this._import_ = null;
            return;
        }

        if(this._mpMatrixKeyword_ == child)
        {
            this._mpMatrixKeyword_ = null;
            return;
        }

        if(this._matrixElementName_ == child)
        {
            this._matrixElementName_ = null;
            return;
        }

        if(this._semi_ == child)
        {
            this._semi_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._import_ == oldChild)
        {
            setImport((TImport) newChild);
            return;
        }

        if(this._mpMatrixKeyword_ == oldChild)
        {
            setMpMatrixKeyword((TMpMatrixKeyword) newChild);
            return;
        }

        if(this._matrixElementName_ == oldChild)
        {
            setMatrixElementName((PMatrixElementName) newChild);
            return;
        }

        if(this._semi_ == oldChild)
        {
            setSemi((TSemi) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
