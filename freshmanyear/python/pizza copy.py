# pizza.py
# This program calculates the cost per square inch of a pizza
# given its diameter and price

def main():
    # getting user inputs
    price = float(input("What is the price of the pizza: "))
    diameter = float(input("What is the diameter of the pizza: "))
    
    # calculations
    radius = diameter / 2
    area = radius * radius
    squareInch = 3.14 * area

    total = round(price / squareInch, 2)
    
    # fiinal statement
    print("The cost per square inch of your pizza is:",total)


main()
