package org.argouml.uml.cognitive.critics;

import org.argouml.cognitive.Critic;
import org.argouml.cognitive.Designer;

public class CrUML extends Critic {

    protected void addTrigger(String trigger) {
    }
    protected void setupHeadAndDesc() {
    }
    public void addSupportedDecision(Object stateMachines) {
    }
    public boolean predicate2(){
        return true;
    }

    public void setPriority(Object lowPriority) {
    }

    public void setKnowledgeTypes(Object ktSyntax) {
    }
    public void setKnowledgeTypes(String ktCompleteness, String ktSyntax) {
    }

    public boolean predicate(Object dm, Designer dsgr) {
        return true;
//        if (Model.getFacade().isAModelElement(dm)
//                && Model.getUmlFactory().isRemoved(dm)) {
//            return NO_PROBLEM;
//        } else {
//            return predicate2(dm, dsgr);
//        }
    }

    protected String getInstructions() {
        return "";
    }

    protected String getDefaultSuggestion() {
        return "";
    }
}
