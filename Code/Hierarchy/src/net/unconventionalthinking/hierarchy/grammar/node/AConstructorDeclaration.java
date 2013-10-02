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
public final class AConstructorDeclaration extends PConstructorDeclaration
{
    private final LinkedList<PModifier> _modifiers_ = new LinkedList<PModifier>();
    private PConstructorDeclarator _constructorDeclarator_;
    private PThrows _throws_;
    private PConstructorBody _constructorBody_;

    public AConstructorDeclaration()
    {
        // Constructor
    }

    public AConstructorDeclaration(
        @SuppressWarnings("hiding") List<PModifier> _modifiers_,
        @SuppressWarnings("hiding") PConstructorDeclarator _constructorDeclarator_,
        @SuppressWarnings("hiding") PThrows _throws_,
        @SuppressWarnings("hiding") PConstructorBody _constructorBody_)
    {
        // Constructor
        setModifiers(_modifiers_);

        setConstructorDeclarator(_constructorDeclarator_);

        setThrows(_throws_);

        setConstructorBody(_constructorBody_);

    }

    @Override
    public Object clone()
    {
        return new AConstructorDeclaration(
            cloneList(this._modifiers_),
            cloneNode(this._constructorDeclarator_),
            cloneNode(this._throws_),
            cloneNode(this._constructorBody_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConstructorDeclaration(this);
    }

    public LinkedList<PModifier> getModifiers()
    {
        return this._modifiers_;
    }

    public void setModifiers(List<PModifier> list)
    {
        this._modifiers_.clear();
        this._modifiers_.addAll(list);
        for(PModifier e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public PConstructorDeclarator getConstructorDeclarator()
    {
        return this._constructorDeclarator_;
    }

    public void setConstructorDeclarator(PConstructorDeclarator node)
    {
        if(this._constructorDeclarator_ != null)
        {
            this._constructorDeclarator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._constructorDeclarator_ = node;
    }

    public PThrows getThrows()
    {
        return this._throws_;
    }

    public void setThrows(PThrows node)
    {
        if(this._throws_ != null)
        {
            this._throws_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._throws_ = node;
    }

    public PConstructorBody getConstructorBody()
    {
        return this._constructorBody_;
    }

    public void setConstructorBody(PConstructorBody node)
    {
        if(this._constructorBody_ != null)
        {
            this._constructorBody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._constructorBody_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._modifiers_)
            + toString(this._constructorDeclarator_)
            + toString(this._throws_)
            + toString(this._constructorBody_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._modifiers_.remove(child))
        {
            return;
        }

        if(this._constructorDeclarator_ == child)
        {
            this._constructorDeclarator_ = null;
            return;
        }

        if(this._throws_ == child)
        {
            this._throws_ = null;
            return;
        }

        if(this._constructorBody_ == child)
        {
            this._constructorBody_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PModifier> i = this._modifiers_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PModifier) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._constructorDeclarator_ == oldChild)
        {
            setConstructorDeclarator((PConstructorDeclarator) newChild);
            return;
        }

        if(this._throws_ == oldChild)
        {
            setThrows((PThrows) newChild);
            return;
        }

        if(this._constructorBody_ == oldChild)
        {
            setConstructorBody((PConstructorBody) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}