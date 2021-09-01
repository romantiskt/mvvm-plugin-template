package com.github.romantiskt.mvvmplugintemplate.services

import com.github.romantiskt.mvvmplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
