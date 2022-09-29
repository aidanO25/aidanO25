# Convert_table.py
# A program prints a conversion table from Celsius to Fahrenheit

def main():
    print("Conversion table from Celsius degrees")
    print("to Fahrenheit degres")
          
    for i in range(11):
        # Calculate the temperature in Fahrenheit
        fahrenheit = i * 10 * 9/5 + 32
        print(i*10,"C", fahrenheit, "F")

main()

        
        
