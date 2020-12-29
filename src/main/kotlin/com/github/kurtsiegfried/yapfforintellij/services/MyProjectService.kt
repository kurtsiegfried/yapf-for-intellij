package com.github.kurtsiegfried.yapfforintellij.services

import com.intellij.openapi.project.Project
import com.github.kurtsiegfried.yapfforintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
