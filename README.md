# Expression parser

## Description

Expression parser is a Java Core console-based application which allows you to evaluate expressions
containing up to 3 variables. The code architecture was written the way allowing you to add new
binary and unary operations easily as well as to create another type of parser which accepts an arbitrary
set of operations.\
It firstly creates nested `expression.ExpressionComparator` objects by recursive descent
parsing and then evaluates the result with `expression.TripleExpression.evaluate()` method. \
At the moment there are 2 parsers:
* `expression.parser.ExpressionParser` which accepts:
  - Add operation (x + y)
  - Subtract operation (x - y)
  - Multiply operation (x * y)
  - Divide operation (x / y)
  - Negate operation (-x)
  - Set operation (x set y): sets x'th y'th bit to 1 (in case of overflow uses modular arithmetic)
  - Clear operation (x set y): sets x'th y'th bit to 0 (in case of overflow uses modular arithmetic)
  Set and Clear have the lowest priority.
* `expression.parser.ExpressionParser` which accepts all the same operations but in case
of overflow throws `expression.exceptions.OverflowException`

## Requirements

* Java [JDK 9+]

## Usage

Java source root is _/java-solutions_, all _.java_ files should be compiled.\
To run parser with user-friendly arithmetic and parsing error output use:
```
 java expression.exceptions.Main "[expression]" [value of 'x'] [value of 'y']
 [value of 'z']
```
Note that variable names in the expression should be _x_, _y_ and _z_. For example:
```
 java expression.exceptions.Main "2*x + y+4 + z set 0" 3 1 5
```
should output 17.\
`expression.parser.Main` might be used for experimenting with `expression.parser.ExpressionParser`.