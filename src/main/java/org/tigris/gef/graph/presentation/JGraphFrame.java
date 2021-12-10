// Copyright (c) 1996-99 The Regents of the University of California. All
// Rights Reserved. Permission to use, copy, modify, and distribute this
// software and its documentation without fee, and without a written
// agreement is hereby granted, provided that the above copyright notice
// and this paragraph appear in all copies.  This software program and
// documentation are copyrighted by The Regents of the University of
// California. The software program and documentation are supplied "AS
// IS", without any accompanying services from The Regents. The Regents
// does not warrant that the operation of the program will be
// uninterrupted or error-free. The end-user understands that the program
// was developed for research purposes and is advised not to rely
// exclusively on the program for any reason.  IN NO EVENT SHALL THE
// UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
// SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS,
// ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
// THE UNIVERSITY OF CALIFORNIA HAS BEEN ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE. THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
// MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
// PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND THE UNIVERSITY OF
// CALIFORNIA HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, SUPPORT,
// UPDATES, ENHANCEMENTS, OR MODIFICATIONS.

package org.tigris.gef.graph.presentation;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import org.tigris.gef.base.*;
import org.tigris.gef.ui.*;
import org.tigris.gef.undo.RedoAction;
import org.tigris.gef.undo.UndoAction;
import org.tigris.gef.event.*;
import org.tigris.gef.graph.*;
import org.tigris.gef.util.*;

/**
 * A window that displays a toolbar, a connected graph editing pane, and a
 * status bar.
 */

