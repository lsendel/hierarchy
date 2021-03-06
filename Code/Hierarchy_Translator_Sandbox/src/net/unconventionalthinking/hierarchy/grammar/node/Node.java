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
import net.unconventionalthinking.compiler.tools.*; //  ** Matrix** modification 

@SuppressWarnings("nls")
public abstract class Node extends AttributeNode implements Switchable, Cloneable
{
    private Node parent;

    @Override
    public abstract Object clone();

    public Node parent()
    {
        return this.parent;
    }

    void parent(@SuppressWarnings("hiding") Node parent)
    {
        this.parent = parent;
    }

    abstract void removeChild(Node child);
    abstract void replaceChild(Node oldChild, Node newChild);

    public void replaceBy(Node node)
    {
        this.parent.replaceChild(this, node);
    }

    protected String toString(Node node)
    {
        if(node != null)
        {
//			return node.toString();
			return super.toString_Processor(node);  // **Matrix** modification
        }

        return "";
    }

    protected String toString(List list)
    {
        StringBuffer s = new StringBuffer();

        for(Iterator i = list.iterator(); i.hasNext();)
        {
            s.append(i.next());
        }

        return s.toString();
    }

    @SuppressWarnings("unchecked")
    protected <T extends Node> T cloneNode(T node)
    {
        if(node != null)
        {
            return (T) node.clone();
        }

        return null;
    }

    protected <T> List<T> cloneList(List<T> list)
    {
        List<T> clone = new LinkedList<T>();

        for(T n : list)
        {
            clone.add(n);
        }

        return clone;
    }
}
