package Project1_Build

import Project1_Build.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "eaba678f-6074-479c-91ba-dd14c656fb3d"
    extId = "Project1_Build"
    parentId = "Project1"
    name = "Build"

    buildType(Project1_Build_BuildStep1)
	buildType(Project1_Build_BuildStep2_by_kotlin)
})
