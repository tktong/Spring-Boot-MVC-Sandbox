pluginManagement {
    resolutionStrategy {
        eachPlugin {
            when(requested.id.id) {
                "io.spring.dependency-management" -> useVersion(Versions.SPRING_DEPENDENCY_MANAGEMENT)
                "org.jetbrains.kotlin.jvm" -> useVersion(Versions.KOTLIN)
                "org.jetbrains.kotlin.plugin.spring" -> useVersion(Versions.KOTLIN)
                "org.springframework.boot" -> useVersion(Versions.SPRING_BOOT)
            }
        }
    }
}

rootProject.name = "SpringBootSample"