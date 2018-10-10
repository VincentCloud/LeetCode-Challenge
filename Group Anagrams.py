class Group_Anagrams:
    def groupAnagrams(self,strs):
        """

        :param strs: List[str]
        :return: List[List[str]]
        """
        dic={};
        for string in strs:
            y=''.join(sorted(string))
            if y in dic:
                dic[y].append(string)
            else:
                dic[y]=[string]
        return [dic[x] for x in dic]


