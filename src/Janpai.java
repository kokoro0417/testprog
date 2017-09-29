
public class Janpai {
	private String painame = " ";
	private String paiC = "non";
	private String paisyu = "non";

	Janpai(){
		this.painame = "_";
	}

	Janpai(int p){
		this.painame = neming(p);
	}

	public String getPainame(){
		return painame;
	}

	public String getPaiC(){
		return paiC;
	}

	public String getPaisyu(){
		return paisyu;
	}

	public String neming(int pn){
		String paiN = "_";
		int check = 0;

		if(pn < 37){
			for(int i=0;i<9;i++){
				for(int r=1;r<5;r++){
					check = (i*4)+r;
					if(pn == check){
						paiN = "m"+(i+1);
						paiC = "mon";
						if(i==0||i==8){
							paisyu = "yao";
						}else{
							paisyu = "chn";
						}
					}
				}
			}
		}else if(pn < 73){
			for(int i=0;i<9;i++){
				for(int r=1;r<5;r++){
					check = (i*4)+r+36;
					if(pn == check){
						paiN = "p"+(i+1);
						paiC = "pin";
						if(i==0||i==8){
							paisyu = "yao";
						}else{
							paisyu = "chn";
						}
					}
				}
			}
		}else if(pn < 109){
			for(int i=0;i<9;i++){
				for(int r=1;r<5;r++){
					check = (i*4)+r+72;
					if(pn == check){
						paiN = "s"+(i+1);
						paiC = "soh";
						if(i==0||i==8){
							paisyu = "yao";
						}else{
							paisyu = "chn";
						}
					}
				}
			}
		}else{
			for(int i=0;i<7;i++){
				for(int r=1;r<5;r++){
					check = (i*4)+r+108;
					if(pn == check){
						String ji="";
						switch((i+1)){
							case 1:
								ji="ton";
								break;
							case 2:
								ji="nan";
								break;
							case 3:
								ji="sya";
								break;
							case 4:
								ji="pei";
								break;
							case 5:
								ji="hak";
								break;
							case 6:
								ji="hat";
								break;
							case 7:
								ji="chn";
								break;
							default:
								ji="err";
						}
						paiN = ji;
						paiC = "ji";
						paisyu = "yao";
					}
				}
			}
		}
		return paiN;
	}


}
