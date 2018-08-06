from bs4 import BeautifulSoup
#import html2text
import requests
import os,sys
from os import path


urlwebsite=1000
listofurls=[]
deepness=6
root="https://en.wikipedia.org/wiki/Tropical_cyclone"

def display():
    file1=open("C:\Python\program1.txt",'a+')
    for i in range (0,len(listofurls)):
        if(listofurls[i]!=null):
            file1.write(listofurls[i]+ '\n')
    
rank=1
r  = requests.get(root)
data = r.text
soup = BeautifulSoup(data, 'html.parser')
for link in soup.find_all('a', href=True):
	href=link.get("href")
if "https://en.wikipedia.org/wiki/" in href: 
	print(href)
        

        
