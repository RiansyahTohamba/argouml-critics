package org.argouml.model;

import java.util.Collection;
import java.util.List;

public class CoreHelperEUMLImpl implements CoreHelper{
    @Override
    public boolean isSubType(Object type, Object subType) {
        return false;
    }

    @Override
    public Collection getAllSupertypes(Object element) {
        return null;
    }

    @Override
    public Collection getSupertypes(Object generalizableElement) {
        return null;
    }

    @Override
    public Collection getUtilizedElements(Object artifact) {
        return null;
    }

    @Override
    public Collection getAssociateEndsInh(Object classifier) {
        return null;
    }

    @Override
    public void removeFeature(Object cls, Object feature) {

    }

    @Override
    public void removeLiteral(Object enumeration, Object literal) {

    }

    @Override
    public void setOperations(Object classifier, List operations) {

    }

    @Override
    public void setAttributes(Object classifier, List attributes) {

    }

    @Override
    public Collection getAttributesInh(Object classifier) {
        return null;
    }

    @Override
    public Collection getOperationsInh(Object classifier) {
        return null;
    }

    @Override
    public Collection getParents(Object generalizableElement) {
        return null;
    }

    @Override
    public List getReturnParameters(Object bf) {
        return null;
    }

    @Override
    public Object getSpecification(Object object) {
        return null;
    }

    @Override
    public Collection getSubtypes(Object cls) {
        return null;
    }

    @Override
    public Collection getAllBehavioralFeatures(Object element) {
        return null;
    }

    @Override
    public List getBehavioralFeatures(Object classifier) {
        return null;
    }

    @Override
    public Collection getAllInterfaces(Object ns) {
        return null;
    }

    @Override
    public Collection getAllClasses(Object ns) {
        return null;
    }

    @Override
    public Collection getRealizedInterfaces(Object cls) {
        return null;
    }

    @Override
    public Collection getExtendedClassifiers(Object element) {
        return null;
    }

    @Override
    public Object getGeneralization(Object achild, Object aparent) {
        return null;
    }

    @Override
    public String getBody(Object comment) {
        return null;
    }

    @Override
    public Collection getFlows(Object source, Object target) {
        return null;
    }

    @Override
    public Collection getExtendingElements(Object element) {
        return null;
    }

    @Override
    public Collection getExtendingClassifiers(Object classifier) {
        return null;
    }

    @Override
    public Collection getAllComponents(Object ns) {
        return null;
    }

    @Override
    public Collection getAllDataTypes(Object ns) {
        return null;
    }

    @Override
    public Collection getAllNodes(Object ns) {
        return null;
    }

    @Override
    public Collection getAssociatedClassifiers(Object aclassifier) {
        return null;
    }

    @Override
    public Collection getAssociations(Object from, Object to) {
        return null;
    }

    @Override
    public Collection getAllClassifiers(Object namespace) {
        return null;
    }

    @Override
    public Collection getAssociations(Object oclassifier) {
        return null;
    }

    @Override
    public Object getAssociationEnd(Object type, Object assoc) {
        return null;
    }

    @Override
    public Collection getAllAttributes(Object classifier) {
        return null;
    }

    @Override
    public Collection getAllVisibleElements(Object ns) {
        return null;
    }

    @Override
    public Object getSource(Object relationship) {
        return null;
    }

    @Override
    public Object getDestination(Object relationship) {
        return null;
    }

    @Override
    public Collection getDependencies(Object supplier, Object client) {
        return null;
    }

    @Override
    public Object getPackageImport(Object supplier, Object client) {
        return null;
    }

    @Override
    public Collection getPackageImports(Object client) {
        return null;
    }

    @Override
    public Collection getRelationships(Object source, Object dest) {
        return null;
    }

    @Override
    public boolean isValidNamespace(Object element, Object namespace) {
        return false;
    }

    @Override
    public Object getFirstSharedNamespace(Object ns1, Object ns2) {
        return null;
    }

    @Override
    public Collection getAllPossibleNamespaces(Object modelElement, Object model) {
        return null;
    }

    @Override
    public Collection getChildren(Object element) {
        return null;
    }

