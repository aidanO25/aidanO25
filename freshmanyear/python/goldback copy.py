# goldback.py
# This program gets a number from the user, checks to make sure that it is even,
# and then finds two prime numbers that add up to the number

# Defines a function to scan through the list created in the main function to find
# two numbers that add up to the target number which is the number inputed 
def findMatch(primeList,target):
    for i in range(len(primeList)):
        for j in range(i+1,len(primeList)):
            # checks to see if the two variables add up to eachother
            if primeList[i]+primeList[j] == target:
                return primeList[i] , primeList[j]


def main():

    # Gets an imput number from the user 
    num = int(input("Enter an int to find two prime nubmers that add up to your number: "))

    # Checks to make sure it is greater that 2 because the program wouldn't work
    # if it was less than 2
    if num < 2:
        print("The number must be greater than 1")
        print("Type main() to restart")


    # This part subtracts 1 from the number input from the user and every time
    # a number is subtracted, the program checks to see if it is a prime number.
    # If it is a prime number it imputs/appends that number into a list which
    # includes other primes.
    i = 1
    listt = []
    print("The prime numbers less than",num," are: ")
    for i in range(num):
        newNum = num - i
        if(newNum > 1):
            check = False
            if newNum > 1:
                for i in range(2, newNum):
                    if (newNum % i) == 0:
                        check = True
                        break

            if check != True:
                listt.append(int(newNum))
    print(listt)


    
    print("The two prime numbers that add up to", num, "are:",findMatch(listt,num))

main()
