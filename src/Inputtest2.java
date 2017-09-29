public class Inputtest2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		ArryShuffle janyama = new ArryShuffle(136);

        Janpai[] yamaP = new Janpai[136];


        for(int i=0;i<136;i++){
        	yamaP[i]= new Janpai(janyama.intarry[i]);

        }

        for(int i=0;i<13;i++){
        	System.out.print(yamaP[i].getPainame() + " ");
        }

//        System.out.println("");
//        System.out.println("");
//
//        ArryShuffle Mdeck = new ArryShuffle(60);
//
//        for(int i=0;i<7;i++){
//        	System.out.print(Mdeck.intarry[i] + " ");
//        }
//        System.out.println("");
//
//        ArryShuffle Odeck = new ArryShuffle(60);
//        for(int i=0;i<7;i++){
//        	System.out.print(Odeck.intarry[i] + " ");
//        }

        System.out.println("");
        System.out.println("");


        BoxArry mytehai = new BoxArry(14);

        for(int i=0;i<13;i++){
        	mytehai.setBox(i,janyama.intarry[i]);
        	mytehai.setElmt_name(i, yamaP[i].getPainame());
        }

        int tmpB[] = new int[13];
        String tmpBS[] =new String[13];

        for(int i=0;i<13;i++){
        	tmpB[i] = mytehai.boxelmnt(i);
        	tmpBS[i] = mytehai.nameelmnt(i);
        }


        //	tmpB = mytehai.getBox(); !!オブジェクトのフィールド変数ごと返すとすべて紐付く!!
        // mytehai.getElmt_name();!!オブジェクトのフィールド変数ごと返すとすべて紐付く!!
    	int rank[] = new int[13];

        for(int i=0;i<13;i++){
        	for(int r=0;r<13;r++){

        		if(tmpB[i]>tmpB[r]){
        			rank[i]++;

        		}
        	}

        }

        //int tmpBB[] = new int[13];
        for(int i=0;i<13;i++){
        	//tmpB[rank[i]] = mytehai.boxelmnt(i);
        	mytehai.setBox(rank[i], tmpB[i]);
        	//tmpBS[rank[i]] = mytehai.nameelmnt(i);
        	mytehai.setElmt_name(rank[i], tmpBS[i]);
        }

        for(int i=0;i<13;i++){
        	//String temp[] = mytehai.getElmt_name();
        	System.out.print(mytehai.nameelmnt(i) + " ");
        }



	}

}
