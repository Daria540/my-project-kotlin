plugins {
    kotlin("jvm") apply false
}

group = "org.guryanova.kotlin"
version = "0.1.1"

allprojects {
    repositories {
        mavenCentral()
    }
}
subprojects{
    group = rootProject.group
    version = rootProject.version
}
