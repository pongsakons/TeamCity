package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object HttpsGithubComPongsakonsTeamCityGit : GitVcsRoot({
    uuid = "ab3cfbed-2475-44b8-aeb5-2ded128125cd"
    extId = "HttpsGithubComPongsakonsTeamCityGit"
    name = "https://github.com/pongsakons/TeamCity.git"
    url = "https://github.com/pongsakons/TeamCity.git"
    pushUrl = "https://github.com/pongsakons/TeamCity.git"
    authMethod = password {
        userName = "lljobzll@gmail.com"
        password = "zxxe51ee581e621fc84536a007319aba2c8"
    }
})
