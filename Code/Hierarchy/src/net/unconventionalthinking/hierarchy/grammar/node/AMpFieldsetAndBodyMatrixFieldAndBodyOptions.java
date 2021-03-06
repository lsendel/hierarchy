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
public final class AMpFieldsetAndBodyMatrixFieldAndBodyOptions extends PMatrixFieldAndBodyOptions
{
    private PFieldsetParametermapWColon _fieldsetParametermapWColon_;
    private PDescriptorBody _descriptorBody_;

    public AMpFieldsetAndBodyMatrixFieldAndBodyOptions()
    {
        // Constructor
    }

    public AMpFieldsetAndBodyMatrixFieldAndBodyOptions(
        @SuppressWarnings("hiding") PFieldsetParametermapWColon _fieldsetParametermapWColon_,
        @SuppressWarnings("hiding") PDescriptorBody _descriptorBody_)
    {
        // Constructor
        setFieldsetParametermapWColon(_fieldsetParametermapWColon_);

        setDescriptorBody(_descriptorBody_);

    }

    @Override
    public Object clone()
    {
        return new AMpFieldsetAndBodyMatrixFieldAndBodyOptions(
            cloneNode(this._fieldsetParametermapWColon_),
            cloneNode(this._descriptorBody_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMpFieldsetAndBodyMatrixFieldAndBodyOptions(this);
    }

    public PFieldsetParametermapWColon getFieldsetParametermapWColon()
    {
        return this._fieldsetParametermapWColon_;
    }

    public void setFieldsetParametermapWColon(PFieldsetParametermapWColon node)
    {
        if(this._fieldsetParametermapWColon_ != null)
        {
            this._fieldsetParametermapWColon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fieldsetParametermapWColon_ = node;
    }

    public PDescriptorBody getDescriptorBody()
    {
        return this._descriptorBody_;
    }

    public void setDescriptorBody(PDescriptorBody node)
    {
        if(this._descriptorBody_ != null)
        {
            this._descriptorBody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._descriptorBody_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fieldsetParametermapWColon_)
            + toString(this._descriptorBody_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fieldsetParametermapWColon_ == child)
        {
            this._fieldsetParametermapWColon_ = null;
            return;
        }

        if(this._descriptorBody_ == child)
        {
            this._descriptorBody_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fieldsetParametermapWColon_ == oldChild)
        {
            setFieldsetParametermapWColon((PFieldsetParametermapWColon) newChild);
            return;
        }

        if(this._descriptorBody_ == oldChild)
        {
            setDescriptorBody((PDescriptorBody) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
