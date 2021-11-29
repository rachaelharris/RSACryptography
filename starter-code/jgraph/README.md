# Running the program
Linux/Mac:
-----------------------------------------------------------
Type in the following commands on your terminal. Make sure you are inside the jgraph folder. 
./compile.sh
./run.sh
-----------------------------------------------------------
Windows:
Type in the following commands on your command prompt. Make sure you are inside the jgraph folder. 
exec.bat
-----------------------------------------------------------
Manual Compilation and Execution Procedure:

To compile from root directory:
```shell
javac -d "bin" -cp "bin:jar/*" src/com/web/*.java
```
To run from root directory:
```shell
java -cp "bin:jar/*" com.web.TreeVisualizer
```