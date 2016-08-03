public Difference(int[] elements)
    {
        this.elements=elements;
    }
    public void computeDifference()
    {
       int maxarray[]=new int[(elements.length*elements.length)];
       int u=0;
       for(int r=0;r<(elements.length*elements.length);r++)
       {
           maxarray[r]=0;
       } 
       for(int i=0;i<elements.length;i++)
       {
       for(int j=0;j<elements.length;j++)
       {
        int difference=elements[i]-elements[j];
        int actualDifference=Math.abs(difference);
        maxarray[u++]=actualDifference;
       }
       }
       Arrays.sort(maxarray);
       maximumDifference=maxarray[u-1];
    }
