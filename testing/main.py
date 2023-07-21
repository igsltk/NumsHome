import requests
import json

#====================SUM====================
url = "http://localhost:8080/api/sum?a=20&b=20"
response = requests.get(url)
data = response.json()
print(json.dumps(data, indent=4))
#====================SUM====================
#====================SUB====================
url = "http://localhost:8080/api/sub?a=45&b=5"
response = requests.get(url)
data = response.json()
print(json.dumps(data, indent=4))
#====================SUB====================
#====================DIV====================
url = "http://localhost:8080/api/div?a=100&b=10"
response = requests.get(url)
data = response.json()
print(json.dumps(data, indent=4))
#====================DIV====================
#====================MOD====================
url = "http://localhost:8080/api/mod?a=68&b=2"
response = requests.get(url)
data = response.json()
print(json.dumps(data, indent=4))
#====================MOD====================



#====================COS====================
url = "http://localhost:8080/api/cos?a=25"
response = requests.get(url)
data = response.json()
print(json.dumps(data, indent=4))
#====================COS====================
#====================SIN====================
url = "http://localhost:8080/api/sin?a=25"
response = requests.get(url)
data = response.json()
print(json.dumps(data, indent=4))
#====================SIN====================
#====================TAN====================
url = "http://localhost:8080/api/tan?a=25"
response = requests.get(url)
data = response.json()
print(json.dumps(data, indent=4))
#====================TAN====================
#====================CTAN===================
url = "http://localhost:8080/api/ctan?a=25"
response = requests.get(url)
data = response.json()
print(json.dumps(data, indent=4))
#====================CTAN===================