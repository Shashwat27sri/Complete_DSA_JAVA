public class DividenConquer{
  
    public static void printArr(int arr[]){
      for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");

      }
      System.out.println();
    }
    
    public static void merge(int arr[],int si,int mid,int ei){
      int temp[]=new int [ei-si+1];
      int i=si;
      int j=mid+1;
      int k=0;
      while(i<=mid && j<=ei){
        if (arr[i]<arr[j]){
          temp[k]=arr[i];
          i++;

        }else{
          temp[k]=arr[j];
          j++;
        }
        k++;

      }

      //for leftover elements of 1st sorted part
      while(i<=mid){
        temp[k++]=arr[i++];
      }
      //for leftover element of 2nd sorted part
      while(j<=ei){
        temp[k++]=arr[j++];
      }

      //copy temp to original array
      for (k=0 , i=si ; k<temp.length ;k++,j++){
        arr[i]=temp[k];
      }
    }

    public static void mergeSort( int arr[],int si,int ei){
      if (si>=ei){
        return;
      }
      int mid =si+(ei-si)/2;
      mergeSort(arr,si,mid);
      mergeSort(arr,mid+1,ei);

      merge(arr,si,mid,ei);
    }
    
    public static void main(String args[]){
      int arr[]={6,3,9,5,2,8};
      mergeSort(arr,0,arr.length);
      printArr(arr);
    }
  
}


















// public class DividenConquer{                                     //Sorted and Rotated Array Search  (modified Binary Search)
//   public static int search(int arr[],int tar,int si,int ei){
//     if (si>ei){
//       return -1;

//     }

//     //kaam
//     int mid =si+(ei-si)/2;

//     //case found
//     if (arr[mid ]==tar){
//       return mid;

//     }

//     //mid on L1
//     if (arr[si]<=arr[mid]){
//       //case a: left
//       if (arr[si]<=tar && tar <= arr[mid]){
//         return search(arr,tar,si,mid-1);//mid - 1 as we already checked
//       }else{
//         // case b: right
//         return search(arr,tar,mid+1,ei);
//       }

//     }else{             //mid on L2
//       //case c: right
//       if(arr[mid]<=tar && tar<=arr[ei]){
//         return search(arr,tar,mid+1,ei);

//       }else{
//         // case d: left
//         return search(arr,tar,si,mid-1);
//       }

//     }
//   }
  
  
//   public static void main (String args[]){
//     int arr[]={4,5,6,7,0,1,2};
//     int target=0;
//     int tarIdx = search(arr,target,0,arr.length-1);
//     System.out.println(tarIdx);
//   }
// }