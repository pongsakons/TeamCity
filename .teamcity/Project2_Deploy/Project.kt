package Project2_Deploy

import Project2_Deploy.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "302fafb5-f4f2-4c07-9ec6-bd4500056435"
    extId = "Project2_Deploy"
    parentId = "Project2"
    name = "Deploy"

    buildType(Project2_Deploy_DeployStep1)
})
