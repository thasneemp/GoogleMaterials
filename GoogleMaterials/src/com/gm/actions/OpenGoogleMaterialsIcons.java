package com.gm.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

/**
 * Created by thasneem on 18/2/16.
 */
public class OpenGoogleMaterialsIcons extends GMAction {
    @Override
    public void actionPerformed(AnActionEvent event, Project project) {
        try {
            Desktop.getDesktop().browse(URI.create("https://design.google.com/icons/"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
