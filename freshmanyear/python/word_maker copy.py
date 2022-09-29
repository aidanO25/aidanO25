# word_maker.py

# This program takes the first two and last two characters of a string and puts
# them together to create a new string. If there are only two characters, it just
# puts the two together

def main():

    # gets a string from the user
    word = input("Enter a word: ")

    # Checks if the word has more than 2 characters and gives an output based on
    # that
    if(word > word[0:2]):
        first_two = word[0:2]
        last_two = word[-2:]
        print(first_two + last_two)

    else:
        print(word + word)


main()
