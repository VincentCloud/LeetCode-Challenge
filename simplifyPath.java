
public class simplifyPath {

    public String simplifyPath(String path){
        String[] parts=path.split("/");
        int m=0;
        String result="";
        String first="";

        for(int i=parts.length-1;i>=0;i--){
            if(parts[i].equals("..")) m++;
            else if(!parts[i].equals(".")&&!parts[i].equals("")){
                if(m>0){
                    m--;
                }else{
                    result="/"+parts[i]+result;
                }
            }
        }
        if(result.equals("")) return "/";
        else{
            return result;
        }

    }
}
