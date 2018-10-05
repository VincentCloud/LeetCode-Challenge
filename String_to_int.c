#include <stdio.h>
#include <math.h>
#include <limits.h>

int StringToInt(const char *str){

	const char *p=str;
	int result = 0;
	int digit ;
	int sign=0;	

	while(*p==' ')
		++p;
	

	if (*p=='-'){
		sign = 1;
		++p;
	}

	else if (*p=='+'){
		++p;
	}


	while (*p>='0'&& *p<='9' && *p!='\0'){
		digit = *p -'0';

		if (result > INT_MAX /10){
			return sign? INT_MIN: INT_MAX;
		}

		else if(result == INT_MAX/10){

			if (sign && digit> 8){
				return INT_MIN;

			}
			if (!sign && digit>7){
				return INT_MAX;
			}
		}
			result = result *10+ digit;

			++p;

		

		}
		if (sign){
			result = -result;

	}
	
	// printf("%d \n",result);
	return result;
}

int main(int args, char *argv[]){

	int f = StringToInt(argv[1]);
	printf("%d", f);

}