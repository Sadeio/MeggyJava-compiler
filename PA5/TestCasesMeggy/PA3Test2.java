import meggy.Meggy;

class PA3Test2
{
	public static void main(String[] string1)
	{
		Meggy.setPixel((byte)(5),(byte)3,Meggy.Color.WHITE);
		if(true)
		{
			Meggy.setPixel((byte)(8-3),(byte)3,Meggy.Color.BLUE);
		}		
		else
		{
			if(Meggy.getPixel((byte)5,(byte)3) == Meggy.Color.BLUE)
			{
				Meggy.delay(300);
			}
			if(1 == -2)
			{}
			if(!false)
			{}
		}
	}
}
