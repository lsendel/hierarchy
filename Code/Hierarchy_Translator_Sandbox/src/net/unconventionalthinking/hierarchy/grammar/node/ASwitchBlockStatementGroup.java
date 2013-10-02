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
public final class ASwitchBlockStatementGroup extends PSwitchBlockStatementGroup
{
    private final LinkedList<PSwitchLabel> _switchLabels_ = new LinkedList<PSwitchLabel>();
    private final LinkedList<PBlockStatement> _blockStatements_ = new LinkedList<PBlockStatement>();

    public ASwitchBlockStatementGroup()
    {
        // Constructor
    }

    public ASwitchBlockStatementGroup(
        @SuppressWarnings("hiding") List<PSwitchLabel> _switchLabels_,
        @SuppressWarnings("hiding") List<PBlockStatement> _blockStatements_)
    {
        // Constructor
        setSwitchLabels(_switchLabels_);

        setBlockStatements(_blockStatements_);

    }

    @Override
    public Object clone()
    {
        return new ASwitchBlockStatementGroup(
            cloneList(this._switchLabels_),
            cloneList(this._blockStatements_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASwitchBlockStatementGroup(this);
    }

    public LinkedList<PSwitchLabel> getSwitchLabels()
    {
        return this._switchLabels_;
    }

    public void setSwitchLabels(List<PSwitchLabel> list)
    {
        this._switchLabels_.clear();
        this._switchLabels_.addAll(list);
        for(PSwitchLabel e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PBlockStatement> getBlockStatements()
    {
        return this._blockStatements_;
    }

    public void setBlockStatements(List<PBlockStatement> list)
    {
        this._blockStatements_.clear();
        this._blockStatements_.addAll(list);
        for(PBlockStatement e : list)
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
            + toString(this._switchLabels_)
            + toString(this._blockStatements_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._switchLabels_.remove(child))
        {
            return;
        }

        if(this._blockStatements_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PSwitchLabel> i = this._switchLabels_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PSwitchLabel) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PBlockStatement> i = this._blockStatements_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PBlockStatement) newChild);
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