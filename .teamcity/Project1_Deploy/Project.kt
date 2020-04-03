package Project1_Deploy

import Project1_Deploy.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "651cd744-c39c-470c-9826-c7a725b8942c"
    extId = "Project1_Deploy"
    parentId = "Project1"
    name = "Deploy"

    buildType(Project1_Deploy_DeployStep1)
})
