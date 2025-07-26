def Test (a, b):
    if a > b:
        print(a)
    elif a == b:
        print("These numbers are equal!!")
    else:
        print(b)

test1 = Test(5, 4)
test2 = Test(1, 9)
test3 = Test(3, 3)

# def Test2 (a, b):
#     if a % b == 0:
#         print("This number has a modulus of 0")

# Test2(4, 2)