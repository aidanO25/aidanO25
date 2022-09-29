# graphicGates.py
# This program creates a graphical representation of the logical gates

# imports
from graphics import *

# Function to draw an AND gate
def draw_and(x, y, size, window):
    x1,x2 = x-size/2,x+size/2
    y1,y2 = y-size/2,y+size/2
    y3,y4 = y-size/4,y+size/4
    # Outline
    Line(Point(x1,y1),Point(x1,y2)).draw(window)
    Line(Point(x1,y1),Point(x2,y1)).draw(window)
    Line(Point(x1,y2),Point(x2,y2)).draw(window)
    Arc(Point(x,y1),Point(x+size,y2)).draw(window)
    # Connectors
    Line(Point(x1-10,y3),Point(x1,y3)).draw(window)
    Line(Point(x1-10,y4),Point(x1,y4)).draw(window)
    Line(Point(x+size,y),Point(x+size+10,y)).draw(window)

# Function to draw an OR gate
def draw_or(x, y, size, window):
    x1,x2 = x-size/2,x+size/2
    y1,y2 = y-size/2,y+size/2
    y3,y4 = y-size/4,y+size/4
    # Outline
    Arc(Point(x1-size/2,y1),Point(x1+size/2,y2)).draw(window)
    Line(Point(x1,y1),Point(x2,y1)).draw(window)
    Line(Point(x1,y2),Point(x2,y2)).draw(window)
    Arc(Point(x,y1),Point(x+size,y2)).draw(window)
    # Connectors
    Line(Point(x1,y3),Point(x-2,y3)).draw(window)
    Line(Point(x1,y4),Point(x-2,y4)).draw(window)
    Line(Point(x+size,y),Point(x+size+10,y)).draw(window)

# Function to draw NOT gate
def draw_not(x, y, size, window):
    x1,x2 = x-size/2,x+size/2
    y1,y2 = y-size/2,y+size/2
    y3,y4 = y-size/4,y+size/4
    # Outline
    Polygon(Point(x1 - size,y1),Point(x1 - size,y2),Point(x2 - size, y)).draw(window)
    Circle(Point(x - size / 2.5,y),size/10).draw(window)
    # Connectors
    Line(Point(x - size / 3.5, y),Point(x - size / 50,y)).draw(window)
    Line(Point(x - size * 2, y),Point(x1 - size, y)).draw(window)

# Function to draw XOR gate
def draw_xor(x, y, size, window):
    x1,x2 = x-size/2,x+size/2
    y1,y2 = y-size/2,y+size/2
    y3,y4 = y-size/4,y+size/4
    # Outline
    Arc(Point(x1 - size / 2, y1),Point(x2 - size * 2.5,y2)).draw(window)
    Line(Point(x1 - size + 1, y1),Point(x - 2,y)).draw(window)
    Line(Point(x1 - size + 1, y2),Point(x - 2, y)).draw(window)
    # Connectors
    Line(Point(x1 - size,y3),Point(x - size - 2,y3)).draw(window)
    Line(Point(x1 - size,y4),Point(x - size - 2,y4)).draw(window)
    Arc(Point(x1 - size * .75, y1),Point(x2 - size * 2.5,y2)).draw(window)
    Line(Point(x2 - size + 25, y),Point(x2 + size - 75, y)).draw(window)

# Funciton to draw NAND gate
def draw_nand(x, y, size, window):
    x1,x2 = x-size/2,x+size/2
    y1,y2 = y-size/2,y+size/2
    y3,y4 = y-size/4,y+size/4
    # Outline
    Line(Point(x1,y1),Point(x1,y2)).draw(window)
    Line(Point(x1,y1),Point(x2,y1)).draw(window)
    Line(Point(x1,y2),Point(x2,y2)).draw(window)
    Arc(Point(x,y1),Point(x+size,y2)).draw(window)
    Circle(Point(x2 + size / 1.65, y),size/10).draw(window)
    # Connectors
    Line(Point(x1-10,y3),Point(x1,y3)).draw(window)
    Line(Point(x1-10,y4),Point(x1,y4)).draw(window)
    Line(Point(x2 + size - 20,y),Point(x2 + size - 5,y)).draw(window)
    
    
    

def main():
    win = GraphWin("Logic Gates",500,500)
    draw_and(50,60,60,win)
    draw_or(50,150,60,win)
    draw_not(300,60,60,win)
    draw_xor(280,150,60,win)
    draw_nand(150,250,60,win)
    win.getMouse()

main()
