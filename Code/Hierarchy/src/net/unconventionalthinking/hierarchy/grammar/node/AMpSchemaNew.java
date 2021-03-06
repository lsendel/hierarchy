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
public final class AMpSchemaNew extends PSchemaNew
{
    private TMpSchemaKeyword _mpSchemaKeyword_;
    private PDotNew _dotNew_;

    public AMpSchemaNew()
    {
        // Constructor
    }

    public AMpSchemaNew(
        @SuppressWarnings("hiding") TMpSchemaKeyword _mpSchemaKeyword_,
        @SuppressWarnings("hiding") PDotNew _dotNew_)
    {
        // Constructor
        setMpSchemaKeyword(_mpSchemaKeyword_);

        setDotNew(_dotNew_);

    }

    @Override
    public Object clone()
    {
        return new AMpSchemaNew(
            cloneNode(this._mpSchemaKeyword_),
            cloneNode(this._dotNew_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMpSchemaNew(this);
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

    public PDotNew getDotNew()
    {
        return this._dotNew_;
    }

    public void setDotNew(PDotNew node)
    {
        if(this._dotNew_ != null)
        {
            this._dotNew_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dotNew_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._mpSchemaKeyword_)
            + toString(this._dotNew_);
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

        if(this._dotNew_ == child)
        {
            this._dotNew_ = null;
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

        if(this._dotNew_ == oldChild)
        {
            setDotNew((PDotNew) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
