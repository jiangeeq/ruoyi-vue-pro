package cn.iocoder.yudao.server.framework.tip.core;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 项目启动成功后，提供文档相关的地址
 */
@Component
@Slf4j
public class TipApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ThreadUtil.execute(() -> {
            ThreadUtil.sleep(1, TimeUnit.SECONDS); // 延迟 1 秒，保证输出到结尾
            log.info("\n----------------------------------------------------------\n\t" +
                            "项目启动成功！\n\t" +
                            "接口文档: \t{} \n\t" +
                            "开发文档: \t{} \n\t" +
                            "视频教程: \t{} \n\t" +
                            "源码解析: \t{} \n" +
                            "----------------------------------------------------------",
                    "https://mtw.so/6w48hX",
                    "https://doc.iocoder.cn",
                    "https://t.zsxq.com/02Yf6M7Qn",
                    "https://t.zsxq.com/02B6ujIee");
        });
    }

}
