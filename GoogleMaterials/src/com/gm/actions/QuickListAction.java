package com.gm.actions;

import com.intellij.ide.actions.QuickSwitchSchemeAction;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;

/**
 * Created by thasneem on 18/2/16.
 */
public class QuickListAction extends QuickSwitchSchemeAction implements DumbAware {
    @Override
    protected void fillActions(Project project, DefaultActionGroup defaultActionGroup, DataContext dataContext) {
        if (project == null) {
            return;
        }
        addAction("com.gm.actions.OpenGoogleMaterialColors", defaultActionGroup);
        addAction("com.gm.actions.OpenGoogleMaterialsIcons", defaultActionGroup);
        addAction("com.gm.actions.AndroidDpConverter", defaultActionGroup);
        addAction("com.gm.actions.JSONViewer", defaultActionGroup);
    }

    private void addAction(String actionID, DefaultActionGroup group) {

        AnAction action = ActionManager.getInstance().getAction(actionID);
        if (action != null) {
            group.add(action);
        }
    }

    @Override
    protected String getPopupTitle(AnActionEvent e) {
        return "Useful Google sites";
    }

    @Override
    protected boolean isEnabled() {
        return true;
    }
}
