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

Of course, our implementation won't actually be used by anyone for the purposes of encrypting messages, and all the operations will be found in the terminal window. The primary idea is to have a conversation between Alice and Bob, the two typical characters in any cryptography problem, and they will encrypt and decrypt their messages to each other using the RSA algorithm. Our current goal is to have a message typed in English, converted into an integer, encrypted, decrypted, then converted back into English. Currently, we plan to leave out Eve, the character always responsible for trying to intercept messages in typical cryptography examples, but if we have time to implement her, it will be interesting to see just how hard it is to crack RSA.

There are several algorithms we have to write, all of which are heavily rooted in complex mathematics dealing with prime numbers and modulus division. Our goal is to write pseudocode for the various algorithms, and implement them in Java afterwards. There will be a class that holds all the methods to do these operations, serving as the core of the whole program. Also in this section will be the Latex files that we used as a blueprint for implementation.

However, it is important to note that in actual applications, RSA requires numbers that are simply beyond the scale of what we are able to do in a Java program. I believe the current standard is 2048 bit prime number, or one that is around 600 digits long. That's impossible to comprehend, and using numbers of that size require programs that are specialized to do so, like Wolfram Mathematica. Our primes will be chosen on a much smaller scale, so even though they won't technically be secure by any means, they will work for our example.

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
