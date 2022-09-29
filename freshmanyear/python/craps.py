# craps.py
# This program simulates multiplee games of craps and estimates the probability
# that the player wins

# imports the random class for random numbers and sys to increase recursion limit
from random import randrange
import sys
sys.setrecursionlimit(10000)

# created a re-roll function when a re-roll is needed
def reRoll():
    a2 = randrange(1,7)
    b2 = randrange(1,7)

    tot2 = a2 + b2
    return tot2

# created the roll function to give the initial roll and checks if win or not
def roll(num,count):
    for i in range(num):
        a = randrange(1,7)
        b = randrange(1,7)

        tot = a + b

        # checks to see if the initial roll total is a win or loss
        if tot == 2 or tot == 3 or tot == 12:
            print("loss")
            return roll(num - 1,count)
        if tot == 7 or tot == 11:
            print("win")
            count +=1
            return roll(num - 1,count)

        # If the initial roll total is not in raange for a win or loss based off
        # of the first roll, it will re-roll using the reRoll() funciton unitl
        # a win occurs
        else:
            second = reRoll()
            while second !=7 or second != tot:
                second = reRoll()
                if tot == second:
                    print("win")
                    count +=1
                    return roll(num - 1, count)
                elif second == 7:
                    print("loss")
                    return roll(num - 1, count)
    
    # returns the amount of wins recorded        
    print()
    return count
    

def main():
    num = int(input("Enter the amount of times you want to run the simulation: "))
    print("The probability of winning is: ",roll(num,0) / num)
    
main()
