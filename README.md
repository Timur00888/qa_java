# qa_java
QA Java Project

## Запуск Для запуска выполнить команду:

`mvn clean test`

Отчет по покрытию:
PS C:\Users\timam\Documents\Учеба\project\qa_java> mvn clean test
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------< org.example:untitled >------------------------
[INFO] Building untitled 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- clean:3.2.0:clean (default-clean) @ untitled ---
[INFO] Deleting C:\Users\timam\Documents\Учеба\project\qa_java\target
[INFO]
[INFO] --- jacoco:0.8.7:prepare-agent (prepare-agent) @ untitled ---
[INFO] argLine set to -javaagent:C:\\Users\\timam\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.7\\org.jacoco.agent-0.8.7-runtime.jar=destfile=C:\\Users\\timam\\Documents\\Учеба\\project\\qa_java\\target\\jacoco.exec
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ untitled ---
[WARNING] Using platform encoding (Cp1251 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO]
[INFO] --- compiler:3.8.1:compile (default-compile) @ untitled ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding Cp1251, i.e. build is platform dependent!
[INFO] Compiling 5 source files to C:\Users\timam\Documents\Учеба\project\qa_java\target\classes
[ERROR] /C:/Users/timam/Documents/Учеба/project/qa_java/src/main/java/com/example/Lion.java:[16,35] unmappable character (0x98) for encoding windows-1251
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ untitled ---
[WARNING] Using platform encoding (Cp1251 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\timam\Documents\Учеба\project\qa_java\src\test\resources
[INFO]
[INFO] --- compiler:3.8.1:testCompile (default-testCompile) @ untitled ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding Cp1251, i.e. build is platform dependent!
[INFO] Compiling 4 source files to C:\Users\timam\Documents\Учеба\project\qa_java\target\test-classes
[ERROR] /C:/Users/timam/Documents/Учеба/project/qa_java/src/test/java/LionDoesHaveManeTest.java:[44,28] unmappable character (0x98) for encoding windows-1251
[INFO]
[INFO] --- surefire:3.2.5:test (default-test) @ untitled ---
[INFO] Using auto detected provider org.apache.maven.surefire.junit4.JUnit4Provider
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running CatTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.071 s -- in CatTest
[INFO] Running FelineTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s -- in FelineTest
[INFO] Running LionDoesHaveManeTest
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s -- in LionDoesHaveManeTest
[INFO] Running LionTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s -- in LionTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  27.449 s
[INFO] Finished at: 2025-12-27T20:09:50+03:00
[INFO] ------------------------------------------------------------------------