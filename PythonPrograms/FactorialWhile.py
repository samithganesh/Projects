def factorialwhile(number):
    factorial = 1
    while number > 1:
        factorial = factorial * number
        number = number - 1
    
    return factorial
    
print(factorialwhile(5))



# result  1   5   20  60  120
# number  5   4   3   2   1