public class ForEach {
    public static void main (String[] args){
        String[]st = new String[1];
        st[0]= "Cat";
        st[1]= "Dog";
        for(String sw:st){
            StringBuilder result = new StringBuilder();
            result.append(sw);
            System.out.print(result.toString());
        }
    }
}
