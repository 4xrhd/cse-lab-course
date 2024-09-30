num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))

if num1 > num2:
    result = num1 - num2
elif num2 > num1:
    result = num2 - num1
else:
    result = 0
print(result)
