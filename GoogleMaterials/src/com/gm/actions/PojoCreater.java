package com.gm.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class PojoCreater extends GMAction {
    @Override
    public void actionPerformed(AnActionEvent event, Project project) {
        try {
            Desktop.getDesktop().browse(URI.create("http://www.jsonschema2pojo.org/"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
