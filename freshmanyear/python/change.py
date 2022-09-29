# change.py
# a program to calculate the value of some change in dollars

def main():
    print("Change Counter")
    print()
    print("Please enter the cont of each coin type.")

    quarters = int(input("Quarters: "))
    dimes = int(input("Dimes: "))
    nickels = int(input("Nickels: "))
    pennies = int(input("Pennies: "))

    total = quarters * 25 + dimes * 10 + nickels * 5 + pennies * .01

    print()
    print("The total value of our change is: ", total)
    
                    
main()
