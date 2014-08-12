public class List {

    public static void main(String[] args)
    {
        int j=0;
        String [] s = new String [10];
        String str = new String("a b c d e f g h");

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)!=" ")
            {
                s[j]= str.charAt(i);
                j++;
            }
        }

        Iterable<String >  t = new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }
        }
        System.out.println(str.toString());
    }

}
