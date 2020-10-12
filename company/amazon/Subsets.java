class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res = [[]]
        for num in sorted(nums):
            res += [curr + [num] for curr in res]
        res_set = set(tuple(x) for x in res) #need to convert the inner lists to tuples so they are hashable
        return [list(x) for x in res_set] #Now convert tuples back into lists
        
"""
                with duplicates
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = [[]]
        
        for num in nums:
            res += [i + [num] for i in res]
        return res

"""
