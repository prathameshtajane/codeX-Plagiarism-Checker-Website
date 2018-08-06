from bs4 import BeautifulSoup
#import html2text
import requests
import os,sys
from os import path

#url = raw_input(" ")

r  = requests.get("https://en.wikipedia.org/wiki/Tropical_cyclone")
data = r.text
soup = BeautifulSoup(data, 'html.parser')
count=0
Count1=0
list=[]
Vlist=[]
#soup.get_text()
for i in range [0 1000]:
    for link in soup.find_all('a'):
        
        
            
print(Count1)
print(count)
        


#soup.find_all("html body")
#print(soup.find_all('p', class_='outer-text'))
#print(soup.prettify())
#txt = soup.find('div', {'class' : 'body'})

#print(txt)
'''href ="https://en.wikipedia.org/wiki/"+ link.get("href")
        if "#" in href:
            f1=open("C:\Python\program1.txt",'a+')
            f1.write(link["href"]+'\n')
            f1.close()
            Count1 +=1
        if ":" not in href:
            f=open("C:\Python\program.txt",'a+')
            f.write(link["href"]+'\n')
            f.close()'''
            count += 1
