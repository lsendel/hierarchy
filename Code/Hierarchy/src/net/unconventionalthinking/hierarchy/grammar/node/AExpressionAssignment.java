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
public final class AExpressionAssignment extends PAssignment
{
    private PLeftHandSide _leftHandSide_;
    private PAssignmentOperator _assignmentOperator_;
    private PAssignmentExpression _assignmentExpression_;

    public AExpressionAssignment()
    {
        // Constructor
    }

    public AExpressionAssignment(
        @SuppressWarnings("hiding") PLeftHandSide _leftHandSide_,
        @SuppressWarnings("hiding") PAssignmentOperator _assignmentOperator_,
        @SuppressWarnings("hiding") PAssignmentExpression _assignmentExpression_)
    {
        // Constructor
        setLeftHandSide(_leftHandSide_);

        setAssignmentOperator(_assignmentOperator_);

        setAssignmentExpression(_assignmentExpression_);

    }

    @Override
    public Object clone()
    {
        return new AExpressionAssignment(
            cloneNode(this._leftHandSide_),
            cloneNode(this._assignmentOperator_),
            cloneNode(this._assignmentExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpressionAssignment(this);
    }

    public PLeftHandSide getLeftHandSide()
    {
        return this._leftHandSide_;
    }

    public void setLeftHandSide(PLeftHandSide node)
    {
        if(this._leftHandSide_ != null)
        {
            this._leftHandSide_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leftHandSide_ = node;
    }

    public PAssignmentOperator getAssignmentOperator()
    {
        return this._assignmentOperator_;
    }

    public void setAssignmentOperator(PAssignmentOperator node)
    {
        if(this._assignmentOperator_ != null)
        {
            this._assignmentOperator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assignmentOperator_ = node;
    }

    public PAssignmentExpression getAssignmentExpression()
    {
        return this._assignmentExpression_;
    }

    public void setAssignmentExpression(PAssignmentExpression node)
    {
        if(this._assignmentExpression_ != null)
        {
            this._assignmentExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assignmentExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._leftHandSide_)
            + toString(this._assignmentOperator_)
            + toString(this._assignmentExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._leftHandSide_ == child)
        {
            this._leftHandSide_ = null;
            return;
        }

        if(this._assignmentOperator_ == child)
        {
            this._assignmentOperator_ = null;
            return;
        }

        if(this._assignmentExpression_ == child)
        {
            this._assignmentExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._leftHandSide_ == oldChild)
        {
            setLeftHandSide((PLeftHandSide) newChild);
            return;
        }

        if(this._assignmentOperator_ == oldChild)
        {
            setAssignmentOperator((PAssignmentOperator) newChild);
            return;
        }

        if(this._assignmentExpression_ == oldChild)
        {
            setAssignmentExpression((PAssignmentExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}