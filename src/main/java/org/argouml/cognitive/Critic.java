package org.argouml.cognitive;
public class Critic{
    ////////////////////////////////////////////////////////////////
    // constants

    /**
     * PROBLEM_FOUND is used for the result of the check of a critic.
     */
    public static final boolean PROBLEM_FOUND = true;

    /**
     * NO_PROBLEM is used for the result of the check of a critic.
     */
    public static final boolean NO_PROBLEM = false;

    /**
     * Type of knowledge that critics can deliver.
     */
    public static final String KT_DESIGNERS =
            Translator.localize("misc.knowledge.designers");

    /**
     * Type of knowledge that critics can deliver.
     */
    public static final String KT_CORRECTNESS =
            Translator.localize("misc.knowledge.correctness");

    /**
     * Type of knowledge that critics can deliver.
     */
    public static final String KT_COMPLETENESS =
            Translator.localize("misc.knowledge.completeness");

    /**
     * Type of knowledge that critics can deliver.
     */
    public static final String KT_CONSISTENCY =
            Translator.localize("misc.knowledge.consistency");

    /**
     * Type of knowledge that critics can deliver.
     */
    public static final String KT_SYNTAX =
            Translator.localize("misc.knowledge.syntax");

    /**
     * Type of knowledge that critics can deliver.
     */
    public static final String KT_SEMANTICS =
            Translator.localize("misc.knowledge.semantics");

    /**
     * Type of knowledge that critics can deliver.
     */
    public static final String KT_OPTIMIZATION =
            Translator.localize("misc.knowledge.optimization");

    /**
     * Type of knowledge that critics can deliver.
     */
    public static final String KT_PRESENTATION =
            Translator.localize("misc.knowledge.presentation");

    public boolean isActive() { return true; }
}
