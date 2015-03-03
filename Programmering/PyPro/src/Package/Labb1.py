'''
Created on 22 feb 2015

@author: Zwebra
'''

x = int(input("Whats the weather like today?"))


if x >= 80:                 print("Go swimming!")
elif x >= 60 and x < 80 :   print("Go play tennis!")
elif x >= 40 and x < 60:    print("Go play golf!")
elif x < 40:                print("Go ski!")