public class JGraphFrame extends JFrame implements IStatusBar, Cloneable,
        ModeChangeListener {

    private static final long serialVersionUID = -8167010467922210977L;
    /** The toolbar (shown at top of window). */
    private ToolBar _toolbar = new PaletteFig();
    /** The graph pane (shown in middle of window). */
    private JGraph _graph;
    /** A statusbar (shown at bottom ow window). */
    private JLabel _statusbar = new JLabel(" ");

    private JPanel _mainPanel = new JPanel(new BorderLayout());
    private JPanel _graphPanel = new JPanel(new BorderLayout());
    private JMenuBar _menubar = new JMenuBar();

    /**
     * Contruct a new JGraphFrame with the title "untitled" and a new
     * DefaultGraphModel.
     */
    public JGraphFrame() {
        this("untitled");
    }

    public JGraphFrame(boolean init_later) {
        super("untitled");
        if (!init_later)
            init(new JGraph());
    }

    /**
     * Contruct a new JGraphFrame with the given title and a new
     * DefaultGraphModel.
     */
    public JGraphFrame(String title) {
        this(title, new JGraph());
    }

    public JGraphFrame(String title, Editor ed) {
        this(title, new JGraph(ed));
    }

    /**
     * Contruct a new JGraphFrame with the given title and given JGraph. All
     * JGraphFrame contructors call this one.
     */
    public JGraphFrame(String title, JGraph jg) {
        super(title);
        init(jg);
    }

    public void init() {
        init(new JGraph());
    }

    public void init(JGraph jg) {
        _graph = jg;
        Container content = getContentPane();
        setUpMenus();
        content.setLayout(new BorderLayout());
        content.add(_menubar, BorderLayout.NORTH);
        _graphPanel.add(_graph, BorderLayout.CENTER);
        _graphPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));

        _mainPanel.add(_toolbar, BorderLayout.NORTH);
        _mainPanel.add(_graphPanel, BorderLayout.CENTER);
        content.add(_mainPanel, BorderLayout.CENTER);
        content.add(_statusbar, BorderLayout.SOUTH);
        setSize(300, 250);
        _graph.addModeChangeListener(this);
    }

    /**
     * Contruct a new JGraphFrame with the title "untitled" and the given
     * GraphModel.
     */
    public JGraphFrame(GraphModel gm) {
        this("untitled");
        setGraphModel(gm);
    }

    // //////////////////////////////////////////////////////////////
    // Cloneable implementation

    public Object clone() {
        return null; // needs-more-work
    }

    // //////////////////////////////////////////////////////////////
    // accessors

    public JGraph getGraph() {
        return _graph;
    }

    public GraphEdgeRenderer getGraphEdgeRenderer() {
        return _graph.getEditor().getGraphEdgeRenderer();
    }

    public GraphModel getGraphModel() {
        return _graph.getGraphModel();
    }

    public GraphNodeRenderer getGraphNodeRenderer() {
        return _graph.getEditor().getGraphNodeRenderer();
    }

    public JMenuBar getJMenuBar() {
        return _menubar;
    }

    public ToolBar getToolBar() {
        return _toolbar;
    }

    // //////////////////////////////////////////////////////////////
    // ModeChangeListener implementation
    public void modeChange(ModeChangeEvent mce) {
        // System.out.println("TabDiagram got mode change event");
        if (!Globals.getSticky() && Globals.mode() instanceof ModeSelect)
            _toolbar.unpressAllButtons();
    }

    public void setGraph(JGraph g) {
        _graph = g;
    }

    public void setGraphEdgeRenderer(GraphEdgeRenderer rend) {
        _graph.getEditor().setGraphEdgeRenderer(rend);
    }

    public void setGraphModel(GraphModel gm) {
        _graph.setGraphModel(gm);
    }

    public void setGraphNodeRenderer(GraphNodeRenderer rend) {
        _graph.getEditor().setGraphNodeRenderer(rend);
    }

    public void setJMenuBar(JMenuBar mb) {
        _menubar = mb;
        getContentPane().add(_menubar, BorderLayout.NORTH);
    }

    public void setToolBar(ToolBar tb) {
        _toolbar = tb;
        _mainPanel.add(_toolbar, BorderLayout.NORTH);
    }

    /**
     * Set up the menus and keystrokes for menu items. Subclasses can override
     * this, or you can use setMenuBar().
     */
    protected void setUpMenus() {
        JMenu file = getFile();
        setAccelaratorExitItem(file);
        JMenu edit = getEdit();
        setView();

        JMenu arrange = new JMenu(Localizer.localize("GefBase", "Arrange"));
        _menubar.add(arrange);
        arrange.setMnemonic('A');

        JMenuItem groupItem = arrange.add(new CmdGroup());
        groupItem.setMnemonic('G');

        setAlign(arrange);
        setDistribute(arrange);

        JMenu reorder = new JMenu(Localizer.localize("GefBase", "Reorder"));
        arrange.add(reorder);

        setNudge(arrange);
        setDeleteItem(edit);
        setUndoItem(edit);
        setRedoItem(edit);
        setCopyItem(edit);
        setPasteItem(edit);
        setBackItem(reorder);

        KeyStroke ctrlG = KeyStroke.getKeyStroke(KeyEvent.VK_G,KeyEvent.CTRL_MASK);
        groupItem.setAccelerator(ctrlG);

        setUngroup(arrange);

        JMenuItem toFrontItem = reorder.add(new CmdReorder(CmdReorder.BRING_TO_FRONT));
        KeyStroke sCtrlF = KeyStroke.getKeyStroke(KeyEvent.VK_F,KeyEvent.CTRL_MASK | KeyEvent.SHIFT_MASK);
        toFrontItem.setAccelerator(sCtrlF);

        setBackwardItem(reorder);
        setAccelaratorCtrlF(reorder);
    }

    private void setUngroup(JMenu arrange) {
        KeyStroke ctrlU = KeyStroke.getKeyStroke(KeyEvent.VK_U,KeyEvent.CTRL_MASK);
        JMenuItem ungroupItem = arrange.add(new CmdUngroup());
        ungroupItem.setMnemonic('U');
        ungroupItem.setAccelerator(ctrlU);
    }

    private void setDeleteItem(JMenu edit) {
        KeyStroke delKey = KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0);
        JMenuItem deleteItem = edit.add(new CmdRemoveFromGraph());
        deleteItem.setAccelerator(delKey);
    }

    private JMenu getEdit() {
        JMenu edit = new JMenu(Localizer.localize("GefBase", "Edit"));
        edit.setMnemonic('E');
        _menubar.add(edit);

        setSelect(edit);
        edit.addSeparator();
        edit.addSeparator();
        edit.add(new CmdUseReshape());
        edit.add(new CmdUseResize());
        edit.add(new CmdUseRotate());
        return edit;
    }

    private void setCopyItem(JMenu edit) {
        KeyStroke ctrlC = KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_MASK);
        JMenuItem copyItem = edit.add(new CmdCopy());
        copyItem.setMnemonic('C');
        copyItem.setAccelerator(ctrlC);
    }

    private void setPasteItem(JMenu edit) {
        KeyStroke ctrlV = KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_MASK);
        JMenuItem pasteItem = edit.add(new CmdPaste());
        pasteItem.setMnemonic('P');
        pasteItem.setAccelerator(ctrlV);
    }

    private void setUndoItem(JMenu edit) {
        UndoAction undoAct = new UndoAction(Localizer.localize("GefBase", "Undo"));
        KeyStroke ctrlZ = KeyStroke.getKeyStroke(KeyEvent.VK_Z,KeyEvent.CTRL_MASK);
        JMenuItem undoItem = edit.add(undoAct);
        undoItem.setMnemonic(Localizer.localize("GefBase", "UndoMnemonic").charAt(0));
        undoItem.setAccelerator(ctrlZ);
    }

    private void setRedoItem(JMenu edit) {
        JMenuItem redoItem = edit.add(new RedoAction(Localizer.localize("GefBase", "Redo")));
        redoItem.setMnemonic(Localizer.localize("GefBase", "RedoMnemonic").charAt(0));
        KeyStroke ctrlY = KeyStroke.getKeyStroke(KeyEvent.VK_Y,KeyEvent.CTRL_MASK);
        redoItem.setAccelerator(ctrlY);
    }

    private void setView() {
        JMenu view = new JMenu(Localizer.localize("GefBase", "View"));
        _menubar.add(view);
        view.setMnemonic('V');
        view.add(new CmdSpawn());
        view.add(new CmdShowProperties());
        view.addSeparator();
        view.add(new CmdAdjustGrid());
        view.add(new CmdAdjustGuide());
        view.add(new CmdAdjustPageBreaks());
    }

    private void setDistribute(JMenu arrange) {
        JMenu distribute = new JMenu(Localizer.localize("GefBase", "Distribute"));
        arrange.add(distribute);
        distribute.add(new DistributeAction(DistributeAction.H_SPACING));
        distribute.add(new DistributeAction(DistributeAction.H_CENTERS));
        distribute.add(new DistributeAction(DistributeAction.V_SPACING));
        distribute.add(new DistributeAction(DistributeAction.V_CENTERS));
    }

    private void setAlign(JMenu arrange) {
        JMenu align = new JMenu(Localizer.localize("GefBase", "Align"));
        arrange.add(align);
        align.add(new AlignAction(AlignAction.ALIGN_TOPS));
        align.add(new AlignAction(AlignAction.ALIGN_BOTTOMS));
        align.add(new AlignAction(AlignAction.ALIGN_LEFTS));
        align.add(new AlignAction(AlignAction.ALIGN_RIGHTS));
        align.add(new AlignAction(AlignAction.ALIGN_H_CENTERS));
        align.add(new AlignAction(AlignAction.ALIGN_V_CENTERS));
        align.add(new AlignAction(AlignAction.ALIGN_TO_GRID));
    }

    private void setBackwardItem(JMenu reorder) {
        JMenuItem backwardItem = reorder.add(new CmdReorder(CmdReorder.SEND_BACKWARD));
        KeyStroke ctrlB = KeyStroke.getKeyStroke(KeyEvent.VK_B, KeyEvent.CTRL_MASK);
        backwardItem.setAccelerator(ctrlB);
    }

    private void setBackItem(JMenu reorder) {
        JMenuItem toBackItem = reorder.add(new CmdReorder(CmdReorder.SEND_TO_BACK));
        KeyStroke sCtrlB = KeyStroke.getKeyStroke(KeyEvent.VK_B,KeyEvent.CTRL_MASK | KeyEvent.SHIFT_MASK);
        toBackItem.setAccelerator(sCtrlB);
    }

    private void setSelect(JMenu edit) {
        JMenu select = new JMenu(Localizer.localize("GefBase", "Select"));
        edit.add(select);

        select.add(new CmdSelectAll());
        select.add(new CmdSelectNext(false));
        select.add(new CmdSelectNext(true));
        select.add(new CmdSelectInvert());
    }

    private JMenu getFile() {
        JMenu file = new JMenu(Localizer.localize("GefBase", "File"));
        file.setMnemonic('F');
        _menubar.add(file);
        setAcceleratorOpen(file);
        setAccelaratorSave(file);
        file.add(new CmdSavePGML());
        file.add(new CmdSaveSVG());
        setAcceleratorPrint(file);
        file.add(new CmdOpenWindow("org.tigris.gef.base.PrefsEditor","Preferences..."));
        return file;
    }

    private void setAccelaratorExitItem(JMenu file) {
        JMenuItem exitItem = file.add(new CmdExit());
        KeyStroke altF4 = KeyStroke.getKeyStroke(KeyEvent.VK_F4,KeyEvent.ALT_MASK);
        exitItem.setAccelerator(altF4);
    }

    private void setAcceleratorOpen(JMenu file) {
        JMenuItem openItem = file.add(new CmdOpen());
        KeyStroke ctrlO = KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_MASK);
        openItem.setAccelerator(ctrlO);
    }

    private void setAccelaratorSave(JMenu file) {
        JMenuItem saveItem = file.add(new CmdSave());
        KeyStroke ctrlS = KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_MASK);
        saveItem.setAccelerator(ctrlS);
    }

    private void setAcceleratorPrint(JMenu file) {
        CmdPrint cmdPrint = new CmdPrint();
        JMenuItem printItem = file.add(cmdPrint);
        file.add(new CmdPrintPageSetup(cmdPrint));
        KeyStroke ctrlP = KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_MASK);
        printItem.setAccelerator(ctrlP);
    }

    private void setAccelaratorCtrlF(JMenu reorder) {
        JMenuItem forwardItem;
        KeyStroke ctrlF = KeyStroke.getKeyStroke(KeyEvent.VK_F,KeyEvent.CTRL_MASK);
        forwardItem = reorder.add(new CmdReorder(CmdReorder.BRING_FORWARD));
        forwardItem.setAccelerator(ctrlF);
    }

    private void setNudge(JMenu arrange) {
        JMenu nudge = new JMenu(Localizer.localize("GefBase", "Nudge"));
        arrange.add(nudge);
        nudge.add(new NudgeAction(NudgeAction.LEFT));
        nudge.add(new NudgeAction(NudgeAction.RIGHT));
        nudge.add(new NudgeAction(NudgeAction.UP));
        nudge.add(new NudgeAction(NudgeAction.DOWN));
    }

    // //////////////////////////////////////////////////////////////
    // display related methods

    public void setVisible(boolean b) {
        super.setVisible(b);
        if (b)
            Globals.setStatusBar(this);
    }

    // //////////////////////////////////////////////////////////////
    // IStatusListener implementation

    /** Show a message in the statusbar. */
    public void showStatus(String msg) {
        if (_statusbar != null)
            _statusbar.setText(msg);
    }
} /* end class JGraphFrame */
