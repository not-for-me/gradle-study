dependencies {
    compile("com.google.guava:guava27.0.1-jre")
    testCompile("junit:junit:4.4")
}

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

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}