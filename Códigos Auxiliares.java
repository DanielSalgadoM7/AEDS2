public class Auxiliares{
  public static void main(String[] args){
    
    //código de inserção
    for(int i = 1; i < n; i++){
      int temp = array[i];
      int j = i-1;
      while(j>=0 && array[j] > temp){
        array[j+1] = array[j];
        j--;
      }
      array[j+1] =  temp;
    }

    //código de bolha
    for(int rep = 0; rep < n-1; rep++){
      for(int b = 0; b < n; b++){
        if(array[b] > array[b+1]{
          temp = array[b];
          array[b] = array[b+1];
          array[b+1] = temp;
        }
      }
    }


    
  }
}
