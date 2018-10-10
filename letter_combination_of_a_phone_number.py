def letterCombinations(self, digits):
    """
    :type digits: str
    :rtype: List[str]
    """
    dic = {
        '2': 'abc',
        '3': 'def',
        '4': 'ghi',
        '5': 'jkl',
        '6': 'mno',
        '7': 'pqrs',
        '8': 'tuv',
        '9': 'wxyz'
    }

    result =[]

    for ltr in dic[digits[0]]:
        result.append(ltr)
    for i in range(1,len(digits)):
        result+=[j+s for j in dic[digits[i]] for s in result]

    return result






