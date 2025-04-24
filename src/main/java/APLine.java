public class APLine
{
private int m,x,b;
  public APLine(int j, int k, int l){
    int m = j;
    int x = k;
    int b = l;
  }
  public double getSlope(){
    return -1*(double)m/x;
  }
  public boolean isOnLine(int x, int y){
    if((m*(x) + x*(y) + b) == 0)
      return true;
    return false;
  }
}
