package abstraction;

public class VideoSearch extends Google
{
    public void search()
    {
    	System.out.println("Video searching");
    }


	public static void main(String[] args) 
	{
		VideoSearch obj = new VideoSearch();
		obj.search();
		ImageSearch is =new ImageSearch();
		is.search();
		
		

	}

}
