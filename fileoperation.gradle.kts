
tasks {
    "copy"(Copy::class) {
        from("src/main/resources/images") {
            destinationDir = file("src/main/resources/target")
            include("*.png")
            into("png")
        }

        from("src/main/resources/images") {
            include("*.svg")
            into("svg")
        }
    }
    "zipIt"(Zip::class) {
        baseName = "images"
        destinationDir = file("build")
        from("src/main/resources/images")
    }
    "clean"(Delete::class) {
        delete("src/main/resources/target")
    }
}