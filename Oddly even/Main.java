n=input()
l=[int(x) for x in n]
even=sum(l[0:len(l):2])
odd=sum(l[1:len(l):2])
print(abs(even-odd))