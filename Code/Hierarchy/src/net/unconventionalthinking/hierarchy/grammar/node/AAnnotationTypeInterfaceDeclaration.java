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
public final class AAnnotationTypeInterfaceDeclaration extends PInterfaceDeclaration
{
    private PAnnotationTypeDeclaration _annotationTypeDeclaration_;

    public AAnnotationTypeInterfaceDeclaration()
    {
        // Constructor
    }

    public AAnnotationTypeInterfaceDeclaration(
        @SuppressWarnings("hiding") PAnnotationTypeDeclaration _annotationTypeDeclaration_)
    {
        // Constructor
        setAnnotationTypeDeclaration(_annotationTypeDeclaration_);

    }

    @Override
    public Object clone()
    {
        return new AAnnotationTypeInterfaceDeclaration(
            cloneNode(this._annotationTypeDeclaration_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAnnotationTypeInterfaceDeclaration(this);
    }

    public PAnnotationTypeDeclaration getAnnotationTypeDeclaration()
    {
        return this._annotationTypeDeclaration_;
    }

    public void setAnnotationTypeDeclaration(PAnnotationTypeDeclaration node)
    {
        if(this._annotationTypeDeclaration_ != null)
        {
            this._annotationTypeDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._annotationTypeDeclaration_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._annotationTypeDeclaration_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._annotationTypeDeclaration_ == child)
        {
            this._annotationTypeDeclaration_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._annotationTypeDeclaration_ == oldChild)
        {
            setAnnotationTypeDeclaration((PAnnotationTypeDeclaration) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
