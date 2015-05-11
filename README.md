FooBarQix-kata
==============

Write a program that prints numbers from 1 to 100, one number per line. For each printed number, use the following rules:

1. if the number is divisible by 3 or contains 3, replace 3 by "Foo";
2. if the number is divisible by 5 or contains 5, replace 5 by "Bar";
3. if the number is devisible by 7 or contains 7, replace 7 by "Qix".

Example:
	1
	2
	FooFoo
	4
	BarBar
	Foo
	QixQix
	8
	Foo
	Bar

More details:
- divisors have high precedence, ex: 51 -> FooBar
- the content is analysed in the order they appear, ex: 53 -> BarFoo
- 13 contains 3 so we print "Foo"
- 15 is divisible by 3 and 5 and contains 5, so we print "FooBarBar"
- 33 contains 3 two times and is divisible by 3, so we print "FooFooFoo"