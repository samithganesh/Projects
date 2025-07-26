def primewhile(number):
    print(number)
    prime = True

    # half = number/2
    # start = 2

    # while start <= half:
    #     print("while")
    #     if number % start == 0:
    #         prime = False
    #         break
    #     start = start + 1

    # if prime == True:
    #     print("This number is a prime number!")
    # else:
    #     print("This number is not a prime number!")

    # half = number/2
    # while half > 1:
    #     if number % half == 0:
    #         prime = False
    #         break
    #     half = half - 1

    # if prime == True:
    #     print("This number is a prime number!")
    # else:
    #     print("This number is not a prime number!")

    

    if number % 2 == 0:
        print("This number is not a prime number!")
    else:
        start = 3
        half = number/2
        while start <= half:
            if number % start == 0:
                prime = False
                break
        start = start + 2
    
    if prime == True:
        print("This is a prime number!")
    else:
        print("This is not a prime number!")

    


    # start = 2
    # half = number/2
    # while start <= half:
    #     if number % 3 == 0:
    #         prime = False
    #         break
    #     start = start + 2
    
    # if prime == True:
    #     print("This number is a prime number!")
    # else:
    #     print("This number is not a prime number!")
    
   
primewhile(4)

# number = 121

# for loop value = 2 to 60
# x = 2, 3, 4 .......60


