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
public final class ABoundTypeBoundShr extends PTypeBoundShr
{
    private TExtends _extends_;
    private TIdentifier _identifier_;
    private final LinkedList<PAdditionalIdentifier> _additionalIdentifiers_ = new LinkedList<PAdditionalIdentifier>();
    private final LinkedList<PTypeComponent> _typeComponents_ = new LinkedList<PTypeComponent>();
    private PTypeArguments _typeArguments_;
    private final LinkedList<PAdditionalBound> _additionalBounds_ = new LinkedList<PAdditionalBound>();
    private PAdditionalBoundShrNoGt _additionalBoundShrNoGt_;

    public ABoundTypeBoundShr()
    {
        // Constructor
    }

    public ABoundTypeBoundShr(
        @SuppressWarnings("hiding") TExtends _extends_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") List<PAdditionalIdentifier> _additionalIdentifiers_,
        @SuppressWarnings("hiding") List<PTypeComponent> _typeComponents_,
        @SuppressWarnings("hiding") PTypeArguments _typeArguments_,
        @SuppressWarnings("hiding") List<PAdditionalBound> _additionalBounds_,
        @SuppressWarnings("hiding") PAdditionalBoundShrNoGt _additionalBoundShrNoGt_)
    {
        // Constructor
        setExtends(_extends_);

        setIdentifier(_identifier_);

        setAdditionalIdentifiers(_additionalIdentifiers_);

        setTypeComponents(_typeComponents_);

        setTypeArguments(_typeArguments_);

        setAdditionalBounds(_additionalBounds_);

        setAdditionalBoundShrNoGt(_additionalBoundShrNoGt_);

    }

    @Override
    public Object clone()
    {
        return new ABoundTypeBoundShr(
            cloneNode(this._extends_),
            cloneNode(this._identifier_),
            cloneList(this._additionalIdentifiers_),
            cloneList(this._typeComponents_),
            cloneNode(this._typeArguments_),
            cloneList(this._additionalBounds_),
            cloneNode(this._additionalBoundShrNoGt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABoundTypeBoundShr(this);
    }

    public TExtends getExtends()
    {
        return this._extends_;
    }

    public void setExtends(TExtends node)
    {
        if(this._extends_ != null)
        {
            this._extends_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._extends_ = node;
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

    public LinkedList<PAdditionalIdentifier> getAdditionalIdentifiers()
    {
        return this._additionalIdentifiers_;
    }

    public void setAdditionalIdentifiers(List<PAdditionalIdentifier> list)
    {
        this._additionalIdentifiers_.clear();
        this._additionalIdentifiers_.addAll(list);
        for(PAdditionalIdentifier e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PTypeComponent> getTypeComponents()
    {
        return this._typeComponents_;
    }

    public void setTypeComponents(List<PTypeComponent> list)
    {
        this._typeComponents_.clear();
        this._typeComponents_.addAll(list);
        for(PTypeComponent e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public PTypeArguments getTypeArguments()
    {
        return this._typeArguments_;
    }

    public void setTypeArguments(PTypeArguments node)
    {
        if(this._typeArguments_ != null)
        {
            this._typeArguments_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._typeArguments_ = node;
    }

    public LinkedList<PAdditionalBound> getAdditionalBounds()
    {
        return this._additionalBounds_;
    }

    public void setAdditionalBounds(List<PAdditionalBound> list)
    {
        this._additionalBounds_.clear();
        this._additionalBounds_.addAll(list);
        for(PAdditionalBound e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public PAdditionalBoundShrNoGt getAdditionalBoundShrNoGt()
    {
        return this._additionalBoundShrNoGt_;
    }

    public void setAdditionalBoundShrNoGt(PAdditionalBoundShrNoGt node)
    {
        if(this._additionalBoundShrNoGt_ != null)
        {
            this._additionalBoundShrNoGt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._additionalBoundShrNoGt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._extends_)
            + toString(this._identifier_)
            + toString(this._additionalIdentifiers_)
            + toString(this._typeComponents_)
            + toString(this._typeArguments_)
            + toString(this._additionalBounds_)
            + toString(this._additionalBoundShrNoGt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._extends_ == child)
        {
            this._extends_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._additionalIdentifiers_.remove(child))
        {
            return;
        }

        if(this._typeComponents_.remove(child))
        {
            return;
        }

        if(this._typeArguments_ == child)
        {
            this._typeArguments_ = null;
            return;
        }

        if(this._additionalBounds_.remove(child))
        {
            return;
        }

        if(this._additionalBoundShrNoGt_ == child)
        {
            this._additionalBoundShrNoGt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._extends_ == oldChild)
        {
            setExtends((TExtends) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator<PAdditionalIdentifier> i = this._additionalIdentifiers_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAdditionalIdentifier) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PTypeComponent> i = this._typeComponents_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PTypeComponent) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._typeArguments_ == oldChild)
        {
            setTypeArguments((PTypeArguments) newChild);
            return;
        }

        for(ListIterator<PAdditionalBound> i = this._additionalBounds_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAdditionalBound) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._additionalBoundShrNoGt_ == oldChild)
        {
            setAdditionalBoundShrNoGt((PAdditionalBoundShrNoGt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}