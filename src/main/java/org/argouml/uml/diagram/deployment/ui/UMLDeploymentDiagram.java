package org.argouml.uml.diagram.deployment.ui;

import org.argouml.model.Facade;
import org.argouml.model.FacadeEUMLImpl;

public class UMLDeploymentDiagram {
    public Facade getLayer() {
        return new FacadeEUMLImpl();
    }
}
