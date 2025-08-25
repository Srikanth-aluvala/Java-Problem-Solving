// To Count number of vowels and consonants in string

class VowelorConso {
    public static void main(String[] args) {
        String st="VEnKanna";
        int vowel=0;
        int conso=0;
      
      char arr[]=st.toCharArray();
      for(int i=0;i<arr.length;i++)
      {
          char ch=Character.toLowerCase(arr[i]);
          if(ch=='a'||ch=='o'||ch=='u'||ch=='e'||ch=='i' )
          {
              vowel++;
          }
          else
          {
              conso++;
          }
      }
    System.out.println("vowels:"+vowel);
    System.out.println("consonents:"+conso); 
    }
}