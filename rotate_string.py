def rotateString(s:str,goal:str)->bool:
    if s==goal:
        return True
    
    s,goal=[*s],[*goal]
    
    for i in range(len(s)):
        a=s[0]
        s.pop(0),s.append(a)
        if s==goal:
            return True
    return False

s="abcde"
goal="abced"

ans=rotateString(s,goal)
print(ans)