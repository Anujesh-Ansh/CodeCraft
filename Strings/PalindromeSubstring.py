
def lingp(s):
    if s==s[::-1]:
        return s
    left= lingp(s[1:])
    right = lingp(s[:-1])
    if len(left)>len(right):
        return left
    else:
        return right
str1="babada"
print(lingp(str1));