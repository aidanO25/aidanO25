# circleIntercept.py
# This prgram computes the intersection of a circle with a horizontal line and
# displays the information textually and graphically

from graphics import *
import math

def main():

    # user input for radius and y-intercept
    radius = int(input("Enter a radius no greater than 10 for your circle: "))
    yIntercept = int(input("Enter a y-intercept no grater than 10 for a line: "))


    # title and coordinates
    win = GraphWin("Circle Interception",500,500)
    win.setCoords(-10.0, -10.0, 10.0, 10.0)
    
    # draws the circle with given radius
    c = Circle(Point(0.0,0.0),radius)
    c.draw(win)

    # draws the line with given y-intercept
    line = Line(Point(-10,yIntercept),Point(10,yIntercept))
    line.draw(win)

    # calculates the x values of the points of intersection
    a = (radius ** 2) - (yIntercept ** 2)
    xr1 = math.sqrt(a)
    b = (radius ** 2) - (yIntercept ** 2)
    xr2 = math.sqrt(b)
    xr2 = xr2 * -1  
    
    # dot 1
    dot1 = Circle(Point(xr1,yIntercept),.15)
    dot1.setFill("red")
    dot1.draw(win)

    # dot 2
    dot2 = Circle(Point(xr2,yIntercept),.15)
    dot2.setFill("red")
    dot2.draw(win)

    # Checks whether or not the y-intercept even touches the circle and if so
    # prints the 2 intersecting points
    if(yIntercept > radius):
        print("There are no points of contact")

    else:
        print("Contact at", xr1, "and", xr2)

    


main()
