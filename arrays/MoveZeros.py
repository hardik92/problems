"""
https://leetcode.com/problems/move-zeroes/
"""


def moveZeros(nums):
    zero = 0
    for i in range(len(nums)):
        if nums[i] != 0:
            nums[zero], nums[i] = nums[i], nums[zero]
            zero += 1
