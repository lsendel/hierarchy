/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstractsystems.partita.metacode.grammar.analysis;

import java.util.*;
import com.abstractsystems.partita.metacode.grammar.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPMctTranslationPass().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAMctTranslationPass(AMctTranslationPass node)
    {
        defaultIn(node);
    }

    public void outAMctTranslationPass(AMctTranslationPass node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMctTranslationPass(AMctTranslationPass node)
    {
        inAMctTranslationPass(node);
        {
            List<PMctCodechunkOptions> copy = new ArrayList<PMctCodechunkOptions>(node.getMctCodechunkOptions());
            for(PMctCodechunkOptions e : copy)
            {
                e.apply(this);
            }
        }
        outAMctTranslationPass(node);
    }

    public void inACodetagMctCodechunkOptions(ACodetagMctCodechunkOptions node)
    {
        defaultIn(node);
    }

    public void outACodetagMctCodechunkOptions(ACodetagMctCodechunkOptions node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACodetagMctCodechunkOptions(ACodetagMctCodechunkOptions node)
    {
        inACodetagMctCodechunkOptions(node);
        if(node.getMctCodetagOptions() != null)
        {
            node.getMctCodetagOptions().apply(this);
        }
        outACodetagMctCodechunkOptions(node);
    }

    public void inAOutputtagMctCodechunkOptions(AOutputtagMctCodechunkOptions node)
    {
        defaultIn(node);
    }

    public void outAOutputtagMctCodechunkOptions(AOutputtagMctCodechunkOptions node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOutputtagMctCodechunkOptions(AOutputtagMctCodechunkOptions node)
    {
        inAOutputtagMctCodechunkOptions(node);
        if(node.getMctOutputtagOptions() != null)
        {
            node.getMctOutputtagOptions().apply(this);
        }
        outAOutputtagMctCodechunkOptions(node);
    }

    public void inASingleMctCodetagOptions(ASingleMctCodetagOptions node)
    {
        defaultIn(node);
    }

    public void outASingleMctCodetagOptions(ASingleMctCodetagOptions node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASingleMctCodetagOptions(ASingleMctCodetagOptions node)
    {
        inASingleMctCodetagOptions(node);
        if(node.getMctAttribtagSingle() != null)
        {
            node.getMctAttribtagSingle().apply(this);
        }
        outASingleMctCodetagOptions(node);
    }

    public void inAPairMctCodetagOptions(APairMctCodetagOptions node)
    {
        defaultIn(node);
    }

    public void outAPairMctCodetagOptions(APairMctCodetagOptions node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPairMctCodetagOptions(APairMctCodetagOptions node)
    {
        inAPairMctCodetagOptions(node);
        if(node.getMctAttribtagPair() != null)
        {
            node.getMctAttribtagPair().apply(this);
        }
        outAPairMctCodetagOptions(node);
    }

    public void inAMctAttribtagSingle(AMctAttribtagSingle node)
    {
        defaultIn(node);
    }

    public void outAMctAttribtagSingle(AMctAttribtagSingle node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMctAttribtagSingle(AMctAttribtagSingle node)
    {
        inAMctAttribtagSingle(node);
        if(node.getCodetagOpen() != null)
        {
            node.getCodetagOpen().apply(this);
        }
        if(node.getMctAttribute() != null)
        {
            node.getMctAttribute().apply(this);
        }
        if(node.getCodetagOpenEndtokenSingle() != null)
        {
            node.getCodetagOpenEndtokenSingle().apply(this);
        }
        outAMctAttribtagSingle(node);
    }

    public void inAMctAttribtagPair(AMctAttribtagPair node)
    {
        defaultIn(node);
    }

    public void outAMctAttribtagPair(AMctAttribtagPair node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMctAttribtagPair(AMctAttribtagPair node)
    {
        inAMctAttribtagPair(node);
        if(node.getMctCodetagOpen() != null)
        {
            node.getMctCodetagOpen().apply(this);
        }
        {
            List<PMctCodechunkOptions> copy = new ArrayList<PMctCodechunkOptions>(node.getMctCodechunkOptions());
            for(PMctCodechunkOptions e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getMctCodetagClose() != null)
        {
            node.getMctCodetagClose().apply(this);
        }
        outAMctAttribtagPair(node);
    }

    public void inAMctCodetagOpen(AMctCodetagOpen node)
    {
        defaultIn(node);
    }

    public void outAMctCodetagOpen(AMctCodetagOpen node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMctCodetagOpen(AMctCodetagOpen node)
    {
        inAMctCodetagOpen(node);
        if(node.getCodetagOpen() != null)
        {
            node.getCodetagOpen().apply(this);
        }
        if(node.getMctAttribute() != null)
        {
            node.getMctAttribute().apply(this);
        }
        if(node.getCodetagEndtoken() != null)
        {
            node.getCodetagEndtoken().apply(this);
        }
        outAMctCodetagOpen(node);
    }

    public void inAMctCodetagClose(AMctCodetagClose node)
    {
        defaultIn(node);
    }

    public void outAMctCodetagClose(AMctCodetagClose node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMctCodetagClose(AMctCodetagClose node)
    {
        inAMctCodetagClose(node);
        if(node.getCodetagClose() != null)
        {
            node.getCodetagClose().apply(this);
        }
        if(node.getMctAttribute() != null)
        {
            node.getMctAttribute().apply(this);
        }
        if(node.getCodetagEndtoken() != null)
        {
            node.getCodetagEndtoken().apply(this);
        }
        outAMctCodetagClose(node);
    }

    public void inAMctAttribute(AMctAttribute node)
    {
        defaultIn(node);
    }

    public void outAMctAttribute(AMctAttribute node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMctAttribute(AMctAttribute node)
    {
        inAMctAttribute(node);
        if(node.getMctCodetagAttribname() != null)
        {
            node.getMctCodetagAttribname().apply(this);
        }
        {
            List<PMctDescriptorChildren> copy = new ArrayList<PMctDescriptorChildren>(node.getMctDescriptorChildren());
            for(PMctDescriptorChildren e : copy)
            {
                e.apply(this);
            }
        }
        outAMctAttribute(node);
    }

    public void inAMctCodetagAttribname(AMctCodetagAttribname node)
    {
        defaultIn(node);
    }

    public void outAMctCodetagAttribname(AMctCodetagAttribname node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMctCodetagAttribname(AMctCodetagAttribname node)
    {
        inAMctCodetagAttribname(node);
        if(node.getCodetagAttrib() != null)
        {
            node.getCodetagAttrib().apply(this);
        }
        {
            List<PDescriptorTagnameChildren> copy = new ArrayList<PDescriptorTagnameChildren>(node.getDescriptorTagnameChildren());
            for(PDescriptorTagnameChildren e : copy)
            {
                e.apply(this);
            }
        }
        outAMctCodetagAttribname(node);
    }

    public void inADescriptortagnameStandardMctDescriptorChildren(ADescriptortagnameStandardMctDescriptorChildren node)
    {
        defaultIn(node);
    }

    public void outADescriptortagnameStandardMctDescriptorChildren(ADescriptortagnameStandardMctDescriptorChildren node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADescriptortagnameStandardMctDescriptorChildren(ADescriptortagnameStandardMctDescriptorChildren node)
    {
        inADescriptortagnameStandardMctDescriptorChildren(node);
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getDescriptorTagname() != null)
        {
            node.getDescriptorTagname().apply(this);
        }
        outADescriptortagnameStandardMctDescriptorChildren(node);
    }

    public void inADescriptortagnameBacktiksMctDescriptorChildren(ADescriptortagnameBacktiksMctDescriptorChildren node)
    {
        defaultIn(node);
    }

    public void outADescriptortagnameBacktiksMctDescriptorChildren(ADescriptortagnameBacktiksMctDescriptorChildren node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADescriptortagnameBacktiksMctDescriptorChildren(ADescriptortagnameBacktiksMctDescriptorChildren node)
    {
        inADescriptortagnameBacktiksMctDescriptorChildren(node);
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getDescriptorLabelnameBacktiks() != null)
        {
            node.getDescriptorLabelnameBacktiks().apply(this);
        }
        outADescriptortagnameBacktiksMctDescriptorChildren(node);
    }

    public void inADescriptorTagname(ADescriptorTagname node)
    {
        defaultIn(node);
    }

    public void outADescriptorTagname(ADescriptorTagname node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADescriptorTagname(ADescriptorTagname node)
    {
        inADescriptorTagname(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        {
            List<PDescriptorTagnameChildren> copy = new ArrayList<PDescriptorTagnameChildren>(node.getDescriptorTagnameChildren());
            for(PDescriptorTagnameChildren e : copy)
            {
                e.apply(this);
            }
        }
        outADescriptorTagname(node);
    }

    public void inADescriptorTagnameChildren(ADescriptorTagnameChildren node)
    {
        defaultIn(node);
    }

    public void outADescriptorTagnameChildren(ADescriptorTagnameChildren node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADescriptorTagnameChildren(ADescriptorTagnameChildren node)
    {
        inADescriptorTagnameChildren(node);
        if(node.getDot() != null)
        {
            node.getDot().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outADescriptorTagnameChildren(node);
    }

    public void inADescriptorLabelnameBacktiks(ADescriptorLabelnameBacktiks node)
    {
        defaultIn(node);
    }

    public void outADescriptorLabelnameBacktiks(ADescriptorLabelnameBacktiks node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADescriptorLabelnameBacktiks(ADescriptorLabelnameBacktiks node)
    {
        inADescriptorLabelnameBacktiks(node);
        if(node.getSymbolBacktikText() != null)
        {
            node.getSymbolBacktikText().apply(this);
        }
        outADescriptorLabelnameBacktiks(node);
    }

    public void inASingleMctOutputtagOptions(ASingleMctOutputtagOptions node)
    {
        defaultIn(node);
    }

    public void outASingleMctOutputtagOptions(ASingleMctOutputtagOptions node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASingleMctOutputtagOptions(ASingleMctOutputtagOptions node)
    {
        inASingleMctOutputtagOptions(node);
        if(node.getMctOutputtagSingle() != null)
        {
            node.getMctOutputtagSingle().apply(this);
        }
        outASingleMctOutputtagOptions(node);
    }

    public void inAPairMctOutputtagOptions(APairMctOutputtagOptions node)
    {
        defaultIn(node);
    }

    public void outAPairMctOutputtagOptions(APairMctOutputtagOptions node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPairMctOutputtagOptions(APairMctOutputtagOptions node)
    {
        inAPairMctOutputtagOptions(node);
        if(node.getMctOutputtagPair() != null)
        {
            node.getMctOutputtagPair().apply(this);
        }
        outAPairMctOutputtagOptions(node);
    }

    public void inAMctOutputtagSingle(AMctOutputtagSingle node)
    {
        defaultIn(node);
    }

    public void outAMctOutputtagSingle(AMctOutputtagSingle node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMctOutputtagSingle(AMctOutputtagSingle node)
    {
        inAMctOutputtagSingle(node);
        if(node.getCodetagOpen() != null)
        {
            node.getCodetagOpen().apply(this);
        }
        if(node.getMctAttributeOutput() != null)
        {
            node.getMctAttributeOutput().apply(this);
        }
        if(node.getCodetagOpenEndtokenSingle() != null)
        {
            node.getCodetagOpenEndtokenSingle().apply(this);
        }
        outAMctOutputtagSingle(node);
    }

    public void inAMctOutputtagPair(AMctOutputtagPair node)
    {
        defaultIn(node);
    }

    public void outAMctOutputtagPair(AMctOutputtagPair node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMctOutputtagPair(AMctOutputtagPair node)
    {
        inAMctOutputtagPair(node);
        if(node.getMctOutputtagOpen() != null)
        {
            node.getMctOutputtagOpen().apply(this);
        }
        if(node.getMctOutputtagBody() != null)
        {
            node.getMctOutputtagBody().apply(this);
        }
        if(node.getMctOutputtagClose() != null)
        {
            node.getMctOutputtagClose().apply(this);
        }
        outAMctOutputtagPair(node);
    }

    public void inAMctAttributeOutput(AMctAttributeOutput node)
    {
        defaultIn(node);
    }

    public void outAMctAttributeOutput(AMctAttributeOutput node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMctAttributeOutput(AMctAttributeOutput node)
    {
        inAMctAttributeOutput(node);
        if(node.getCodetagAttribOutput() != null)
        {
            node.getCodetagAttribOutput().apply(this);
        }
        {
            List<PMctDescriptorChildren> copy = new ArrayList<PMctDescriptorChildren>(node.getMctDescriptorChildren());
            for(PMctDescriptorChildren e : copy)
            {
                e.apply(this);
            }
        }
        outAMctAttributeOutput(node);
    }

    public void inAMctOutputtagOpen(AMctOutputtagOpen node)
    {
        defaultIn(node);
    }

    public void outAMctOutputtagOpen(AMctOutputtagOpen node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMctOutputtagOpen(AMctOutputtagOpen node)
    {
        inAMctOutputtagOpen(node);
        if(node.getCodetagOpen() != null)
        {
            node.getCodetagOpen().apply(this);
        }
        if(node.getMctAttributeOutput() != null)
        {
            node.getMctAttributeOutput().apply(this);
        }
        if(node.getCodetagEndtoken() != null)
        {
            node.getCodetagEndtoken().apply(this);
        }
        outAMctOutputtagOpen(node);
    }

    public void inAMctOutputtagClose(AMctOutputtagClose node)
    {
        defaultIn(node);
    }

    public void outAMctOutputtagClose(AMctOutputtagClose node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMctOutputtagClose(AMctOutputtagClose node)
    {
        inAMctOutputtagClose(node);
        if(node.getCodetagClose() != null)
        {
            node.getCodetagClose().apply(this);
        }
        if(node.getMctAttributeOutput() != null)
        {
            node.getMctAttributeOutput().apply(this);
        }
        if(node.getOutputtagCloseEndtoken() != null)
        {
            node.getOutputtagCloseEndtoken().apply(this);
        }
        outAMctOutputtagClose(node);
    }

    public void inAMctOutputtagBody(AMctOutputtagBody node)
    {
        defaultIn(node);
    }

    public void outAMctOutputtagBody(AMctOutputtagBody node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMctOutputtagBody(AMctOutputtagBody node)
    {
        inAMctOutputtagBody(node);
        outAMctOutputtagBody(node);
    }
}
