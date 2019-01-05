# gradle-study

## 01. Project Creation
* commit: 368fb39eee8d7f9423bb0e8f6aa7d8cf92d8a05c
```sh
gradle init --dsl kotlin
```

## 02. Tasks
```sh
./gradlew tasks
```

### creat a new task
* built-in task
* commit: 265f143d586a749de41be36c5677478570777e54
```sh
./gradlew tasks
./gradlew list-up
```

### Creat a new task
* my own task
* commit: 4597e124fc571af62f019d109919ea63907a52cc
```sh
./gradlew tasks
./gradlew -q print-me
```


### Make a dep b/w tasks.
* commit: dc58d8df63ed1ba92606db9fdfa124597f916df1
```sh
./gradlew tasks
./gradlew list-up
```


## 03. Plugins
* commit: 2b2473bc0359550b4367acb890a529284e714029
* when added `java` default built-in plugin, then new tasks are pulled up
```sh
./gradlew tasks
```

New java plugin's task

```
Build tasks
-----------
assemble - Assembles the outputs of this project.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles main classes.
clean - Deletes the build directory.
jar - Assembles a jar archive containing the main classes.
testClasses - Assembles test classes.
```

## 04. Projects(modules)
* commit: bd71f3308fef2a2faefbe074d606b0e98272d3bf
* Add a new module
```sh
./gradlew projects
```
* possible to execute module's task
```sh
▶ ./gradlew -q my-task
Welcome gradle tasks!
module name: 1
end of my task
```

## 05. Dependencies
* commit: 6a7e50564fecd431d31731a9daf0ead00df60072
* We need java plugins
* https://docs.gradle.org/current/userguide/java_plugin.html
