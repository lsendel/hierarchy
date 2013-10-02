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
public final class AMpSchemaNameList extends PSchemaNameList
{
    private PSchemaName _schemaName_;
    private final LinkedList<PSchemaNameListChildren> _schemaNameListChildren_ = new LinkedList<PSchemaNameListChildren>();

    public AMpSchemaNameList()
    {
        // Constructor
    }

    public AMpSchemaNameList(
        @SuppressWarnings("hiding") PSchemaName _schemaName_,
        @SuppressWarnings("hiding") List<PSchemaNameListChildren> _schemaNameListChildren_)
    {
        // Constructor
        setSchemaName(_schemaName_);

        setSchemaNameListChildren(_schemaNameListChildren_);

    }

    @Override
    public Object clone()
    {
        return new AMpSchemaNameList(
            cloneNode(this._schemaName_),
            cloneList(this._schemaNameListChildren_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMpSchemaNameList(this);
    }

    public PSchemaName getSchemaName()
    {
        return this._schemaName_;
    }

    public void setSchemaName(PSchemaName node)
    {
        if(this._schemaName_ != null)
        {
            this._schemaName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._schemaName_ = node;
    }

    public LinkedList<PSchemaNameListChildren> getSchemaNameListChildren()
    {
        return this._schemaNameListChildren_;
    }

    public void setSchemaNameListChildren(List<PSchemaNameListChildren> list)
    {
        this._schemaNameListChildren_.clear();
        this._schemaNameListChildren_.addAll(list);
        for(PSchemaNameListChildren e : list)
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
            + toString(this._schemaName_)
            + toString(this._schemaNameListChildren_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._schemaName_ == child)
        {
            this._schemaName_ = null;
            return;
        }

        if(this._schemaNameListChildren_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._schemaName_ == oldChild)
        {
            setSchemaName((PSchemaName) newChild);
            return;
        }

        for(ListIterator<PSchemaNameListChildren> i = this._schemaNameListChildren_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PSchemaNameListChildren) newChild);
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