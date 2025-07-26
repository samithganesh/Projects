def factorialfor(number):
    factorial = 1
    for x in range(1, number + 1):
        factorial = factorial * x
    print('The factorial of', number, ' is', factorial)

factorialfor(5)


# number = 5
# factorial   1   2   6   24  120
# x           1   2   3   4   5