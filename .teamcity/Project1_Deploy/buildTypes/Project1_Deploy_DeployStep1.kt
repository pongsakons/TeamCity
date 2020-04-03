package Project1_Deploy.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object Project1_Deploy_DeployStep1 : BuildType({
    uuid = "14f17435-f6ec-4637-b82e-0a5ff0fbcb5f"
    extId = "Project1_Deploy_DeployStep1"
    name = "Deploy Step1"

    steps {
        powerShell {
            scriptMode = script {
                content = "Write-Host 'Hello, World! This is Deploy Step 1'"
            }
            param("jetbrains_powershell_noprofile", "")
        }
    }
})
