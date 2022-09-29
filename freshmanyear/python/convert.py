# convert.py
# A program to convert Fahrenheit temps to Celsius

def main():
    print("This program converts temperature form Fahrenheit to Celsisus")
    print()
    for i in range(5):
        
    
        fahrenheit = eval(input("What is the Fahrenheit temperature? "))
        celsius = (fahrenheit - 32) * 5/9
        
        print("the temperature in Celsius is", celsius, "C")

    print()
    input("Press the <Enter> key to quit.")
    
main()
    
