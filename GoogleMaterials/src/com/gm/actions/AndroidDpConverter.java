package com.gm.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

/**
 * Created by muhammed on 1/30/2017.
 */
public class AndroidDpConverter extends GMAction {

    @Override
    public void actionPerformed(AnActionEvent event, Project project) {
        try {
            Desktop.getDesktop().browse(URI.create("http://jennift.com/dpical.html"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
