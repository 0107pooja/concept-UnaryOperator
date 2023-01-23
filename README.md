Unary Operators in Java
Java unary operators are the types that need only one operand to perform any operation like increment, decrement, negation, etc.
It consists of various arithmetic, logical and other operators that operate on a single operand. Let’s look at the various unary
operators in detail and see how they operate.

Operator 1: Unary minus(-)
This operator can be used to convert a positive value to a negative one.
Syntax: -(operand)
Illustration:
a = -10

Operator 2: ‘NOT’ Operator(!)
This is used to convert true to false or vice versa. Basically, it reverses the logical state of an operand.
Syntax: !(operand)
Illustration:
cond = !true;
// cond < false

Operator 3: Increment(++)
It is used to increment the value of an integer. It can be used in two separate ways:

3.1: Post-increment operator=
When placed after the variable name, the value of the operand is incremented but the previous value is retained temporarily until
the execution of this statement and it gets updated before the execution of the next statement.
Syntax:num++

Illustration:
num = 5
num++ = 6

3.2: Pre-increment operator
When placed before the variable name, the operand’s value is incremented instantly.
Syntax:++num

Illustration:
num = 5
++num = 6

Operator 4: Decrement(–)
It is used to decrement the value of an integer. It can be used in two separate ways:

4.1: Post-decrement operator
When placed after the variable name, the value of the operand is decremented but the previous values is retained temporarily until
the execution of this statement and it gets updated before the execution of the next statement.
Syntax:num--

Illustration:
num = 5
num-- = 5 // Value will be decremented before execution od next statement

4.2: Pre-decrement operator
When placed before the variable name, the operand’s value is decremented instantly.
Syntax: --num

Illustration:
num = 5
--num = 5 //output is 5, value is decremented before execution of next statement

Operator 5: Bitwise Complement(~)
This unary operator returns the one’s complement representation of the input value or operand, i.e, with all bits inverted, which
means it makes every 0 to 1, and every 1 to 0.
Syntax: ~(operand)

Illustration:
a = 5[0101 in Binary]
result = ~5
This performs a bitwise complement of 5
~0101 = 1010 = 10 (in decimal)
Then the compiler will give 2’s complement
of that number.
2’s complement of 10 will be -6.
result = -6

