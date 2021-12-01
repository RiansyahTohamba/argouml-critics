package org.argouml.uml.cognitive;
public class UMLDecision{
    /**
     * Decision type: INHERITANCE.
     */
    public static final UMLDecision INHERITANCE =
            new UMLDecision(
                    "misc.decision.inheritance", 1);

    /**
     * Decision type: CONTAINMENT.
     */
    public static final UMLDecision CONTAINMENT =
            new UMLDecision(
                    "misc.decision.containment", 1);

    /**
     * Decision type: PATTERNS.
     */
    public static final UMLDecision PATTERNS =
            new UMLDecision(
                    "misc.decision.design-patterns", 1); //??

    /**
     * Decision type: RELATIONSHIPS.
     */
    public static final UMLDecision RELATIONSHIPS =
            new UMLDecision(
                    "misc.decision.relationships", 1);

    /**
     * Decision type: STORAGE.
     */
    public static final UMLDecision STORAGE =
            new UMLDecision(
                    "misc.decision.storage", 1);

    /**
     * Decision type: BEHAVIOR.
     */
    public static final UMLDecision BEHAVIOR =
            new UMLDecision(
                    "misc.decision.behavior", 1);

    /**
     * Decision type: INSTANCIATION.
     */
    public static final UMLDecision INSTANCIATION =
            new UMLDecision(
                    "misc.decision.instantiation", 1);

    /**
     * Decision type: NAMING.
     */
    public static final UMLDecision NAMING =
            new UMLDecision(
                    "misc.decision.naming", 1);

    /**
     * Decision type: MODULARITY.
     */
    public static final UMLDecision MODULARITY =
            new UMLDecision(
                    "misc.decision.modularity", 1);

    /**
     * Decision type: CLASS_SELECTION.
     */
    public static final UMLDecision CLASS_SELECTION =
            new UMLDecision(
                    "misc.decision.class-selection", 1);

    /**
     * Decision type: EXPECTED_USAGE.
     */
    public static final UMLDecision EXPECTED_USAGE =
            new UMLDecision(
                    "misc.decision.expected-usage", 1);

    /**
     * Decision type: METHODS.
     */
    public static final UMLDecision METHODS =
            new UMLDecision(
                    "misc.decision.methods", 1); //??

    /**
     * Decision type: CODE_GEN.
     */
    public static final UMLDecision CODE_GEN =
            new UMLDecision(
                    "misc.decision.code-generation", 1); //??

    /**
     * Decision type: PLANNED_EXTENSIONS.
     */
    public static final UMLDecision PLANNED_EXTENSIONS =
            new UMLDecision(
                    "misc.decision.planned-extensions", 1);

    /**
     * Decision type: STEREOTYPES.
     */
    public static final UMLDecision STEREOTYPES =
            new UMLDecision(
                    "misc.decision.stereotypes", 1);

    /**
     * Decision type: STATE_MACHINES.
     */
    public static final UMLDecision STATE_MACHINES =
            new UMLDecision(
                    "misc.decision.mstate-machines", 1);

    public UMLDecision(String s, int i) {
    }


}
