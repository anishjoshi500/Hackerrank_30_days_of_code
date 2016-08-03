class Calculator
{
    static int power(int n,int p)throws Exception
    {
    int answer=(int) Math.pow(n,p);
    if(n>=0 && p>=0)
    {
    return answer;
    }
    else
    {
    throw new Exception("n and p should be non-negative");
    }
 }
}
