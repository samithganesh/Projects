def prime(number):
    prime = True
    for value in range(2, number/2):
        if number % value == 0:
            prime = False
            break
        
    if prime == True:
        print(number, " is a prime number!")
    else:
        print(number, "is not a prime number!")


# number = 5
# value   2
# prime   True

prime(6)
