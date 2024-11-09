#!/bin/zsh
java -jar /Users/lukin/bin/antlr-4.13.2-complete.jar NaturalEvitaQL.g4
javac *.java
java org.antlr.v4.gui.TestRig NaturalEvitaQL query -$1
