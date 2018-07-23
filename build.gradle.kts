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

class KotlinClas {
    fun sayHello() {
        println("KotlinClass")
    }
}

val kotlinClass = KotlinClas()
kotlinClass.sayHello()

val myTask = task("My-Task")
myTask.description = "Description here"
myTask.group = "This is the heading for group"
myTask.doLast {
    println("Do last")
}

myTask.doFirst {
    println("Do First")
}

task("consize-task") {
    description = "consize task description"
    group = "This is consize group"

    doFirst {
        println("Do this first")
    }

    doLast {
        println("Do this last")
    }
}
