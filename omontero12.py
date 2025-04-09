#Oliver Montero
#Lab 12

def areaOfRectangle(x, y):
    return x*y

def areaOfCircle(rad):
    pi = 3.14
    return pi * rad * rad

print("Hello, to calculate the area of a rectangle, please input the height and the base:")
height = int(input("Please enter your height: "))
base = int(input("Please enter your base: "))
print("The area of your rectangle is: ",areaOfRectangle(height, base))

print("To calculate the area of a circle, please input the radius:")
radius = int(input("Please enter you radius: "))
print("The area of your circle is: ",areaOfCircle(radius))
