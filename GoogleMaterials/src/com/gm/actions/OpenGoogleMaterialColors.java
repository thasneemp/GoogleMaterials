package com.gm.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

/**
 * Created by thasneem on 18/2/16.
 */
public class OpenGoogleMaterialColors extends GMAction {
    @Override
    public void actionPerformed(AnActionEvent event, Project project) {
        try {
            Desktop.getDesktop().browse(URI.create("https://www.google.com/design/spec/style/color.html#"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
