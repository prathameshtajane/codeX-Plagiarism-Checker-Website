import requests


url = "https://en.wikipedia.org/wiki/Tropical_cyclone"
code = requests.get(url)
text = code.text
soup = BeautifulSoup(text)
for link in soup.findAll('a', {'class':'name'}):
        href = 'https://en.wikipedia.org/wiki/Tropical_cyclone' + link.get('href')
        fob = open('C:\Python\program.txt', 'w')
        fob.write(href + '\n')