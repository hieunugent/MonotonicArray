JC= javac
JA=java

default: clean complie run
clean:
	rm -f *.class
complie:
	$(JC) MonotomicArray.java
	$(JC) TestCase.java TestRunner.java

run:
	$(JA) TestRunner
