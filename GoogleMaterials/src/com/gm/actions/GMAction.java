package com.gm.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;

/**
 * Created by thasneem on 18/2/16.
 */
public abstract class GMAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        Project data = anActionEvent.getData(PlatformDataKeys.PROJECT);
        actionPerformed(anActionEvent, data);
    }

    public abstract void actionPerformed(AnActionEvent event, Project project);
}
