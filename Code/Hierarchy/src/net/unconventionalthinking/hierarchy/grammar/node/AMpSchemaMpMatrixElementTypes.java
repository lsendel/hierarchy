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
public final class AMpSchemaMpMatrixElementTypes extends PMpMatrixElementTypes
{
    private TMpSchemaKeyword _mpSchemaKeyword_;

    public AMpSchemaMpMatrixElementTypes()
    {
        // Constructor
    }

    public AMpSchemaMpMatrixElementTypes(
        @SuppressWarnings("hiding") TMpSchemaKeyword _mpSchemaKeyword_)
    {
        // Constructor
        setMpSchemaKeyword(_mpSchemaKeyword_);

    }

    @Override
    public Object clone()
    {
        return new AMpSchemaMpMatrixElementTypes(
            cloneNode(this._mpSchemaKeyword_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMpSchemaMpMatrixElementTypes(this);
    }

    public TMpSchemaKeyword getMpSchemaKeyword()
    {
        return this._mpSchemaKeyword_;
    }

    public void setMpSchemaKeyword(TMpSchemaKeyword node)
    {
        if(this._mpSchemaKeyword_ != null)
        {
            this._mpSchemaKeyword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mpSchemaKeyword_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._mpSchemaKeyword_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._mpSchemaKeyword_ == child)
        {
            this._mpSchemaKeyword_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._mpSchemaKeyword_ == oldChild)
        {
            setMpSchemaKeyword((TMpSchemaKeyword) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
