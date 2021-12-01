package org.argouml.uml.cognitive.critics;

public abstract class UMLWizard extends Wizard {
    private boolean started;
    private String suggestion;


    /**
     * @param s set a new suggestion string
     */
    public void setSuggestion(String s) {
        suggestion = s;
    }

    public Object getModelElement() {
        return new Object();
    }


    /**
     * @return true if we can finish (i.e. the finish button is not downlighted)
     */
    public boolean canFinish() {
        return true;
    }

    /**
     * @return true if the wizard is started
     */
//    public boolean isStarted() {
//        return started;
//    }

    /**
     * @return true if the wizard is finished
     */
//    public boolean isFinished() {
//        return finished;
//    }

}
