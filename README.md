# netconfessor


[![Build Status](https://travis-ci.org/xotonic/netconfessor.svg?branch=master)](https://travis-ci.org/xotonic/netconfessor)
[![codecov](https://codecov.io/gh/xotonic/netconfessor/branch/master/graph/badge.svg)](https://codecov.io/gh/xotonic/netconfessor)

Netconfessor is fork of discontinued [JNC](https://github.com/tail-f-systems/JNC) from Tail-f Systems (c)

Netconfessor is [NETCONF protocol](https://tools.ietf.org/html/rfc6241) client. 
Transport layer uses [Ganymed SSH-2](https://github.com/hudson/ganymed-ssh-2) library.

The project consists of 2 parts:
1. `core` - client part
2. `gen` - [pyang](https://github.com/mbj4668/pyang) plugin for generation Java code from `.yang` files

## Build

Install [`pyang`](https://github.com/mbj4668/pyang) for `Python 2.7`

```
$ pip install pyang==1.7.3
```
Build java sources

```
$ gradle build
```

## Using your own `.yang` file for generation

1. Add the file `gen/src/main/yang` directory
2. Add name of the file in `build.gradle` of `gen` module in task `yang`.

    If module has dependencies, you should add them too.
```groovy 
    HashSet<String> yangs = [ "your-module.yang" ]
```

3. Run gradle task `gradle yang`

You can also add files in test source set (`gen/src/test/yang`) for testing generated classes.

## Usage 

See RoboCop's basic API tests [here](gen/src/test/java/io/netconfessor/robocop/RobocopTest.java)
