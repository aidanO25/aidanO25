# word_list2.py
# this program crates a list of words from a sentence

def main():
    
    sentence = input("Enter the sentence to convert: ")

    start = 0
    list = []
    for i in range(len(sentence)):
        if sentence[i] == " ":
            end = i
            list = list + [sentence[start:end]]
            start = end + 1
    list = list + [sentence[start:]]
            

    print(list)

main()
