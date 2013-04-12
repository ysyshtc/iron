all: antlrMake parse main

antlrMake: ./src/tube/syntactic/Grammar.g4
	java -jar ./lib/antlr.jar ./src/tube/syntactic/Grammar.g4

parse: ./src/tube/syntactic/Grammar.g4
	javac -cp ./lib/antlr.jar ./src/tube/syntactic/*.java

main:
	javac -cp ./lib/antlr.jar ./src/tube/*/*.java

clean:
	rm ./src/tube/*/*.class
