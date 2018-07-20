import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.2.51"
}


group = "com.dilip"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}


task("hello-world") {
    doLast {
        println("Hello World")

    }
}
task("create-dir") {
    doLast {
        File("./test").mkdirs()
    }
}

task("delete-dir") {
    doLast {
        File("./test").delete()
    }
}

task("navigate-file") {
    doLast {
        val env = System.getenv()
        println(env)
    }
}