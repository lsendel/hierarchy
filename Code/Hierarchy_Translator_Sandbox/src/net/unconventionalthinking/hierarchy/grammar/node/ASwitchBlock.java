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
public final class ASwitchBlock extends PSwitchBlock
{
    private TLBrc _lBrc_;
    private final LinkedList<PSwitchBlockStatementGroup> _switchBlockStatementGroups_ = new LinkedList<PSwitchBlockStatementGroup>();
    private final LinkedList<PSwitchLabel> _switchLabels_ = new LinkedList<PSwitchLabel>();
    private TRBrc _rBrc_;

    public ASwitchBlock()
    {
        // Constructor
    }

    public ASwitchBlock(
        @SuppressWarnings("hiding") TLBrc _lBrc_,
        @SuppressWarnings("hiding") List<PSwitchBlockStatementGroup> _switchBlockStatementGroups_,
        @SuppressWarnings("hiding") List<PSwitchLabel> _switchLabels_,
        @SuppressWarnings("hiding") TRBrc _rBrc_)
    {
        // Constructor
        setLBrc(_lBrc_);

        setSwitchBlockStatementGroups(_switchBlockStatementGroups_);

        setSwitchLabels(_switchLabels_);

        setRBrc(_rBrc_);

    }

    @Override
    public Object clone()
    {
        return new ASwitchBlock(
            cloneNode(this._lBrc_),
            cloneList(this._switchBlockStatementGroups_),
            cloneList(this._switchLabels_),
            cloneNode(this._rBrc_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASwitchBlock(this);
    }

    public TLBrc getLBrc()
    {
        return this._lBrc_;
    }

    public void setLBrc(TLBrc node)
    {
        if(this._lBrc_ != null)
        {
            this._lBrc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBrc_ = node;
    }

    public LinkedList<PSwitchBlockStatementGroup> getSwitchBlockStatementGroups()
    {
        return this._switchBlockStatementGroups_;
    }

    public void setSwitchBlockStatementGroups(List<PSwitchBlockStatementGroup> list)
    {
        this._switchBlockStatementGroups_.clear();
        this._switchBlockStatementGroups_.addAll(list);
        for(PSwitchBlockStatementGroup e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
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

    public TRBrc getRBrc()
    {
        return this._rBrc_;
    }

    public void setRBrc(TRBrc node)
    {
        if(this._rBrc_ != null)
        {
            this._rBrc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBrc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lBrc_)
            + toString(this._switchBlockStatementGroups_)
            + toString(this._switchLabels_)
            + toString(this._rBrc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lBrc_ == child)
        {
            this._lBrc_ = null;
            return;
        }

        if(this._switchBlockStatementGroups_.remove(child))
        {
            return;
        }

        if(this._switchLabels_.remove(child))
        {
            return;
        }

        if(this._rBrc_ == child)
        {
            this._rBrc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lBrc_ == oldChild)
        {
            setLBrc((TLBrc) newChild);
            return;
        }

        for(ListIterator<PSwitchBlockStatementGroup> i = this._switchBlockStatementGroups_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PSwitchBlockStatementGroup) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

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

        if(this._rBrc_ == oldChild)
        {
            setRBrc((TRBrc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}