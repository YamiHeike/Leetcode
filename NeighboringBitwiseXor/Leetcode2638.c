#include<stdbool.h>

bool doesValidArrayExist(int* derived, int derivedSize) {
    int xorSum = derived[0];
    for(int i = 1; i < derivedSize; i++) {
        xorSum ^= derived[i];
    }
    return xorSum == 0;
}