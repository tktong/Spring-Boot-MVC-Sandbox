plugins {
    java
    id("org.springframework.boot")
}

repositories {
	mavenCentral()
}

dependencies {
    implementation(Dependencies.SPRING_BOOT_WEB)
}
