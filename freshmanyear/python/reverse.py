# reverse.py
# this program reverses a string given it's input

def main():

    # creates a variable (string) to store the input
    string = input("Enter a string you want reversed: ")

    reverse = " "
    
    for ch in string:
        reverse = ch + reverse

    print("The reversed sentence is:", reverse)

main()
    
