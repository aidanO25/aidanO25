# username.py
# This program creates a username

def main():
    first = input("Enter your first name (all lowercase): ")
    last = input("Enter your last name (all lowercase): ")

    # concatenate first initial with 6 letters (chars) of the last name

    username = first[0] + last[:7]

    print("username:",username)

main()
