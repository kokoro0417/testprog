import java.util.Calendar;

public class Inputtest {
	public static void main(String[] args){

		Calendar time = Calendar.getInstance();

		int t = time.get(Calendar.MILLISECOND);

		System.out.println(t);

		if(t != 700){
			System.out.println("700ではない");
		}

		if(t >= 500){
			System.out.println("500以上");

			if(t < 800){
				System.out.println("800未満");
			}else{
				System.out.println("800以上");
			}

		}else if(t < 250){
			System.out.println("250未満");
		}

		int no =t;

		while(no > 9){

			if(no > 9 && no < 100){
				no = no-10;
			}

			if(no > 99){
				no = no-100;
			}

		}

		System.out.println(no);
		String notxt = "";

		switch(no){
		case 1:
		case 5:
			notxt="春";
			break;
		case 2:
		case 6:
			notxt="夏";
			break;
		case 3:
		case 7:
			notxt="秋";
			break;
		case 4:
		case 8:
			notxt="冬";
			break;
		default:
			notxt="例外";

		}

		System.out.println(notxt);

		if(notxt.equals("例外")){
			System.out.println("么九牌");
		}

		int no2 =t;
		no2++;

		if(no2>137){
			while(no2>137){
				no2 = no2-136;
			}

		}
		System.out.println(no2);

		Janpai janpai = new Janpai(no2);

		System.out.println(janpai.getPainame());

	}

}
