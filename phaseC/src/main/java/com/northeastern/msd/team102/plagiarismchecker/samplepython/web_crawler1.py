from bs4 import BeautifulSoup
#import html2text
import requests
import os,sys
from os import path


Max_Url=1000
url_List=[]
max_Depth=6
seed_url="https://en.wikipedia.org/wiki/Tropical_cyclone"

def printUrls():
    f=open("C:\Python\program1.txt",'a+')
    for i in range (0,len(url_List)):
        if(url_List[i]!=null):
            f.write(url_List[i]+ '\n')
def main():
    print("hello")

main()

#def BFS (seed_url,keyword,focused?):
    

#def iscrawlable(url):
    

def web_crawler():
    page=1
    r  = requests.get(seed_url)
    data = r.text
    soup = BeautifulSoup(data, 'html.parser')
    for link in soup.find_all('a', href=True):
        href=link.get("href")
        if "https://en.wikipedia.org/wiki/" in href: 
            print(href)
        
web_crawler()
        
