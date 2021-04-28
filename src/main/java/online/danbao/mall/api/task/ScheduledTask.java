package online.danbao.mall.api.task;

import online.danbao.mall.api.entity.MallLoginLog;
import online.danbao.mall.api.service.MallLoginLogService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @description: 定时任务
 * @author: 蛋宝
 * @since: 2021-04-27
 **/
@Component
public class ScheduledTask {

    @Resource
    private MallLoginLogService mallLoginLogService;

    //@Scheduled(fixedRate = 3000)
    //每天晚上21：10分执行
    @Scheduled(cron="0 02 14 ? * *")
    public void scheduledTask() {
        MallLoginLog mallLoginLog = MallLoginLog.builder()
                .platform("Android")
                .userId(2L)
                .apiUri("/api/task")
                .createTime(new Date())
                .build();
        mallLoginLogService.saveLog(mallLoginLog);
        System.out.println("任务执行时间：" + LocalDateTime.now());

    }
}