package Project2_Build

import Project2_Build.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "2018b9a6-0e90-497a-8721-627e71930c0a"
    extId = "Project2_Build"
    parentId = "Project2"
    name = "Build"

    buildType(Project2_Build_BuildStep1)
})
