# lightning.py
# This program determines the distance to a lightning strike based
# on the time ellapsed between the flash and the sound of thunder

def main():
    # asking the user to count when they see lightning next
    print("When the next lightning strike hits, start counting (1, 2, 3, etc.)")
    print("until you hear thunder")
    print()

    # asking the user to input their findings 
    time = float(input("Enter the amount of seconds it took for you to hear thunder: "))

    # calculates the distance based on the time sound travels
    distance = time * 1100

    # if the distance is greater than or equal to the distance for a mile, it will
    # return a different statement (if it is greater than 5280 it will give the answer
    # in miles but if it is less it will give the answer in ft
    if(distance >= 5280):
        miles = round(distance / 5280, 2)
        print("The lightning strike occured ", miles, "miles from you")

    else:
        print("The lightning strike occured", distance, "ft from you")             


main()
