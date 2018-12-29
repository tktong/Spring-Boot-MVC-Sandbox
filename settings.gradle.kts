pluginManagement {
    resolutionStrategy {
        eachPlugin {
            when(requested.id.id) {
                "org.springframework.boot" -> useVersion(Versions.SPRING_BOOT)
            }
        }
    }
}

rootProject.name = "Spring Boot Sample"