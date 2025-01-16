int getXor(int*, int);

int xorAllNums(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    if(nums1Size % 2 == 0 && nums2Size % 2 == 0) return 0;
    else if(nums1Size % 2 == 0) return getXor(nums1, nums1Size);
    else if(nums2Size % 2 == 0) return getXor(nums2, nums2Size);
    else return getXor(nums1, nums1Size) ^ getXor(nums2, nums2Size);
}

int getXor(int* arr, int size) {
    int result = arr[0];
    for(int i = 1; i < size; ++i) {
        result ^= arr[i];
    }
    return result;
}