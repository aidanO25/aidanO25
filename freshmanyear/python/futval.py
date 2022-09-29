# futval.py
# A program to compute the value of an investment
# Carried 10 years into the future

def main():
    print("This program calculates the future value ")
    print("of a multi-year investment")

    fixedInvestment = eval(input("Enter the fixed yearly investment: "))
    apr = eval(input("Enter the annual interst rate: "))
    years = eval(input("Enter the number of years "))

    principal = fixedInvestment

    for i in range(years):
        principal = principal * (1 + apr)
        principal = principal + fixedInvestment

    print("The value in ", years," years is", principal)

main()
