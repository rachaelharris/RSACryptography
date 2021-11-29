# Encryption Algorithm

Michael Ceccarelli ([@mceccarelli](https://github.com/mceccarelli)) and Rachael Harris ([@rachaelharris](https://github.com/rachaelharris))

Under the advisment of Dr. Aravind Mohan of the Allegheny College Computer Science Department

April 2021

# Table of Contents

* [About](#about)
* [Features](#features)
* [Installation](#installation)
  * [Linux/Mac](#Linux/Mac)
  * [Windows](#windows)
* [Run](#run)
* [Contact](#contact)


## About

RSA is a type of encryption that has been around for decades, and is still in use today with many applications. Named after its founders' initials, RSA showcases a problem humans currently do not have an understanding of: factoring large numbers. Forty years later, we are still stuck on the same problem, making RSA still relevant today.

However, it is important to note that in actual applications, RSA requires numbers that are simply beyond the scale of what we are able to do in a Java program. The current standard is 2048 bit prime number, or one that is around 600 digits long. That's impossible to comprehend, and using numbers of that size require programs that are specialized to do so, like Wolfram Mathematica. 

## Features

- A messaging service where Bob and Alice send encrypted messages to each other using RSA.

## Installation

- Clone the source code onto your machine

  Using HTTPS:

  ```https://github.com/Allegheny-Computer-Science-202-S2021/cmpsc202-s2021-final-project-team9.git```

  Using SSH:

  ```git@github.com:Allegheny-Computer-Science-202-S2021/cmpsc202-s2021-final-project-team9.git```

## Run

## Linux/Mac:

-----------------------------------------------------------

Type in the following commands on your terminal. Make sure you are inside the jgraph folder.

```./compile.sh```

```./run.sh```

-----------------------------------------------------------

### Windows:

Type in the following commands on your command prompt. Make sure you are inside the jgraph folder.

```exec.bat```

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


## Contact

If you have any questions or concerns about this project please contact:

- Dr. Aravind Mohan (amohan@allegheny.edu)
- Michael Ceccarelli (ceccarellim@allegheny.edu)
- Rachael Harris (harrisr@allegheny.edu)
