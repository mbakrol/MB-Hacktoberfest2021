import java.io.BufferedReader;
import  java.io.InputStreamReader;
class PassOrFail{	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuffer sf = new StringBuffer();
		while(t-- != 0){
			int n= Integer.parseInt(br.readLine());
			int a=0,b=0;
			for(int i=0;i<n;i++){
				String[] str = br.readLine().split("\\s");
				a += Integer.parseInt(str[0]);
				b += Integer.parseInt(str[1]);
			}
			if(a>b/2)
				sf.append("Pass\n");
			else
				sf.append("Fail\n");
		}
		System.out.println(sf);
	}
}
