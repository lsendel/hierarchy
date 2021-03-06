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
public final class AMpNameScope extends PNameScope
{
    private PNameScopeName _nameScopeName_;
    private TMpColonColonOperator _mpColonColonOperator_;

    public AMpNameScope()
    {
        // Constructor
    }

    public AMpNameScope(
        @SuppressWarnings("hiding") PNameScopeName _nameScopeName_,
        @SuppressWarnings("hiding") TMpColonColonOperator _mpColonColonOperator_)
    {
        // Constructor
        setNameScopeName(_nameScopeName_);

        setMpColonColonOperator(_mpColonColonOperator_);

    }

    @Override
    public Object clone()
    {
        return new AMpNameScope(
            cloneNode(this._nameScopeName_),
            cloneNode(this._mpColonColonOperator_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMpNameScope(this);
    }

    public PNameScopeName getNameScopeName()
    {
        return this._nameScopeName_;
    }

    public void setNameScopeName(PNameScopeName node)
    {
        if(this._nameScopeName_ != null)
        {
            this._nameScopeName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nameScopeName_ = node;
    }

    public TMpColonColonOperator getMpColonColonOperator()
    {
        return this._mpColonColonOperator_;
    }

    public void setMpColonColonOperator(TMpColonColonOperator node)
    {
        if(this._mpColonColonOperator_ != null)
        {
            this._mpColonColonOperator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mpColonColonOperator_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nameScopeName_)
            + toString(this._mpColonColonOperator_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nameScopeName_ == child)
        {
            this._nameScopeName_ = null;
            return;
        }

        if(this._mpColonColonOperator_ == child)
        {
            this._mpColonColonOperator_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nameScopeName_ == oldChild)
        {
            setNameScopeName((PNameScopeName) newChild);
            return;
        }

        if(this._mpColonColonOperator_ == oldChild)
        {
            setMpColonColonOperator((TMpColonColonOperator) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
