plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
    testImplementation(kotlin("test"))
    implementation("com.squareup.okhttp3:okhttp:4.12.0") // http client
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}