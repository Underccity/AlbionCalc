package underccity.albion.restservice;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import google.SheetsUtil;

@Component
public class ScheduledTasks {
	
	 @Scheduled(fixedRate = 5000)
	    public void startbatchUpdate() throws Exception {
	        SheetsUtil.sendBatchToSheet();
	    }

}
