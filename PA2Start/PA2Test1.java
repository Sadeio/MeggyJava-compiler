import meggy.Meggy;

 class PA2Test1
{
	public static void main(String[] string1)
	{
		Meggy.setPixel((byte)1,(byte)2,Meggy.Color.RED);
		Meggy.setPixel((byte)2,(byte)3,Meggy.Color.BLUE);
		Meggy.setPixel((byte)3,(byte)4,Meggy.Color.BLUE);
		Meggy.setPixel((byte)4,(byte)5,Meggy.Color.BLUE);
		Meggy.setPixel((byte)5,(byte)6,Meggy.Color.RED);
		Meggy.setPixel((byte)6,(byte)7,Meggy.Color.BLUE);
		Meggy.setPixel((byte)7,(byte)1,Meggy.Color.BLUE);
		Meggy.setPixel((byte)5,(byte)2,Meggy.Color.BLUE);
		Meggy.setPixel((byte)6,(byte)3,Meggy.Color.RED);
		Meggy.setPixel((byte)4,(byte)4,Meggy.Color.BLUE); 
		
	}
}

