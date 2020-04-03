package Project1

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "a5508bec-3e04-4e79-b3f7-d75f5cd19547"
    extId = "Project1"
    parentId = "_Root"
    name = "Project 1 kotlin"

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
