# lineSegment.py
# This program allows the user to draw a line segment and ten displas some
# graphical and textual information about the line segment

from graphics import *
import math

def main():
    win = GraphWin("Click two points",500,500)
    print("Click two points in the window to create a line")
    win.setCoords(-10.0,-10.0,10.0,10.0)
    

    # gets the two points that are clickd in the window
    a = win.getMouse()
    b = win.getMouse()

    # draws a line based on the two points clicked
    line = Line(Point(a.getX(),a.getY()),Point(b.getX(),b.getY()))
    line.draw(win)

    # calculates the midpoint
    p1 = (a.getX() + b.getX()) / 2
    p2 = (a.getY() + b.getY()) / 2

    # calculates the slope
    dx = b.getX() - a.getX()
    dy = b.getY() - a.getY()
    slope = dy/dx
    slopeR = round(slope,2)
    print("The slope is: ",slopeR)

    # calculates the length of the line
    a = (dx ** 2) + (dy ** 2)
    length = math.sqrt(a)
    lengthR = round(length,2)
    print("The length of the line is:",lengthR)

    # marking the midpoint with a cyan dot/circle
    center = Circle(Point(p1, p2),.2)
    center.setFill("cyan")
    center.draw(win)

    # displaying information in graphics window

    # length
    txtLength = Text(Point(-6,9),"The length of the line is:")
    txtLength.setSize(15)
    txtLength.draw(win)
    txtLength2 = Text(Point(-2,9),lengthR)
    txtLength2.setSize(15)
    txtLength2.setFill("red")
    txtLength2.draw(win)

    # slope
    txtSlope = Text(Point(4,9), "The slope of the line is:")
    txtSlope.setSize(15)
    txtSlope.draw(win)
    txtSlope2 = Text(Point(8,9), slopeR)
    txtSlope2.setSize(15)
    txtSlope2.setFill("red")
    txtSlope2.draw(win)

main()
