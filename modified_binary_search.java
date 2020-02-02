import java.util.Scanner;
class modified_binary_search{
   static public void main(String[] args){
      Scanner input=new Scanner(System.in);//Declearing Scanner object
      int i,j,key,n,low,high,mid;//Declearing the elements
      System.out.println("Enter the size of the array");
      n=input.nextInt();//Taking the size of array from user
      int a[]=new int[n];//Declearing the array
      System.out.println("Enter the elements to the array");
      for(i=0;i<a.length;i++)
         a[i]=input.nextInt();//Taking the array elements from user
      System.out.println("The elements you entered");
      for(i=0;i<a.length;i++)
         System.out.print(a[i]+"  ");//Displaying the elements user entered
      System.out.println();
      for(i=0;i<a.length;i++)//Sorting the array
         for(j=i+1;j<a.length;j++)
            if(a[i]>a[j])
               a[j]=a[i]+(a[i]=a[j])*0;//Swapping the contant
      System.out.println("The array after sorting");
      for(i=0;i<a.length;i++)
         System.out.print(a[i]+"  ");//Displaying the array after sorting
         System.out.println();
      System.out.println("Enter the element to be found");
      key=input.nextInt();//Taking the input of element to be found from user
      low=0;high=n-1;//BINARY SEARCH
      while(high>low)
      {
         mid=(low+high)/2;
         if(a[low]<key || a[high]>key){
            if(a[low]==key){
               System.out.println("The elemet found1 at"+low);
                  return;}
               if(a[high]==key){
                  System.out.println("The elemet found1 at"+high);
                     return;}
                  if(a[mid]==key)
                     {
                        System.out.println("The element found at="+mid);
                        return;
                     }
                  else
                     {
                        if(a[mid]>key)
                           high=mid-1;
                        else
                           if(a[mid]<key)
                           low=mid+1;
                     }
         }
      }
      System.out.println("The element not found");
   }
}
