# first_letter.py
# this program takes the first letter of a string and if that letter is found
# throughout the rest of the string it will change it to a "$"

def main():

    # gets a word from user
    string = input("Enter a word: ")

    # gets the first letter
    first = string[0]

    # searches if the first letter occurs again in the string and changes with "$"
    length = len(string)
    string = string.replace(first, "$")
    string = first + string[1:]

    print(string)
    

main()
    
