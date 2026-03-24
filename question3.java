class Solution {
    public List<String> letterCombinations(String digits) 
    {
        List<String> combi = new ArrayList<>();
        String ch[]={"abc","def"."ghi","jkl","mno","pqrs","tuv","wxyz"};
        Char num[]={'2','3','4','5','6','7','8','9'};
        List<String> names = new ArrayList<>();
        for(int i=0;i<digits.length();i++)
        {
            for(int j=0;j<8;j++)
            {
                if(digits.charAt(i)==num[j])
                {
                    combi.add(ch[j]);

                }
                
            }
        }
        for(int i=0,i<combi.size()-1;i++)
        {
            for(int j=0,i<combi.size();j++)
            {
                for(int x=0;x<combi.get(i).length();x++)
                {
                   for(int y=0;x<combi.get(j).length();y++)
                   {
                        char c1 = combi.get(i).charAt(x);      
                        String s1 = c1.toString(); 
                        char c2 = combi.get(j).charAt(y);      
                        String s2 = c1.toString(); 
                        String s=s1+s2;
                        names.add(s);
                   }
                }
            }

        }
        return names;

        
    }
}