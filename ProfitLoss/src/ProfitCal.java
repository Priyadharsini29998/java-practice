
public class ProfitCal {

		int dozens, rate, sellprice;
		float costprice, profit, propercent;

		public void setDozens(int dozens) {
			this.dozens = dozens;
		}

		public void setRate(int rate) {
			this.rate = rate;
		}

		public void setSellprice(int sellprice) {
			this.sellprice = sellprice;
		}
		
		

		public void calProfit() {
			costprice = rate / 12;
			profit = sellprice - costprice;
			propercent = (profit / costprice) * 100;

		}

		public void display() {
			
			System.out.printf("Sam's profit percentage is %.2f percent", propercent);

		}
	}


