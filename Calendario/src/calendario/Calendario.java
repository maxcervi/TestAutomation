package calendario;

public class Calendario {
	
	private int giorno;
	private int mese;
	private int anno;
	
	
	
	public Calendario(int giorno, int mese, int anno) {
		super();
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
	}



	public Calendario() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getGiorno() {
		return giorno;
	}



	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}



	public int getMese() {
		return mese;
	}



	public void setMese(int mese) {
		this.mese = mese;
	}



	public int getAnno() {
		return anno;
	}



	public void setAnno(int anno) {
		this.anno = anno;
	}



	public String calend(int giorno, int mese, int anno)
	{
		if (giorno  > 31 || giorno < 1)
			return("Errore");
		
		if (mese <= 2)
		{
			mese = mese + 12;
			anno--;
		}
		
		int f1 = anno / 4;
		int f2 = anno / 100;
		int f3 = anno / 400;
		int f4 = (int)(2 * mese + (0.6 * (mese +1)));
		int f5 = anno + giorno + 1;
		int x = f1 - f2 + f3 + f4 + f5;
		int k = x / 7;
		int n = x - k * 7;
		
		if (n == 1) return "Lunedi";
		else if (n == 2) return "Martedi";
		else if (n == 3) return "Mercoledi";
		else if (n == 4) return "Giovedi";
		else if (n == 5) return "Venerdi";
		else if (n == 6) return "Sabato";
		else if (n == 0) return "Domenica";
		else return("Errore");
	}

}
