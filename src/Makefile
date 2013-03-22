all: antlrMake parse main

antlrMake: ./tube/syntactic/Grammar.g4
	java -jar ../lib/antlr.jar ./tube/syntactic/Grammar.g4

parse: ./tube/syntactic/Grammar.g4
	javac -cp ../lib/antlr.jar ./tube/syntactic/*.java

main:
	javac -cp ../lib/antlr.jar ./tube/*/*.java

clean:
	rm ./tube/*/*.class
