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
public final class AAnnotationTypeDeclaration extends PAnnotationTypeDeclaration
{
    private final LinkedList<PModifier> _modifiers_ = new LinkedList<PModifier>();
    private TAt _at_;
    private TInterface _interface_;
    private TIdentifier _identifier_;
    private PAnnotationTypeBody _annotationTypeBody_;

    public AAnnotationTypeDeclaration()
    {
        // Constructor
    }

    public AAnnotationTypeDeclaration(
        @SuppressWarnings("hiding") List<PModifier> _modifiers_,
        @SuppressWarnings("hiding") TAt _at_,
        @SuppressWarnings("hiding") TInterface _interface_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") PAnnotationTypeBody _annotationTypeBody_)
    {
        // Constructor
        setModifiers(_modifiers_);

        setAt(_at_);

        setInterface(_interface_);

        setIdentifier(_identifier_);

        setAnnotationTypeBody(_annotationTypeBody_);

    }

    @Override
    public Object clone()
    {
        return new AAnnotationTypeDeclaration(
            cloneList(this._modifiers_),
            cloneNode(this._at_),
            cloneNode(this._interface_),
            cloneNode(this._identifier_),
            cloneNode(this._annotationTypeBody_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAnnotationTypeDeclaration(this);
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

    public TAt getAt()
    {
        return this._at_;
    }

    public void setAt(TAt node)
    {
        if(this._at_ != null)
        {
            this._at_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._at_ = node;
    }

    public TInterface getInterface()
    {
        return this._interface_;
    }

    public void setInterface(TInterface node)
    {
        if(this._interface_ != null)
        {
            this._interface_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._interface_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public PAnnotationTypeBody getAnnotationTypeBody()
    {
        return this._annotationTypeBody_;
    }

    public void setAnnotationTypeBody(PAnnotationTypeBody node)
    {
        if(this._annotationTypeBody_ != null)
        {
            this._annotationTypeBody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._annotationTypeBody_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._modifiers_)
            + toString(this._at_)
            + toString(this._interface_)
            + toString(this._identifier_)
            + toString(this._annotationTypeBody_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._modifiers_.remove(child))
        {
            return;
        }

        if(this._at_ == child)
        {
            this._at_ = null;
            return;
        }

        if(this._interface_ == child)
        {
            this._interface_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._annotationTypeBody_ == child)
        {
            this._annotationTypeBody_ = null;
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

        if(this._at_ == oldChild)
        {
            setAt((TAt) newChild);
            return;
        }

        if(this._interface_ == oldChild)
        {
            setInterface((TInterface) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._annotationTypeBody_ == oldChild)
        {
            setAnnotationTypeBody((PAnnotationTypeBody) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}