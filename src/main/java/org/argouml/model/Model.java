package org.argouml.model;

public class Model{
    public static Facade getFacade() {
        ModelImplementation impl = new ModelImplementation();
        return impl.getFacade();
    }

    public static PseudostateKind getPseudostateKind() {
        return new PseudostateKindEUMLImpl();
    }
    /**
     * Getter for CoreHelper.
     *
     * @return The helper.
     */
    public static CoreHelper getCoreHelper() {
        return new CoreHelperEUMLImpl();
    }
    /**
     * Getter for ExtensionMechanismsFactory.
     *
     * @return the factory instance.
     */
    public static ModelChainThird getExtensionMechanismsFactory() {
        return new ModelChainThird().getExtensionMechanismsFactory();
    }

    /**
     * Getter for ExtensionMechanismsHelper.
     *
     * @return the helper
     */
    public static ModelChainThird getExtensionMechanismsHelper() {
        return new ModelChainThird();
    }

    /**
     * Getter for ModelManagementFactory.
     *
     * @return the factory
     */
    public static ModelChainThird getModelManagementFactory() {
        return new ModelChainThird();
    }

    /**
     * Getter for StateMachinesHelper.
     *
     * @return the helper
     */
    public static ModelChainThird getStateMachinesHelper() {
        return new ModelChainThird();
    }

    /**
     * Getter for the MetaTypes object.
     *
     * @return the MetaTypes object.
     */
    public static MetaTypes getMetaTypes() {
        return new MetaTypesEUMLImpl();
    }

    // Here follows the interfaces that contain the enums of different
    // kinds in the UML meta-model.
    /**
     * Getter for the ChangeableKind object.
     *
     * @return The object implementing the interface.
     * @deprecated for 0.25.4 by tfmorris. This enumeration has been removed
     *             from UML 2. Use the getter for the isReadOnly attribute.
     */
    @Deprecated
    public static ModelChainThird getChangeableKind() {
        return new ModelChainThird().getChangeableKind();
    }

    /**
     * Getter for the AggregationKind object.
     *
     * @return The object implementing the interface.
     */
    public static ModelChainThird getAggregationKind() {
        return new ModelChainThird();
    }


    /**
     * Getter for the ScopeKind object.
     *
     * @return The object implementing the interface.
     * @deprecated for 0.25.4 by tfmorris. This has been removed from UML 2. Use
     *             {@link Facade#isStatic(Object)} instead.
     */
    @Deprecated
    public static ModelChainThird getScopeKind() {
        return new ModelChainThird().getScopeKind();
    }

}
