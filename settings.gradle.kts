pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "1project"
include(":app")
include(":practice1:layouttype")
include(":practice1:control_lesson1")
include(":practice1:buttonclicker")
include(":practice2:ActivityLifecycle")
include(":practice2:MultiActivity")
include(":practice2:IntentFilter")
include(":practice2:Dialog")