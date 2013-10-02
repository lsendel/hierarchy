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

package net.unconventionalthinking.hierarchy.grammar.parser;

import net.unconventionalthinking.hierarchy.grammar.lexer.*;
import net.unconventionalthinking.hierarchy.grammar.node.*;
import net.unconventionalthinking.hierarchy.grammar.analysis.*;
import java.util.*;

import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

@SuppressWarnings("nls")
public class Parser
{
    public final Analysis ignoredTokens = new AnalysisAdapter();

    protected ArrayList nodeList;

    private final Lexer lexer;
    private final ListIterator stack = new LinkedList().listIterator();
    private int last_pos;
    private int last_line;
    private Token last_token;
    private final TokenIndex converter = new TokenIndex();
    private final int[] action = new int[2];

    private final static int SHIFT = 0;
    private final static int REDUCE = 1;
    private final static int ACCEPT = 2;
    private final static int ERROR = 3;

    public Parser(@SuppressWarnings("hiding") Lexer lexer)
    {
        this.lexer = lexer;
    }

    @SuppressWarnings({"unchecked","unused"})
    private void push(int numstate, ArrayList listNode) throws ParserException, LexerException, IOException
    {
        this.nodeList = listNode;

        if(!this.stack.hasNext())
        {
            this.stack.add(new State(numstate, this.nodeList));
            return;
        }

        State s = (State) this.stack.next();
        s.state = numstate;
        s.nodes = this.nodeList;
    }

    private int goTo(int index)
    {
        int state = state();
        int low = 1;
        int high = gotoTable[index].length - 1;
        int value = gotoTable[index][0][1];

        while(low <= high)
        {
            int middle = (low + high) / 2;

            if(state < gotoTable[index][middle][0])
            {
                high = middle - 1;
            }
            else if(state > gotoTable[index][middle][0])
            {
                low = middle + 1;
            }
            else
            {
                value = gotoTable[index][middle][1];
                break;
            }
        }

        return value;
    }

    private int state()
    {
        State s = (State) this.stack.previous();
        this.stack.next();
        return s.state;
    }

    private ArrayList pop()
    {
        return ((State) this.stack.previous()).nodes;
    }

    private int index(Switchable token)
    {
        this.converter.index = -1;
        token.apply(this.converter);
        return this.converter.index;
    }

