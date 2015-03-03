'''
Created on 23 feb 2015

@author: Zwebra
'''

import re
print("Password please: ")
pwd = input()
if len(pwd) <8:
    print("Your password is to short")   
if len(pwd) >= 8:
    print("Your password is long enough")   
if re.search(r'\d', pwd):
    print("It has a digit")
if re.search(r'[A-Z]', pwd):
    print("Has uppercase")    
if re.search(r'[a-z]', pwd):
    print("has lowercase")    
if re.search(r'[!"#¤%&@£$]', pwd):
    print("it has a special Character!")
    

    
    


