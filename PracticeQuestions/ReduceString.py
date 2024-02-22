str1=input()
dic=dict()
str2=""
for a in str1:
    if a not in dic:
        dic[a]=1
    else:
        dic[a]+=1
for b in dic.keys():
    if dic[b]!=1:
        str2+=str(b)+str(dic[b])
    else:
        str2+=b
print(str2)