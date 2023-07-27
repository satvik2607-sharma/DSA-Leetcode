
#brute force approach
# def floorSqrt(n):
#     ans=1
#     for i in range(1,n):
#         if i*i <= n:
#             ans=i
#         else:
#             break
#     return ans

# n=27
# print(floorSqrt(n))


#binary search

def floorSqrt(n):
   lo=1
   hi=n
   
   while lo <= hi:
      mid= (lo+hi)//2
      val=mid*mid

      if val <= n:
         lo=mid+1
      else:
         hi=mid-1
   return hi
            
    
n=26
print(floorSqrt(n))