// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.jetbrains.tutorials.sample.actions;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 * @author Anna Bulenkova
 */
public class SimpleAction extends AnAction {
  @Override
  public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
  }

  @Override
  public void update(@NotNull AnActionEvent e) {
    //Make action visible and available only when project is defined
    final Project project = e.getProject();
    boolean isAvailable = project != null;
    e.getPresentation().setVisible(isAvailable);
    e.getPresentation().setEnabled(isAvailable);
  }
}
