import java.util.Date;
import java.util.TimerTask;

public class DateTask extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println("Task 執行時間：" + new Date());

	}

}
