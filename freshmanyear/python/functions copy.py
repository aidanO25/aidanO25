# functions.py
# This program returns the surface area of a sphere having given the radius
# This program also returns the volume area of a sphere given the radius

# that math class is imported to get the value of pi for an accurate equation
import math

# this function calculates the surface area of a sphere rounded to 2 decimals
def sphereArea(radius):
    return(round(4 * math.pi * radius ** 2, 2))

# this function calculates the volume area of a sphere rounded to 2 decimals
def sphereVolume(radius):
    return(round(4/3 * math.pi * radius ** 3,2))

def main():

    # gets the radius 
    num = float(input("Enter the radius of a sphere to get it's surface and volume area: "))
    print()

    # uses the functions defined above to print the surface and volume area
    print("The surface area of a sphere with a radius of", num, "is: ", end="")
    print(sphereArea(num))
    print("The volume area of a sphere with a radius of", num, "is: ", end="")
    print(sphereVolume(num))


main()
