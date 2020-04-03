package Project2_Build.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object Project2_Build_BuildStep1 : BuildType({
    uuid = "a1141500-a7f8-4f30-a060-1dbc59b1913f"
    extId = "Project2_Build_BuildStep1"
    name = "Build step1"

    steps {
        powerShell {
            scriptMode = script {
                content = "Write-Host 'Hello, World! This is Build Step 1'"
            }
            param("jetbrains_powershell_noprofile", "")
        }
    }
})
