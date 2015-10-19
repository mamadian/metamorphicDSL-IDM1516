import urllib.request

host = "https://www.univ-rennes1.fr/"
page = "index.html"

result = urllib.request.urlopen(host + page).read()

print(result)
