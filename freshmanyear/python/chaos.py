# File: chaos.py
# A simple program illistrating chaotic behavior

def main():
    print("this program illustrates a choatic function")
    x = eval(input("Enter the first number between 0 and 1: "))
    y = eval(input("Enter the second number between 0 and 1: "))
    for i in range(10):
        x = 3.9 * x * (1 - x)
        y = 3.9 * y * (1 - y)
        print(x,y)

main()
