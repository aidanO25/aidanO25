# speeding.py
# this program takes a speed limit and clocked speed and either prints a messege
# indicating the if the speed was ligal or prints a fine if illegal

def main():

    # asks for user input of speed
    limit = int(input("Enter the speed limit in mph: "))
    speed = int(input("Enter the speed of the car in mph: "))

    # counter for amount over and cost
    over = speed-limit
    costOver = 5 * over

    if(speed > limit and speed < 90):
        print("The fine for speeding is $50, plus $",end="")
        print(costOver,"for going",over,"mph over with a total fine cost of $",end="")
        print(50 + costOver)
        
    if(speed > 90):
            print("The fine for speeding is $50, plus $",end="")
            print(costOver,"for going",over,"mph over plus $200 for going",end="")
            print(" over 90mph with a total fine cost of $",end="")
            print(50 + costOver + 200)

    if(speed < limit):
        print("The speed is legal")
    


main()
