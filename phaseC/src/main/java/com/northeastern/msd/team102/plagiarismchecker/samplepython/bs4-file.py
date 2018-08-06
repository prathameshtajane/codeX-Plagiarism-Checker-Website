import requests


url = "https://en.wikipedia.org/wiki/Tropical_cyclone"
code = requests.get(url)
text = code.text
soup = BeautifulSoup(text, 'html.parser')
for link in soup.findAll('a'):
        href=link.get('href')
        fob = open('C:\Python\program1.txt', 'a+')
        fob.write(href + '\n')
