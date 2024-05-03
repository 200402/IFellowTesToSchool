package Task_2;

public class DuplicateCharacter {

    static public void work(String word){
        int count=0,len=0;
        do
        {
            try
            {
                char name[]=word.toCharArray();
                len=name.length;
                count=0;
                for(int j=0;j<len;j++)
                {
                    if((name[0]==name[j]))
                        count++;
                }
                if(count!=1)
                    System.out.println("Буква "+name[0]+" повторилась "+count+" раз");
                word=word.replace(""+name[0],"");
            }
            catch(Exception ex){}
        }
        while(len!=1);

    }

    static public void work(){
        work("Hello");
    }
}
