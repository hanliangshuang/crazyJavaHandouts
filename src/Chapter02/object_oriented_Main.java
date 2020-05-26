package Chapter02;

public class object_oriented_Main {
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean bo;
	

	public static void main(String []args) {
		//Java的8中基本数据类型
		getBasicDataType();
		

	}

	/**
	 * Java的8中基本数据类型
	 */
	private static void getBasicDataType() {
		// TODO Auto-generated method stub
		System.out.println("byte的位数："+Byte.SIZE
				+";默认值："+b
				+";数据范围："+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		
		System.out.println("short的位数："+Short.SIZE
				+";默认值："+s
				+";数据范围："+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		
	      System.out.println("int的位数："+Integer.SIZE
	              +";默认值："+i
	              +";数据范围："+Integer.MIN_VALUE+" - "+Integer.MAX_VALUE);

	      System.out.println("long的位数："+Long.SIZE
	              +";默认值："+l
	              +";数据范围："+Long.MIN_VALUE+" - "+Long.MAX_VALUE);

	      System.out.println("float的位数："+Float.SIZE
	              +";默认值："+f
	              +";数据范围："+Float.MIN_VALUE+" - "+Float.MAX_VALUE);

	      System.out.println("double的位数："+Double.SIZE
	              +";默认值："+d
	              +";数据范围："+Double.MIN_VALUE+" - "+Double.MAX_VALUE);

	      System.out.println("char的位数："+Character.SIZE
	              +";默认值："+c
	              +";数据范围："+Character.MIN_VALUE+" - "+Character.MAX_VALUE);

	      System.out.println("boolean的位数："+Byte.SIZE
	              +";默认值："+bo
	              +";数据范围："+Byte.MIN_VALUE+" - "+Byte.MAX_VALUE);
		
	}

}
