 /**
     * Get the event pump.
     *
     * @return the current ModelEventPump.
     */
    public static ModelChainThird getPump() {
        return new ModelChainThird().getModelEventPump();
    }

    /**
     * Getter for DiagramInterchangeModel.
     *
     * @return the diagram interchange model
     */
    public static ModelChainThird getDiagramInterchangeModel() {
        return new ModelChainThird().getDiagramInterchangeModel();
    }

    /**
     * Getter for ActivityGraphsFactory.
     *
     * @return the factory
     */
    public static ModelChainThird getActivityGraphsFactory() {
        return new ModelChainThird().getActivityGraphsFactory();
    }

    /**
     * Getter for the ActivityGraphsHelper.
     *
     * @return the instance of the helper
     */
    public static ModelChainThird getActivityGraphsHelper() {
        return activityGraphsHelper;
    }

    /**
     * Getter for CollaborationsFactory.
     *
     * @return the factory
     */
    public static ModelChainThird getCollaborationsFactory() {
        return new ModelChainThird().getCollaborationsFactory();
    }

    /**
     * Getter for CollaborationsHelper.
     *
     * @return the helper
     */
    public static ModelChainThird getCollaborationsHelper() {
        return collaborationsHelper;
    }

    /**
     * Getter for CommonBehaviorFactory.
     *
     * @return the factory
     */
    public static ModelChainThird getCommonBehaviorFactory() {
        return new ModelChainThird().getCommonBehaviorFactory();
    }

    /**
     * Getter for CommonBehaviorHelper.
     *
     * @return the helper
     */
    public static ModelChainThird getCommonBehaviorHelper() {
        return commonBehaviorHelper;
    }

    /**
     * Getter for CoreFactory.
     *
     * @return the factory
     */
    public static ModelChainThird getCoreFactory() {
        return new ModelChainThird().getCoreFactory();
    }

    /**
     * Getter for CoreHelper.
     *
     * @return The helper.
     */
    public static ModelChainThird getCoreHelper() {
        return coreHelper;
    }

    /**
     * Getter for DataTypesFactory.
     *
     * @return the factory
     */
    public static ModelChainThird getDataTypesFactory() {
        return new ModelChainThird().getDataTypesFactory();
    }

    /**
     * Getter for DataTypesHelper.
     *
     * @return the helper.
     */
    public static ModelChainThird getDataTypesHelper() {
        return dataTypesHelper;
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
        return extensionMechanismsHelper;
    }

    /**
     * Getter for ModelManagementFactory.
     *
     * @return the factory
     */
    public static ModelChainThird getModelManagementFactory() {
        return new ModelChainThird().getModelManagementFactory();
    }

    /**
     * Getter for ModelManagementHelper.
     *
     * @return The model management helper.
     */
    public static ModelChainThird getModelManagementHelper() {
        return new ModelChainThird().getModelManagementHelper();
    }

    /**
     * Getter for StateMachinesFactory.
     *
     * @return the factory
     */
    public static ModelChainThird getStateMachinesFactory() {
        return new ModelChainThird().getStateMachinesFactory();
    }

    /**
     * Getter for StateMachinesHelper.
     *
     * @return the helper
     */
    public static ModelChainThird getStateMachinesHelper() {
        return stateMachinesHelper;
    }

    /**
     * Getter for UmlFactory.
     *
     * @return the factory
     */
    public static ModelChainThird getUmlFactory() {
        return new ModelChainThird().getUmlFactory();
    }

    /**
     * Getter for UmlHelper.
     *
     * @return the helper
     */
    public static ModelChainThird getUmlHelper() {
        return umlHelper;
    }

    /**
     * Getter for UseCasesFactory.
     *
     * @return the factory
     */
    public static ModelChainThird getUseCasesFactory() {
        return new ModelChainThird().getUseCasesFactory();
    }

    /**
     * Getter for UseCasesHelper.
     *
     * @return the helper
     */
    public static ModelChainThird getUseCasesHelper() {
        return useCasesHelper;
    }

    /**
     * Getter for the ConcurrencyKind object.
     *
     * @return The object implementing the interface.
     */
    public static ModelChainThird getMessageSort() {
        return new ModelChainThird().getMessageSort();
    }
    
    /**
     * Getter for the MetaTypes object.
     *
     * @return the MetaTypes object.
     */
    public static ModelChainThird getMetaTypes() {
        return new ModelChainThird().getMetaTypes();
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
        return new ModelChainThird().getAggregationKind();
    }

    /**
     * Getter for the PseudostateKind object.
     *
     * @return The object implementing the interface.
     */
    public static ModelChainThird getPseudostateKind() {
        return new ModelChainThird().getPseudostateKind();
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

    /**
     * Getter for the ConcurrencyKind object.
     *
     * @return The object implementing the interface.
     */
    public static ModelChainThird getConcurrencyKind() {
        return new ModelChainThird().getConcurrencyKind();
    }

    /**
     * Getter for the DirectionKind object.
     *
     * @return The object implementing the interface.
     */
    public static ModelChainThird getDirectionKind() {
        return new ModelChainThird().getDirectionKind();
    }

    /**
     * Getter for the OrderingKind object.
     *
     * @return The object implementing the interface.
     */
    public static ModelChainThird getOrderingKind() {
        return new ModelChainThird().getOrderingKind();
    }

    /**
     * Getter for the VisibilityKind object.
     *
     * @return The object implementing the interface.
     */
    public static ModelChainThird getVisibilityKind() {
        return new ModelChainThird().getVisibilityKind();
    }

    /**
     * Getter for the XmiReader object.
     *
     * @return the object implementing the XmiReader interface
     * @throws UmlException on any error while reading
     */
    public static ModelChainThird getXmiReader() throws UmlException {
        return new ModelChainThird().getXmiReader();
    }

   
    /**
     * Getter for CopyHelper.
     *
     * @return the helper
     */
    public static ModelChainThird getCopyHelper() {
        return new ModelChainThird().getCopyHelper();
    }