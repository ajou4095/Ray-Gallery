// gradle plugin 을 받아올 remote 선택
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

// 라이브러리를 받아올 remote 선택
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}

rootProject.name = "Ray Gallery"
include(":app")
include(":common")
include(":presentation")
include(":domain")
include(":data")
