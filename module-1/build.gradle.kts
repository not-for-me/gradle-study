tasks {
    create("mod-name") {
        println("module name: 1")
    }
}

task("my-task") {
    doLast {
        println("end of my task")
    }
}