public class BoxArry {
	private int box[] = new int [100];
	private String elmt_name[] = new String[100];
	int boxmax = 100;
	int tmpa = 0;
	String tmps ="";
//	int boxOP1[];
//	int boxOP2[];
//	int boxOP3[];


	BoxArry(){

	}

	BoxArry(int a){
		this.box = new int [a];
		this.elmt_name = new String[a];
		boxmax = a;
	}

	public void setBox(int a,int box) {
		tmpa = a;

		if(boxmax <= a){
			System.out.println("BoxArry参照オーバーエラーのため、配列値=0");
			tmpa = 0;
		}
		this.box[tmpa] = box;
	}

	public void setElmt_name(int a,String elmt_name) {
		tmpa = a;

		if(boxmax <= a){
			System.out.println("BoxArry参照オーバーエラーのため、配列値=0");
			tmpa = 0;
		}

		this.elmt_name[tmpa] = elmt_name;
	}

	public int boxelmnt(int a){
		int tmpa = a;

		if(boxmax <= a){
			System.out.println("BoxArry参照オーバーエラーのため、配列値=0");
			tmpa = 0;
		}

		return box[tmpa];
	}

	public String nameelmnt(int a){
		int tmpa = a;

		if(boxmax <= a){
			System.out.println("BoxArry参照オーバーエラーのため、配列値=0");
			tmpa = 0;
		}

		return elmt_name[tmpa];
	}


}
