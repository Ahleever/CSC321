#Oliver Montero
#Lab 08

import random
randNum = random.randint(0,9)

x = 5

print("Guess a number from 0-9: ")

y = int(input())

if (randNum != y):
    if (randNum > y):
        print(f"You guessed too low! The number was {randNum} and you guessed {y}. YOU LOSE!")
    else:
        print(f"You guessed too high! The number was {randNum} and you guessed {y}. YOU LOSE!")
else: 
    print("Wow, you got it right! YOU WIN!")

for _ in range(x):
    print("Hehehe")

count = 5

print("What is my favorite food")
while count > 1:
    print("My favorite food is tomato soup/spicy vodka pasta.")
    count -= 1
