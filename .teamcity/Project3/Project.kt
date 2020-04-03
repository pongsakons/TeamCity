package Project3

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "uuid_Project3"
    extId = "Project3"
    parentId = "_Root"
    name = "Project 3 by kotlin"

    features {
        versionedSettings {
            id = "PROJECT_EXT_3"
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
