nums=[1,1,2,3,3,3,4,4]
n=len(nums)
for i in range(0,n):
    if n==1:
        print (nums[0])
        for i in range(0,n):
            if i==0:
                if nums[i] != nums[i+1]:
                    print (nums[i])
            if i==n-1:
                if nums[i] != nums[i-1]:
                    print (nums[i])
            else:
                if nums[i] != nums[i+1] and nums[i] != nums[i-1]:
                    print (nums[i])    
        