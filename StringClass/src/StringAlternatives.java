
public class StringAlternatives {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("dfs"); //unlike String class this StringBuffer must me initialized like this
		System.out.println(sb.append(" duh"));
		sb.setCharAt(2, 'r'); //StringBuffer can be modified
		System.out.println(sb);
		//while using multi-threads StringBuffer will perform slow, in this case StringBuilder is preferred.
		StringBuilder sbb=new StringBuilder("SE");
		System.out.println(sbb);
	}

}
