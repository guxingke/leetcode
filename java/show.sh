#!/usr/bin/env bash

if [ 0 -eq $# ];
then
  echo 'must provide question id'
  exit -1
fi

mkdir $1;

leetcode show $1 -l java > $1/README.md
leetcode show $1 -c -l java > $1/Solution.java

cp common/* $1/
