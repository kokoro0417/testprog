import java.util.Calendar;
import java.util.Random;

public class ArryShuffle {
	//【引数の要素数を持つ配列を生成し、1から引数までの数値を入力し、その配列をシャッフルするクラス】

	int intarry[];
//	String strarry[];
	Calendar time = Calendar.getInstance();
	Random rnd = new Random();
	int t = time.get(Calendar.MILLISECOND);

	ArryShuffle(){
		this.intarry = ishuffle(100);//引数未入力なら適当に要素100
	}

	ArryShuffle(int IA){
		this.intarry = ishuffle(IA);
	}

	int[] ishuffle(int inta){//配列シャッフル本体
		int max = inta;//最大値定義
		int intatmp[] =new int[max];//配列定義
		int ran = rnd.nextInt(max);//初期乱数

        System.out.println("----");

        for(int i=0;i<max;i++){//配列連番投入
        	intatmp[i] = i+1;
		}

        System.out.println(t);//msec表示

        int tmp1 = 0;//シャッフル時の現在地確保用
        int tmp2 = 0;//シャッフル時の乱数箇所値確保用
        int tmpR = 0;//回転数とは別に用意するべき配列値
        int Sfl = max;//シャッフル値(ここまでシャッフル)

        //---シャッフル値の決定---
        if(t>(max*3)){//MAX値より3倍以上多かったら半分
        	Sfl = (t/2);
        	System.out.println("t/2="+Sfl);
        }else if(t<max){//最低値より少なかったら最低値上増し
        	Sfl = t+max;
        	System.out.println("t+"+max+"="+Sfl);
        }else{//MAX値＞X＞最低値ならそのまま
        	Sfl = t;
        	System.out.println("t="+Sfl);
        }
        //---シャッフル値の決定---

        for(int r=0;r < Sfl;r++){//シャッフル値になるまで回転し続ける

        	if(r > (max-1) && tmpR > (max-1)){//回転数が要素数より大きい　かつ　配列値が要素数より大きい時
        		tmpR = tmpR-max;//配列値リセット
        	}

        	if(tmpR<max){//シャッフル本体
        		tmp1 = intatmp[tmpR];//現在の値を確保
        		ran = rnd.nextInt(max);//乱数発生
        		tmp2 = intatmp[ran];//乱数箇所の値を確保
        		//--現在の値と乱数箇所の値を入れ替え--
        		intatmp[ran] = tmp1;
        		intatmp[tmpR] = tmp2;
        		//--入れ替えここまで--

        	}else{//tmpRが正しく制限されて無いとき
        		System.out.println("エラー");
        		break;
        	}
        	tmpR++;//配列値更新
        }
		return intatmp;
	}
}
