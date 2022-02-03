public class RobotRunner {
	
	public static void main(String[] args) {
		int x=3,y=3;
		String[] pov= {"2","2","E"};
		String[] mov= {"R","M","L","M","L","M"};
		int xx=Integer.parseInt(pov[0]), yy=Integer.parseInt(pov[1]);
		String d=pov[2];
		String r="";
		String s="";
		int f=0;
		for(String i:mov) {
			if(i.equals("M")){
				int ix=xx,iy=yy;
				if(d.equals("N"))
					yy++;
				else if(d.equals("S"))
					yy--;
				else if(d.equals("E"))
					xx++;
				else if(d.equals("W"))
					xx--;
				if(xx>x || yy>y || xx<0 || yy<0) {
					r=String.valueOf(ix)+"-"+String.valueOf(iy)+"-"+d+"-ER";
					f=1;
				}
			}
			else if(i.equals("L")) {
				if (d.equals("N"))
					d="W";
				else if(d.equals("S"))
					d="E";
				else if(d.equals("E"))
					d="N";
				else if(d.equals("W"))
					d="S";
			}
			else if(i.equals("R")) {
				if (d.equals("N"))
					d="E";
				else if(d.equals("S"))
					d="W";
				else if(d.equals("E"))
					d="S";
				else if(d.equals("W"))
					d="N";
			}
		}
		s=String.valueOf(xx)+"-"+String.valueOf(yy)+"-"+d;
		if(f==1)
		System.out.println(r);
		else
		System.out.println(s);
	}

}
