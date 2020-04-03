package Project1

import Project1.vcsRoots.*
import Project1.vcsRoots.Project1_HttpsGithubComPongsakonsTeamCityGit
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "a5508bec-3e04-4e79-b3f7-d75f5cd19547"
    extId = "Project1"
    parentId = "_Root"
    name = "Project 1"

    vcsRoot(Project1_HttpsGithubComPongsakonsTeamCityGit)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = Project1_HttpsGithubComPongsakonsTeamCityGit.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
