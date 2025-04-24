public class APLine
{
private int m, int x, int b;
  public APLine(int j, int k, int l){
    int m = j;
    int x = k;
    int b = l;
  }
  public double getSlope(){
    return (double)m/x;
  }
  public boolean isOnline(int x, int y){
    if((a(x) + b(y) + c) == 0)
      return true;
    return false;
  }
}
