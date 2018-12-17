# gradle-study

## 01. Project Creation
* commit: a0e5bc4bd7a1ec6a6dc663bb892de32808d5deae
```sh
gradle init --dsl kotlin
```

## 02. Tasks
```sh
./gradlew tasks
```

### creat a new task
* built-in task
* commit: 84702cc20f6d7aed9156224c09e36c71f0f030ba
```sh
./gradlew tasks
./gradlew list-up
```

### Creat a new task
* my own task
* commit: 30d0748cd02d9240c1720861911a25b3c00f60cf
```sh
./gradlew tasks
./gradlew -q print-me
```


### Make a dep b/w tasks.
* commit: ce587d0cbfb0064ef492583f190c8b7bc1830078
```sh
./gradlew tasks
./gradlew list-up
```


## 03. Plugins
* commit: 52af7f8f273d3270c686fcf1a93616a58c90b996
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
