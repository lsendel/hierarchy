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
public final class AMpFieldsetParametermap extends PFieldsetParametermap
{
    private PFieldname _fieldname_;
    private PParameterMappingToValue _parameterMappingToValue_;
    private final LinkedList<PFieldsetParameterChildren> _fieldsetParameterChildren_ = new LinkedList<PFieldsetParameterChildren>();

    public AMpFieldsetParametermap()
    {
        // Constructor
    }

    public AMpFieldsetParametermap(
        @SuppressWarnings("hiding") PFieldname _fieldname_,
        @SuppressWarnings("hiding") PParameterMappingToValue _parameterMappingToValue_,
        @SuppressWarnings("hiding") List<PFieldsetParameterChildren> _fieldsetParameterChildren_)
    {
        // Constructor
        setFieldname(_fieldname_);

        setParameterMappingToValue(_parameterMappingToValue_);

        setFieldsetParameterChildren(_fieldsetParameterChildren_);

    }

    @Override
    public Object clone()
    {
        return new AMpFieldsetParametermap(
            cloneNode(this._fieldname_),
            cloneNode(this._parameterMappingToValue_),
            cloneList(this._fieldsetParameterChildren_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMpFieldsetParametermap(this);
    }

    public PFieldname getFieldname()
    {
        return this._fieldname_;
    }

    public void setFieldname(PFieldname node)
    {
        if(this._fieldname_ != null)
        {
            this._fieldname_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fieldname_ = node;
    }

    public PParameterMappingToValue getParameterMappingToValue()
    {
        return this._parameterMappingToValue_;
    }

    public void setParameterMappingToValue(PParameterMappingToValue node)
    {
        if(this._parameterMappingToValue_ != null)
        {
            this._parameterMappingToValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parameterMappingToValue_ = node;
    }

    public LinkedList<PFieldsetParameterChildren> getFieldsetParameterChildren()
    {
        return this._fieldsetParameterChildren_;
    }

    public void setFieldsetParameterChildren(List<PFieldsetParameterChildren> list)
    {
        this._fieldsetParameterChildren_.clear();
        this._fieldsetParameterChildren_.addAll(list);
        for(PFieldsetParameterChildren e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fieldname_)
            + toString(this._parameterMappingToValue_)
            + toString(this._fieldsetParameterChildren_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fieldname_ == child)
        {
            this._fieldname_ = null;
            return;
        }

        if(this._parameterMappingToValue_ == child)
        {
            this._parameterMappingToValue_ = null;
            return;
        }

        if(this._fieldsetParameterChildren_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fieldname_ == oldChild)
        {
            setFieldname((PFieldname) newChild);
            return;
        }

        if(this._parameterMappingToValue_ == oldChild)
        {
            setParameterMappingToValue((PParameterMappingToValue) newChild);
            return;
        }

        for(ListIterator<PFieldsetParameterChildren> i = this._fieldsetParameterChildren_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PFieldsetParameterChildren) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}