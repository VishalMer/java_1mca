class ElementCount
{
	public static void main(String[] args)	
	{
		int[] arr={60, 46,60,50,46,10,25,60};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();	

		boolean[] visited=new boolean[arr.length];
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(visited[i] == true)
				continue;
			cnt=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					cnt++;
					visited[j]=true;
				}
			}
			System.out.println("Element "+arr[i]+" occurs : "+cnt+" times");
		}	
	}
}