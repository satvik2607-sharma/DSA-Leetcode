def isAnagram(s:str, t:str)->bool:
    if len(s) != len(t):
        return False
    
    countS,countT={},{}
    
    for i in range(len(s)):
        countS[s[i]] =1+countS.get(s[i],0)
        countT[t[i]] =1+countT.get(t[i],0)
    for x in range(len(countS)):
        if countS[x] != countT.get(x,0):
            return False
    return True

s="rat"
t="car"

ans=isAnagram(s,t)
print(ans)