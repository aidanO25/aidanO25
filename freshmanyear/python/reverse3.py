# reverse3.py
# this program reverses a string given it's input

def main():

    # creates a variable (string) to store the input
    string = input("Enter a string you want reversed: ")

    reverse = " "
    
    for i in range(len(string)):
        reverse = reverse + string[-i -1]

    print("The reversed sentence is:", reverse)

main()
    