    @Override
    public Collection getAllRealizedInterfaces(Object element) {
        return null;
    }

    @Override
    public boolean hasCompositeEnd(Object association) {
        return false;
    }

    @Override
    public boolean equalsAggregationKind(Object associationEnd, String kindType) {
        return false;
    }

    @Override
    public void removeAnnotatedElement(Object handle, Object me) {

    }

    @Override
    public void removeClientDependency(Object handle, Object dep) {

    }

    @Override
    public void removeConstraint(Object handle, Object cons) {

    }

    @Override
    public void removeOwnedElement(Object handle, Object value) {

    }

    @Override
    public void removeParameter(Object handle, Object parameter) {

    }

    @Override
    public void removeQualifier(Object handle, Object qualifier) {

    }

    @Override
    public void removeSourceFlow(Object handle, Object flow) {

    }

    @Override
    public void removeSupplierDependency(Object supplier, Object dependency) {

    }

    @Override
    public void removeTargetFlow(Object handle, Object flow) {

    }

    @Override
    public void removeTemplateArgument(Object binding, Object argument) {

    }

    @Override
    public void removeTemplateParameter(Object handle, Object parameter) {

    }

    @Override
    public void addAnnotatedElement(Object comment, Object annotatedElement) {

    }

    @Override
    public void addClient(Object dependency, Object element) {

    }

    @Override
    public void addClientDependency(Object handle, Object dependency) {

    }

    @Override
    public void addComment(Object element, Object comment) {

    }

    @Override
    public void addConnection(Object handle, Object connection) {

    }

    @Override
    public void addConnection(Object handle, int position, Object connection) {

    }

    @Override
    public void addConstraint(Object handle, Object mc) {

    }

    @Override
    public void addDeploymentLocation(Object handle, Object node) {

    }

    @Override
    public void addFeature(Object handle, int index, Object f) {

    }

    @Override
    public void addLiteral(Object handle, int index, Object literal) {

    }

    @Override
    public void addFeature(Object handle, Object f) {

    }

    @Override
    public void addLink(Object handle, Object link) {

    }

    @Override
    public void addManifestation(Object handle, Object manifestation) {

    }

    @Override
    public void addMethod(Object handle, Object method) {

    }

    @Override
    public void addOwnedElement(Object handle, Object me) {

    }

    @Override
    public void addParameter(Object handle, int index, Object parameter) {

    }

    @Override
    public void addParameter(Object handle, Object parameter) {

    }

    @Override
    public void addQualifier(Object handle, int position, Object qualifier) {

    }

    @Override
    public void addRaisedSignal(Object handle, Object sig) {

    }

    @Override
    public void addRaisedException(Object handle, Object exception) {

    }

    @Override
    public void addSourceFlow(Object handle, Object flow) {

    }

    @Override
    public void addSupplier(Object handle, Object element) {

    }

    @Override
    public void addSupplierDependency(Object supplier, Object dependency) {

    }

    @Override
    public void addTargetFlow(Object handle, Object flow) {

    }

    @Override
    public void addTemplateArgument(Object handle, int index, Object argument) {

    }

    @Override
    public void addTemplateArgument(Object handle, Object argument) {

    }

    @Override
    public void addTemplateParameter(Object handle, int index, Object parameter) {

    }

    @Override
    public void addTemplateParameter(Object handle, Object parameter) {

    }

    @Override
    public void setAbstract(Object handle, boolean isAbstract) {

    }

    @Override
    public void setActive(Object handle, boolean isActive) {

    }

    @Override
    public void setAggregation(Object handle, Object aggregationKind) {

    }

    @Override
    public void setAggregation1(Object handle, Object aggregationKind) {

    }

    @Override
    public void setAggregation2(Object handle, Object aggregationKind) {

    }

    @Override
    public void setAnnotatedElements(Object handle, Collection elems) {

    }

    @Override
    public void setAssociation(Object handle, Object association) {

    }

    @Override
    public void setLeaf(Object handle, boolean isLeaf) {

    }

    @Override
    public void setRaisedSignals(Object handle, Collection raisedSignals) {

    }

