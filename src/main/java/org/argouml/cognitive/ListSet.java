package org.argouml.cognitive;

public class ListSet {
    private ListSet listReach;

    public ListSet(Object dm) {
    }

    public ListSet() {

    }

    public ListSet reachable(Object instance) {
        return listReach;
    }

    public boolean contains(Object dm) {
        return true;
    }

    public Object get(int i) {
        return new Object();
    }

    public void add(Object sv) {
    }

    public int size() {
        return 10;
    }
}