    @SuppressWarnings("unchecked")
    public Start parse() throws ParserException, LexerException, IOException
    {
        push(0, null);
        List<Node> ign = null;
        while(true)
        {
            while(index(this.lexer.peek()) == -1)
            {
                if(ign == null)
                {
                    ign = new LinkedList<Node>();
                }

                ign.add(this.lexer.next());
            }

            if(ign != null)
            {
                this.ignoredTokens.setIn(this.lexer.peek(), ign);
                ign = null;
            }

            this.last_pos = this.lexer.peek().getPos();
            this.last_line = this.lexer.peek().getLine();
            this.last_token = this.lexer.peek();

            int index = index(this.lexer.peek());
            this.action[0] = Parser.actionTable[state()][0][1];
            this.action[1] = Parser.actionTable[state()][0][2];

            int low = 1;
            int high = Parser.actionTable[state()].length - 1;

            while(low <= high)
            {
                int middle = (low + high) / 2;

                if(index < Parser.actionTable[state()][middle][0])
                {
                    high = middle - 1;
                }
                else if(index > Parser.actionTable[state()][middle][0])
                {
                    low = middle + 1;
                }
                else
                {
                    this.action[0] = Parser.actionTable[state()][middle][1];
                    this.action[1] = Parser.actionTable[state()][middle][2];
                    break;
                }
            }

            switch(this.action[0])
            {
                case SHIFT:
		    {
		        ArrayList list = new ArrayList();
		        list.add(this.lexer.next());
                        push(this.action[1], list);
                    }
		    break;
                case REDUCE:
                    switch(this.action[1])
                    {
                    case 0: /* reduce AAcompilationunit1CompilationUnit */
		    {
			ArrayList list = new0();
			push(goTo(0), list);
		    }
		    break;
                    case 1: /* reduce AAcompilationunit2CompilationUnit */
		    {
			ArrayList list = new1();
			push(goTo(0), list);
		    }
		    break;
                    case 2: /* reduce AAcompilationunit3CompilationUnit */
		    {
			ArrayList list = new2();
			push(goTo(0), list);
		    }
		    break;
                    case 3: /* reduce AAcompilationunit4CompilationUnit */
		    {
			ArrayList list = new3();
			push(goTo(0), list);
		    }
		    break;
                    case 4: /* reduce AAcompilationunit5CompilationUnit */
		    {
			ArrayList list = new4();
			push(goTo(0), list);
		    }
		    break;
                    case 5: /* reduce AAcompilationunit6CompilationUnit */
		    {
			ArrayList list = new5();
			push(goTo(0), list);
		    }
		    break;
                    case 6: /* reduce AAcompilationunit7CompilationUnit */
		    {
			ArrayList list = new6();
			push(goTo(0), list);
		    }
		    break;
                    case 7: /* reduce AAcompilationunit8CompilationUnit */
		    {
			ArrayList list = new7();
			push(goTo(0), list);
		    }
		    break;
                    case 8: /* reduce AMatrixSectionsMatrixSectionAndJavaTypeOptions */
		    {
			ArrayList list = new8();
			push(goTo(1), list);
		    }
		    break;
                    case 9: /* reduce AJavaTypeMatrixSectionAndJavaTypeOptions */
		    {
			ArrayList list = new9();
			push(goTo(1), list);
		    }
		    break;
                    case 10: /* reduce AApackagedeclaration1PackageDeclaration */
		    {
			ArrayList list = new10();
			push(goTo(2), list);
		    }
		    break;
                    case 11: /* reduce AApackagedeclaration2PackageDeclaration */
		    {
			ArrayList list = new11();
			push(goTo(2), list);
		    }
		    break;
                    case 12: /* reduce ADeclarationMatrixSections */
		    {
			ArrayList list = new12();
			push(goTo(3), list);
		    }
		    break;
                    case 13: /* reduce AKeyMatrixSections */
		    {
			ArrayList list = new13();
			push(goTo(3), list);
		    }
		    break;
                    case 14: /* reduce AMatrixMatrixSections */
		    {
			ArrayList list = new14();
			push(goTo(3), list);
		    }
		    break;
                    case 15: /* reduce AMatrixDeclarationSection */
		    {
			ArrayList list = new15();
			push(goTo(4), list);
		    }
		    break;
                    case 16: /* reduce AAmatrixdeclarationsectionbody1MatrixDeclarationSectionBody */
		    {
			ArrayList list = new16();
			push(goTo(5), list);
		    }
		    break;
                    case 17: /* reduce AAmatrixdeclarationsectionbody2MatrixDeclarationSectionBody */
		    {
			ArrayList list = new17();
			push(goTo(5), list);
		    }
		    break;
		    
		    
		    
		    
                    }
                    break;
                case ACCEPT:
                    {
                        EOF node2 = (EOF) this.lexer.next();
                        PCompilationUnit node1 = (PCompilationUnit) pop().get(0);
                        Start node = new Start(node1, node2);
                        return node;
                    }
                case ERROR:
                    throw new ParserException(this.last_token,
                        "[" + this.last_line + "," + this.last_pos + "] " +
                        Parser.errorMessages[Parser.errors[this.action[1]]]);
            }
        }
    }



    @SuppressWarnings("unchecked")
    ArrayList new0() /* reduce AAcompilationunit1CompilationUnit */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        PCompilationUnit pcompilationunitNode1;
        {
            // Block
        @SuppressWarnings("unused") Object nullNode2 = null;
        LinkedList listNode3 = new LinkedList();
        LinkedList listNode4 = new LinkedList();
        {
            // Block
        }
        {
            // Block
        }

        pcompilationunitNode1 = new ACompilationUnit(null, listNode3, listNode4);
        }
	nodeList.add(pcompilationunitNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new1() /* reduce AAcompilationunit2CompilationUnit */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PCompilationUnit pcompilationunitNode1;
        {
            // Block
        PPackageDeclaration ppackagedeclarationNode2;
        LinkedList listNode3 = new LinkedList();
        LinkedList listNode4 = new LinkedList();
        ppackagedeclarationNode2 = (PPackageDeclaration)nodeArrayList1.get(0);
        {
            // Block
        }
        {
            // Block
        }

        pcompilationunitNode1 = new ACompilationUnit(ppackagedeclarationNode2, listNode3, listNode4);
        }
	nodeList.add(pcompilationunitNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new2() /* reduce AAcompilationunit3CompilationUnit */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PCompilationUnit pcompilationunitNode1;
        {
            // Block
        @SuppressWarnings("unused") Object nullNode2 = null;
        LinkedList listNode4 = new LinkedList();
        LinkedList listNode5 = new LinkedList();
        {
            // Block
        LinkedList listNode3 = new LinkedList();
        listNode3 = (LinkedList)nodeArrayList1.get(0);
	if(listNode3 != null)
	{
	  listNode4.addAll(listNode3);
	}
        }
        {
            // Block
        }

        pcompilationunitNode1 = new ACompilationUnit(null, listNode4, listNode5);
        }
	nodeList.add(pcompilationunitNode1);
        return nodeList;
    }
