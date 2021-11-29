@ECHO OFF
javac -d bin -cp jar\* src/com/web/*.java
ECHO Compilation success
cd bin
java -cp ..\jar\*;. com.web.TreeVisualizer
PAUSE