    @Override
    public void setBody(Object handle, Object expr) {

    }

    @Override
    public void setChangeability(Object handle, Object ck) {

    }

    @Override
    public void setReadOnly(Object handle, boolean isReadOnly) {

    }

    @Override
    public void setChild(Object handle, Object child) {

    }

    @Override
    public void setConcurrency(Object handle, Object concurrencyKind) {

    }

    @Override
    public void setConnections(Object handle, Collection ends) {

    }

    @Override
    public void setDefaultElement(Object handle, Object element) {

    }

    @Override
    public void setDefaultValue(Object handle, Object expression) {

    }

    @Override
    public void setDiscriminator(Object handle, String discriminator) {

    }

    @Override
    public void setFeature(Object classifier, int index, Object feature) {

    }

    @Override
    public void setFeatures(Object classifier, Collection features) {

    }

    @Override
    public void setContainer(Object handle, Object component) {

    }

    @Override
    public void setInitialValue(Object attribute, Object expression) {

    }

    @Override
    public void setKind(Object handle, Object kind) {

    }

    @Override
    public void setModelElementContainer(Object handle, Object container) {

    }

    @Override
    public void setMultiplicity(Object handle, Object arg) {

    }

    @Override
    public void setMultiplicity(Object handle, String arg) {

    }

    @Override
    public void setMultiplicity(Object handle, int lower, int upper) {

    }

    @Override
    public void setName(Object handle, String name) {

    }

    @Override
    public void setBody(Object handle, String body) {

    }

    @Override
    public void setNamespace(Object handle, Object ns) {

    }

    @Override
    public void setNavigable(Object handle, boolean flag) {

    }

    @Override
    public void setOrdering(Object handle, Object ordering) {

    }

    @Override
    public void setOwner(Object handle, Object owner) {

    }

    @Override
    public void setStatic(Object element, boolean isStatic) {

    }

    @Override
    public void setParameter(Object handle, Object parameter) {

    }

    @Override
    public void setParameters(Object handle, Collection parameters) {

    }

    @Override
    public void setParent(Object handle, Object parent) {

    }

    @Override
    public void setPowertype(Object handle, Object powerType) {

    }

    @Override
    public void setQualifiers(Object handle, List qualifiers) {

    }

    @Override
    public void setQuery(Object handle, boolean isQuery) {

    }

    @Override
    public void setResident(Object handle, Object resident) {

    }

    @Override
    public void setResidents(Object handle, Collection residents) {

    }

    @Override
    public void setRoot(Object handle, boolean isRoot) {

    }

    @Override
    public void setSources(Object handle, Collection specifications) {

    }

    @Override
    public void setSpecification(Object handle, boolean isSpecification) {

    }

    @Override
    public void setSpecification(Object method, Object specification) {

    }

    @Override
    public void setSpecification(Object operation, String specification) {

    }

    @Override
    public void setSpecifications(Object handle, Collection specifications) {

    }

    @Override
    public void addStereotype(Object modelElement, Object stereo) {

    }

    @Override
    public void addAllStereotypes(Object modelElement, Collection stereos) {

    }

    @Override
    public void removeStereotype(Object handle, Object stereo) {

    }

    @Override
    public void clearStereotypes(Object handle) {

    }

    @Override
    public void setTaggedValue(Object handle, String tag, String value) {

    }

    @Override
    public void setTargetScope(Object handle, Object targetScope) {

    }

    @Override
    public void setType(Object handle, Object type) {

    }

    @Override
    public void setVisibility(Object handle, Object visibility) {

    }

    @Override
    public void removeDeploymentLocation(Object handle, Object node) {

    }

    @Override
    public void removeConnection(Object handle, Object connection) {

    }

    @Override
    public void addElementResidence(Object handle, Object residence) {

    }

    @Override
    public void removeElementResidence(Object handle, Object residence) {

    }

    @Override
    public void setEnumerationLiterals(Object enumeration, List literals) {

    }

    @Override
    public Collection<String> getAllMetatypeNames() {
        return null;
    }

    @Override
    public Collection<String> getAllMetaDatatypeNames() {
        return null;
    }
}
