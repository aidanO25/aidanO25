# letter_words
# this program takes the first letter of each word and makes a sentence out of it

def main():

    sentence = input("Enter a sentence: ")
    
    list = sentence.split(" ")

    print(list[[0:1]:1])



main()
