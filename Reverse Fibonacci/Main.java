n=int(input())
l=[0,1]
if n==0 or n==1:
  print(0)
else:
  for i in range(2,n):
      l.append(l[i-1]+l[i-2])
  l.reverse()
  s=' '.join(str(x) for x in l)
  print(s)
	