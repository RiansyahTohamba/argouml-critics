package org.argouml.cognitive.ui;

import org.argouml.cognitive.ui.WizStep;
import org.argouml.uml.cognitive.critics.WizManyNames;

import java.util.ArrayList;
import java.util.List;

public class WizStepManyTextFields extends WizStep {
    public WizStepManyTextFields(WizManyNames wizManyNames, String instructions, List<String> names) {
    }

    public List<String> getStringList() {
        return new ArrayList<String>();
    }
}
