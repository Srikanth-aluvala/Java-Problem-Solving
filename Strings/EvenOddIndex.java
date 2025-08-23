// To Count even and odd digits in String

class EvenOddIndex {
    public static void main(String[] args) {
       String st="54378";
       int evencount=0;
       int oddcount=0;

       char arr[]=st.toCharArray();

       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]%2==0)
           {
               evencount++;
           }
           else
           {
               oddcount++;
           }
       }
       System.out.println("Even:"+evencount);
       System.out.println("Odd:"+oddcount);

    }
}