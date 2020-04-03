package Project1.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Project1_HttpsGithubComPongsakonsTeamCityGit : GitVcsRoot({
    uuid = "3f41114c-f540-4cbd-a37b-02b093f87987"
    extId = "Project1_HttpsGithubComPongsakonsTeamCityGit"
    name = "https://github.com/pongsakons/TeamCity.git"
    url = "https://github.com/pongsakons/TeamCity.git"
    pushUrl = "https://github.com/pongsakons/TeamCity.git"
    authMethod = password {
        userName = "lljobzll@gmail.com"
        password = "zxxe51ee581e621fc84536a007319aba2c8"
    }
})
