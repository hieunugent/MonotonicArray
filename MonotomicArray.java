class MonotomicArray{
  public static boolean isMonotomic(int [] array){
    boolean isNonDecrease = true;
    boolean isNonIncrease = true;
    for (int i = 1; i < array.length ; i++){
      if (array[i-1] < array[i]){
        isNonIncrease = false;
      }
      if(array[i-1] >array[i]){
        isNonDecrease = false;

      }

    }
    return isNonDecrease || isNonIncrease;
  }
}
