def length_converter():
    print("Conversions:\n" \
    "1) Kilometers <-> Miles\n"
    "2) Inches <-> Centimeters\n"
    "3) Yards <-> Meters")
    choice = input("Select a number: ")
    print("---------------------")
    if choice == "1":
        choice2 = input("km -> miles (1) or miles -> km (2)? ")
        if choice2 == "1":
            km = float(input("Enter length in kilometers: "))
            miles = km * 0.621371
            print(f"{km} km = {miles:.2f} miles")
        if choice2 == "2":
            miles = float(input("Enter length in miles: "))
            km = miles * 1.609
            print(f"{miles} miles = {km:.2f} km")
    if choice == "2":
        choice2 = input("in -> cm (1) or cm -> in (2)? ")
        if choice2 == "1":
            inch = float(input("Enter length in inches: "))
            cm = inch * 2.54
            print(f"{inch} inches = {cm:.2f} cm")
        if choice2 == "2":
            cm = float(input("Enter length in centimeters: "))
            inch = cm * 0.393701
            print(f"{cm} cm = {inch:.2f} inches")
    if choice == "3":
        choice2 == input("yd -> m (1) or m -> yd(2)? ")
        if choice2 == "1":
            yd = float(input("Enter length in yards: "))
            m = yd * 0.9144
            print(f"{yd} yd = {m:.2f} m")
        if choice2 == "2":
            m = float(input("Enter length in meters: "))
            yd = m * 1.094
            print(f"{m} m = {yd:.2f} yd")

def temperature_converter():
    print("Conversions:\n" \
    "1) Fahrenheit <-> Celsius\n"
    "2) Fahrenheit <-> Kelvin\n"
    "3) Celsius <-> Kelvin")
    choice = input("Select a number: ")
    if choice == "1":
        choice2 = input("f -> c (1) or c -> f (2)? ")
        if choice2 == "1":
            f = float(input("Enter temperature in fahrenheit: "))
            c = (f-32) * (5/9)
            print(f"{f}f = {c:.2f}c")
        if choice2 == "2":
            c = float(input("Enter temperature in celsius: "))
            f = (c * (9/5)) + 32
            print(f"{c}c = {f:.2f}f")
    if choice == "2":
        choice2 = input("f -> k (1) or k -> f (2)? ")
        if choice2 == "1":
            f = float(input("Enter temperature in fahrenheit: "))
            k = (f-32) * (5/9) + 273.15
            print(f"{f}f = {k:.2f}k")
        if choice2 == "2":
            k = float(input("Enter temperature in kelvin: "))
            f = (k-273.15) * (9/5) + 32
            print(f"{k}k = {f:.2f}f")
    if choice == "3":
        choice2 = input("c -> k (1) or k -> c (2)? ")
        if choice2 == "1":
            k = float(input("Enter temperature in kelvin: "))
            c = k - 273.15
            print(f"{k}k = {c:.2f}c")
        if choice2 == "2":
            c = float(input("Enter temperature in celsius: "))
            k = c + 273.15
            print(f"{c}c = {k:.2f}k")

unit_choice = input("Which converter do you want to use? ")
if unit_choice == ("Length" or "length" or "Length converter" or "length converter"):
    length_converter()
elif unit_choice == ("Temperature" or "temperature" or "Temperature converter" or "temperature converter"):
    temperature_converter()
