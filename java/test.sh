#!/usr/bin/env bash

if [ 0 -eq $# ];
then
  echo 'must provide question id'
  exit -1
fi

cp $1/Solution.java $1.$1.java
leetcode test $1.$1.java
rm $1.$1.java
