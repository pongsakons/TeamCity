package _Root

import _Root.vcsRoots.*
import _Root.vcsRoots.HttpsGithubComPongsakonsTeamCityGit
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "529e17f3-d559-445d-bab3-22489b96868c"
    extId = "_Root"
    name = "<Root project>"
    description = "Contains all other projects"

    vcsRoot(HttpsGithubComPongsakonsTeamCityGit)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = HttpsGithubComPongsakonsTeamCityGit.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }

    cleanup {
        preventDependencyCleanup = false
    }
})
