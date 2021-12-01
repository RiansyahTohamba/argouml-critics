package org.argouml.uml.cognitive;

import org.argouml.cognitive.Critic;
import org.argouml.cognitive.Designer;
import org.argouml.cognitive.ListSet;
import org.argouml.cognitive.ToDoItem;
import org.argouml.uml.cognitive.critics.CrCircularComposition;
import org.argouml.uml.cognitive.critics.CrMultipleDeepHistoryStates;
import org.argouml.uml.cognitive.critics.CrMultipleInitialStates;
import org.argouml.uml.cognitive.critics.CrMultipleShallowHistoryStates;

public class UMLToDoItem extends ToDoItem {

    /**
     * The constructor.
     *
     * @param poster the poster
     * @param h the headline
     * @param p the priority
     * @param d the description
     * @param m the more-info-url
     * @param offs the offenders
     */
//    public UMLToDoItem(Poster poster, String h, int p, String d, String m,
//                       ListSet offs) {
//        super(poster, h, p, d, m, offs);
//    }

    /**
     * The constructor.
     *
     * @param poster the poster
     * @param h the headline
     * @param p the priority
     * @param d the description
     * @param m the more-info-url
     */
//    public UMLToDoItem(Poster poster, String h, int p, String d, String m) {
//        super(poster, h, p, d, m);
//    }

    /**
     * The constructor.
     *
     * @param c the poster (critic)
     * @param dm the offenders
     * @param dsgr the designer
     */
    public UMLToDoItem(Critic c, Object dm, Designer dsgr) {
        super(c, dm, dsgr);
    }

    /**
     * The constructor.
     *
     * @param c the poster (critic)
     * @param offs the offenders
     * @param dsgr the designer
     */
    public UMLToDoItem(Critic c, ListSet offs, Designer dsgr) {
        super(c, offs, dsgr);
    }

    /**
     * The constructor.
     *
     * @param c the critic that created this todoitem
     */
//    public UMLToDoItem(Critic c) {
//        super(c);
//    }

}
