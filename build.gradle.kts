/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds/
 */

// https://docs.gradle.org/5.0/dsl/org.gradle.api.tasks.Exec.html
tasks.create<Exec>("list-up") {
    description = "Execute Test shell command"
    group = "My own group"

    commandLine("ls", "-al")
}