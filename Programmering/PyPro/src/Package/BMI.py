'''
Created on 23 feb 2015

@author: Zwebra
'''


man = 16.2
female = 5.4

sex = input("What sex are you?")

age = int(input("What age are you?"))

weight = float(input("What weight are you?"))

print("weight: ", weight)

height = float(input("How tall are you? write your height in meters"))

print("height: ", height)


bmi = weight / (height * height)

print("BMI: ", bmi)

if sex == 'man': 
    
    fat = 1.2*bmi + 0.23*age - man 

    print("Your fat index is: ", fat)
    
elif sex =='female': 
    
    fat = 1.2 * bmi + 0.23 * age - female
    
    print("Your fat index is: ", fat)
 
    
if sex == 'man': 
    if int(fat) >= 12 and int(fat) <= 20:
        print("Your fat index is normal")
    else:
        print("your fat index is not normal")
        
elif sex == 'female':
    if int(fat) >= 20 and int(fat) <= 30:
        print("your fat index is normal")
    else:
        print("your fat index is not normal")
