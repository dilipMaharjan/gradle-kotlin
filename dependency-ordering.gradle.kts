task("put-on-socks") {
    println("Put On Socks")
}

task("put-on-shoes") {

    //task put-on-shoes can run only after task put-on-shoes

    dependsOn("put-on-socks")
    println("Put on Shoes")
}

task("go-to-bed") {
    finalizedBy("brush-your-teeth")
    doLast { println("Go to bed.") }
}

task("brush-your-teeth") {
    doLast {
        println("Brush your teeth")
    }
}

task("take-shower") {
    doLast { println("Take shower") }
}

task("use-deodorant") {
    shouldRunAfter("take-shower")
    doLast {
        println("Use deodorant")
    }
}

task("get-ready") {
    dependsOn(tasks.filter {
        it.name == "put"
    })
}