import re

print("ALGORITMO DE INSERCION.")
print("\tIngrese numeros y luego presione ENTER", 
        "\n\tSi quiere terminar su lista, presione t",
        "\n\tSi quiere salir del programa, presione q")

numbers = []

flag = True
i = 1
while(flag or not numbers):
    var = input(f'[{i}]:\t')
    if not re.match('/[1-9]+/g',var) or var == 'q' or var == 't':
        if var == 't': # if terminated of type numbers
            break;
        elif var == 'q': # if wish to quit the program
            break;
        else:
            numbers.append(int(var))
    i += 1

if var == 't':
    # insertion sort
    for j in range(1,len(numbers)):

        key = numbers[j]

        i = j - 1
        while i >= 0 and numbers[i] > key:
            numbers[i+1] = numbers[i]
            i = i - 1
        numbers[i+1] = key

print("List in order: ",
      str(numbers))