class container_with_most_water:
    def maxArea(self, height):
        """

        :type height: List[int]
        :return: int
        """
        areas=[]
        if len(height) ==2:
            return min(height[0],height[1])
        elif len(height) == 3:
            return max(min(height[0],height[1]),min(height[0],height[2])*2,min(height[1],height[2]))
        else:
            j=0
            i=0
            for i in range(0,len(height)):
                for j in range(i+1,len(height)):
                    area = (j-1)*min(height[i],height[j])
                    areas.append(area)

            return max(areas)
