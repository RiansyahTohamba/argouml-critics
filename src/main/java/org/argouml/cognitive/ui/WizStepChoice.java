package org.argouml.cognitive.ui;

import org.argouml.uml.cognitive.critics.WizAssocComposite;
import org.argouml.uml.cognitive.critics.WizBreakCircularComp;
import org.argouml.uml.cognitive.critics.WizNavigable;

import java.util.List;

public class WizStepChoice extends WizStep{
    public WizStepChoice(WizAssocComposite wizAssocComposite, String instructions, List<String> opts) {
    }

    public WizStepChoice(WizBreakCircularComp wizBreakCircularComp, String instructions1, List<String> options1) {
        super();
    }

    public WizStepChoice(WizNavigable wizNavigable, String instructions, List<String> options) {
        super();
    }

    public void setTarget(Object toDoItem) {
    }

    public int getSelectedIndex() {
        return 10;
    }
}
