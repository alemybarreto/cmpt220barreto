package lab10;
import java.util.Arrays;

public class Problem4 {
	
	public static void main(String[] args) {
		String[] colors = {"black", "grey", "white"};
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
		
		Appliance[][] newAppliance = null;
		Appliance[] appliance = newAppliance[40];
		for (int i = 0; i<40; i++) {
			if (i < 16) {
				appliance[i] = new TV(Math.random()* 400, colors[(int) (Math.random()*3)], months[(int) (Math.random()*12)], (int)(Math.random()*200));	
			}
			if (i >=16 && i< 30) {
				appliance[i] = new Telephone(Math.random()* 200, colors[(int) (Math.random()*3)], months[(int) (Math.random()*12)], (int)(Math.random()*400));	
			}
			if (i >= 30 && i < 40) {
				appliance[i] = new Toaster(Math.random()* 100, colors[(int) (Math.random()*3)], months[(int) (Math.random()*12)], (int)(Math.random()*40));	

			}
		}
	}

}
