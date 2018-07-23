repositories {
    mavenCentral()
    jcenter()
    mavenLocal()
    maven {
        url = uri("https://repo.foo.org/m2")
    }
}

plugins {
    id("java")
}

dependencies {
    implementation("com.squareup.retrofit2:retrofit:2.4.0")
    //file dependencies
    implementation(files("file/location"))
    testImplementation("junit:junit:4.12")
}