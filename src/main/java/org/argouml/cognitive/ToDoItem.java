package org.argouml.cognitive;

import java.util.ArrayList;

public class ToDoItem {
    ////////////////////////////////////////////////////////////////
    // constants

    /**
     * The interruptive priority todoitem of 4 levels.
     */
    public static final int INTERRUPTIVE_PRIORITY = 9;

    /**
     * The high priority todoitem of 4 levels.
     */
    public static final int HIGH_PRIORITY = 1;

    /**
     * The medium priority todoitem of 4 levels.
     */
    public static final int MED_PRIORITY = 2;

    /**
     * The lowest priority todoitem of 4 levels.
     */
    public static final int LOW_PRIORITY = 3;
    private ListSet theOffenders = new ListSet();

//    public ToDoItem(Poster poster, String h, int p, String d, String m, ListSet offs) {
//    }

    public ToDoItem(Critic c, Object dm, Designer dsgr) {
    }


    public ListSet getOffenders() {
        return theOffenders;

    }
}
