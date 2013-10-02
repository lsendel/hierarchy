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
public final class AMpStdFieldsetTupleOptions extends PFieldsetTupleOptions
{
    private PFieldsetTupleWBraces _fieldsetTupleWBraces_;

    public AMpStdFieldsetTupleOptions()
    {
        // Constructor
    }

    public AMpStdFieldsetTupleOptions(
        @SuppressWarnings("hiding") PFieldsetTupleWBraces _fieldsetTupleWBraces_)
    {
        // Constructor
        setFieldsetTupleWBraces(_fieldsetTupleWBraces_);

    }

    @Override
    public Object clone()
    {
        return new AMpStdFieldsetTupleOptions(
            cloneNode(this._fieldsetTupleWBraces_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMpStdFieldsetTupleOptions(this);
    }

    public PFieldsetTupleWBraces getFieldsetTupleWBraces()
    {
        return this._fieldsetTupleWBraces_;
    }

    public void setFieldsetTupleWBraces(PFieldsetTupleWBraces node)
    {
        if(this._fieldsetTupleWBraces_ != null)
        {
            this._fieldsetTupleWBraces_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fieldsetTupleWBraces_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fieldsetTupleWBraces_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fieldsetTupleWBraces_ == child)
        {
            this._fieldsetTupleWBraces_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fieldsetTupleWBraces_ == oldChild)
        {
            setFieldsetTupleWBraces((PFieldsetTupleWBraces) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}