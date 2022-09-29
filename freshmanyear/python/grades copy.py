# grades.py
# This program accepts a quiz score as an import and outputs its corresponding
# grade

def main():
    # gets the user input as a whole number (if you want it as a float I have
    # another program that does it if you wanted an imput such as 4.5 just let
    # me know if I should send that one instead)
    
    grade = int(input("Enter your grade rounded to a whole number: "))

    # if statements to have diferent outputs depending on the input
    if(grade >= 0 and grade <=1):
        print("You got an F")

    if(grade > 1 and grade <= 2):
        print("You got a D")

    if(grade > 2 and grade <=3):
        print("You got a C")

    if(grade > 3 and grade <=4):
        print("You got a B")

    if(grade > 4 and grade <=5):
        print("You got an: A")


main()
