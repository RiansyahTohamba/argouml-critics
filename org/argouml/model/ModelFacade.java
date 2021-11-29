package org.argouml.model;

import java.util.Collections;

public class ModelFacade {

    public Object getTransition() {
        return null;
    }

    public boolean isAPseudostate(Object target) {
        return true;
    }
    public  boolean equalsPseudostateKind(Object ps1, Object ps2){
        return true;
    }

    public boolean isATransition(Object dm) {
        return true;
    }

    public Object getTarget(Object tr) {
        return true;
    }

    public Object getSource(Object tr) {
        return true;
    }

    public Object getKind(Object target) {
        return true;
    }
    
    public Object getJoin() {
        return true;
    }

    public boolean isAState(Object source) {
        return true;
    }

    public boolean isASynchState(Object dm) {
        return true;
    }

    public Iterable<Object> getOutgoings(Object dm) {
        return Collections.singleton(true);
    }

    public Object getContainer(Object target) {
        return true;
    }

    public boolean isAConcurrentRegion(Object destinationRegion) {
        return true;
    }

    public Object getSynchState() {
        return true;
    }

    public Iterable<Object> getIncomings(Object dm) {
        return Collections.singleton(true);
    }

    public Object getTrigger(Object tr) {
        return true;
    }

    public Object getFork() {
        return true;
    }

    public String getName(Object t) {
        return "hai";
    }

    public Object getGuard(Object tr) {
        return true;

    }

    public Object getExpression(Object g) {
        return true;

    }

    public Object getBody(Object expression) {
        return true;
    }
}
