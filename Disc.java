
public class Disc 
{
	private int size;
	private Disc nextDisc;
	
	public Disc(int size)
	{
		this.size= size;
		this.nextDisc = null;
	}
	public String toString()
	{
		return "" + this.size + "(" + super.toString() + ")";
	}
	
	public int getSize() 
	{
		return size;
	}

	public void setNextDisc(Disc top) 
	{
		this.nextDisc = top;
	}

	public Disc getNextDisc() 
	{
		return nextDisc;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
